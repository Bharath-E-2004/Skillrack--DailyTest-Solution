#include <stdlib.h>
#include <string.h>

char* evaluateBitwise(char str1[], char str2[], char ch) {
    int len = strlen(str1);
    char* result = (char*)malloc(sizeof(char) * (len + 1)); // +1 for null terminator

    for (int i = 0; i < len; i++) {
        int a = (str1[i] == 'b');
        int b = (str2[i] == 'b');
        int c;

        if (ch == '&') {
            c = a & b;
        } else if (ch == '|') {
            c = a | b;
        } else {
            c = a ^ b; // default to XOR if not & or |
        }

        result[i] = (c == 0) ? 'a' : 'b';
    }

    result[len] = '\0'; // null-terminate the string
    return result;
}
/*
The function/method evaluateBitwise accepts three arguments str1, str2 and ch. str1 and str2 represent two string values containing a's and b's. ch represents a bitwise operator ('&', '' or

The function/method evaluateBitwise must perform the specified bitwise operation between the given two string values by considering a's as 0's and b's as 1's. Then the function must return a new string value representing the result of the bitwise operation.

Note: Both str1 and str2 have an equal length.

Your task is to implement the function evaluateBitwise so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1<= Length of str1 and str2 <= 1000

Example Input/Output 1:

Input

babaab

abbaba

&

Output

Explanation:

aabaaa

In the bitwise AND operation,

a&b=a

b&a=a

b&b=b

bababa & abbaba aabaaa
*/
