#include <stdio.h>
#include <string.h>

char* vowelEncryption(const char *str) {
    static char result[201];
    int ind = 0, j = 0;

    while (str[ind]) {
        int c = 0;

        // Count consecutive vowels
        while (str[ind] && strchr("aeiouAEIOU", str[ind])) {
            ind++;
            c++;
        }

        if (c > 0) {
            // Convert count to string and append
            if (c > 9) {
                j += sprintf(&result[j], "%d", c);
            } else {
                result[j++] = c + '0';  // Convert digit to char
            }
        }

        // Append non-vowel character
        if (str[ind]) {
            result[j++] = str[ind++];
        }
    }

    result[j] = '\0'; // Null-terminate
    return result;
}

int main() {
    char input[201];
    scanf("%200s", input);  // Read up to 200 chars safely

    printf("Encrypted: %s\n", vowelEncryption(input));
    return 0;
}
/*
Example Input/Output 1:

Input:

eager

Output:

2g1r

Explanation:

Here the given string is eager.

After replacing the consecutive vowels with their count, the string becomes 2g1r.

Example Input/Output 2:

Input:

ZAbcdeioufghIOAabcd

Output:

Z1bcd4fgh4bcd

Example Input/Output 3:

Input:

kgooooooooooseee

Output

kg10s3
*/
