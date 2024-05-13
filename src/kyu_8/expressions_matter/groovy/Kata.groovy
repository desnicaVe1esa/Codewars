package kyu_8.expressions_matter.groovy;

class Kata {
  static def expressionMatter(a, b, c) {
      int result = 0;
      if (a + b + c > result) {
          result = a + b + c;
      }
      if ((a + b) * c > result) {
          result = (a + b) * c;
      }
      if (a * (b + c) > result) {
          result = a * (b + c);
      }
      if (a * b * c > result) {
          result = a * b * c;
      }
      return result;
  }
}