#include <stdio.h>
#include <stdlib.h>

char *century_from_year (char *century_string, const char year[4 + 1])
{
	int century = (atoi(year) - 1) / 100 + 1;
	const char *suffix = "th";

	if ((century % 100) <= 3 || (century % 100) >= 21) {
		switch (century % 10) {
		case 1: suffix = "st"; break;
		case 2: suffix = "nd"; break;
		case 3: suffix = "rd"; break;
		}
	}
	sprintf(century_string, "%d%s", century, suffix);
	return century_string;
}