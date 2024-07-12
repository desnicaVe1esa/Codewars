#include <stdio.h>

char *time_math(char *time3, const char *time1, char op, const char *time2)
{
    int h1, h2, m1, m2, s1, s2, t3;
    sscanf(time1, "%d:%d:%d", &h1, &m1, &s1);
    sscanf(time2, "%d:%d:%d", &h2, &m2, &s2);
    t3 = (3600 * h1 + 60 * m1 + s1) +
         ('+' == op ? 1 : -1) *
         (3600 * h2 + 60 * m2 + s2);
    if ( t3 < 0 ) t3 += 86400;
    sprintf(time3, "%02d:%02d:%02d", t3 / 3600 % 24, t3 % 3600 / 60 % 60, t3 % 60);
    return time3;
}