#include <string.h>

char *spoonerize (const char *words, char *spoonerized)
{
	strcpy(spoonerized, words);

	char *word_2 = strchr(spoonerized, ' ') + 1;
	spoonerized[0] = *word_2;
	*word_2 = words[0];

	return spoonerized;
}