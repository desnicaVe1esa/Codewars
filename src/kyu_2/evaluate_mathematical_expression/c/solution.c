#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef const char* string;

string token;
void skip (int n, int (*equal) (int)) { while (n-- && *token) ++token; while (equal (*token)) ++token; }
void ws (int n) { skip (n, isblank); }

double val ();

double calcMultiplicative (double left) {
  ws (0);
  if (*token=='*') {
    ws (1); return calcMultiplicative (left * val());
  } else if (*token=='/') {
    ws (1); return calcMultiplicative (left / val());
  }
  return left;
}

double calcAdditive (double left) {
  ws (0);
  while (strchr ("+-*/", *token)) {
    if (*token=='*' || *token=='/')
      left = calcMultiplicative (left);
    if (*token=='+') {
      ws (1); left += calcMultiplicative (val ());
    } else if (*token=='-') {
      ws (1); left -= calcMultiplicative (val ());
    } else break;
  }
  return left;
}

double calcExpr () {
  ws (1);
  double v = calcAdditive (val ());
  ws (0); ++token;
  return v;
}

double val () {
  if (*token=='(') {
    return calcExpr ();
  } else if (*token=='-') {
    ++token;
    return -val ();
  } else {
    char* e; double v = strtod (token, &e); token = e;
    return v;
  }
}

double calculate (string expression) {
  token = expression; ws (0);
  return calcAdditive (val ());
}