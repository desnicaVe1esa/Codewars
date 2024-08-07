#include <stdlib.h>
#include <string.h>

char *strsum(const char *lhs, const char *rhs)
{
	size_t i = strlen(lhs), j = strlen(rhs);
	size_t k = 1 + (i > j ? i : j);
	size_t length = k;

	char *sum = calloc(1 + k, 1);

	if (!sum)
		return NULL;

	int carry = 0;

	while (k--) {
		int left = (i ? lhs[--i] : '0') - '0';
		int right = (j ? rhs[--j] : '0') - '0';
		int value = carry + left + right;

		sum[k] = '0' + (value % 10);
		carry = value > 9;
	}

	size_t prefix = strspn(sum, "0");

	if (prefix)
		memmove(sum + (prefix == length), sum + prefix, length - prefix + 1);

	return sum;
}