#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

char* removeUpperRepeatLower(const char *str) {
    if (str == NULL) return NULL;

    int len = strlen(str);
    char *result = (char *)malloc(sizeof(char) * (len + 1)); // +1 for null terminator
    if (!result) return NULL;

    int ind = 0;
    char prevUpper = '\0';

    for (int i = 0; i < len; i++) {
        if (isupper(str[i])) {
            if (str[i] != prevUpper) {
                result[ind++] = str[i];
                prevUpper = str[i];
            }
        } else {
            result[ind++] = str[i];
        }
    }

    result[ind] = '\0'; // Null-terminate the result string
    return result;
}
/*
Example Input/Output 1:

Input

GreenApple

Output reennpple

Explanation:

Here S="GreenApple".

1st alphabet G: Upper case alphabet. There is no previous alphabet. So G is removed. New string will be empty.

2nd, 3rd, 4th and 5th alphabets are lower case. They are kept as such. New string becomes "reen".

6th alphabet A: Upper case alphabet. The previous alphabet is n. So n is repeated. New string becomes "reenn".

7th 8th 9th and 10th alphabets are lower case. They are kept as such. New string becomes "reennpple".

A

Hence the output is reennpple

Example Input/Output 2:

Input:

SKILLRACK

Output: -1

Example Input/Output 3: Input:

aBcDeFGH

Output:

aacceeee
*/
