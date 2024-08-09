#include <string.h>
#define  NWORDS  32
long parse_int (const char* number) {
  enum action {no, plus, multplus, mult};
  struct word {char chars[10]; int num; enum action todo;};
  const struct word words[NWORDS] = {
    {"and",      0,       no},
    {"zero",     0,       no},
    {"one",      1,       plus},
    {"two",      2,       plus},
    {"three",    3,       plus},
    {"four",     4,       plus},
    {"five",     5,       plus},
    {"six",      6,       plus},
    {"seven",    7,       plus},
    {"eight",    8,       plus},
    {"nine",     9,       plus},
    {"ten",      10,      plus},
    {"eleven",   11,      plus},
    {"twelve",   12,      plus},
    {"thirteen", 13,      plus},
    {"fourteen", 14,      plus},
    {"fifteen",  15,      plus},
    {"sixteen",  16,      plus},
    {"seventeen",17,      plus},
    {"eighteen", 18,      plus},
    {"nineteen", 19,      plus},
    {"twenty",   20,      plus},
    {"thirty",   30,      plus},
    {"forty",    40,      plus},
    {"fifty",    50,      plus},
    {"sixty",    60,      plus},
    {"seventy",  70,      plus},
    {"eighty",   80,      plus},
    {"ninety",   90,      plus},
    {"hundred",  100,     multplus},
    {"thousand", 1000,    mult},
    {"million",  1000000, mult}
  };
  char *token;
  long rez, part;
  int iw;

  char buf[strlen(number)+1];
  strcpy(buf, number);
  rez = part = 0;
  token = strtok(buf, " -");
  while (token){
    for (iw=0 ; iw<NWORDS; iw++)
      if (!strcmp(token, words[iw].chars)) break;
    if (iw<NWORDS) {
      switch (words[iw].todo) {
        case plus: part += words[iw].num; break;
        case multplus: part *= words[iw].num; break;
        case mult: rez += part*words[iw].num; part = 0; break;
      };
    }
    token = strtok(NULL, " -");
  }
  rez += part;
  return rez;
}