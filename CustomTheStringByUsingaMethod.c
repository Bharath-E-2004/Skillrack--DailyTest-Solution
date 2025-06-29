#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

void customStringFormat(char *str1, char *str2) {
    char *w[100];  // Array to hold words
    int c = 0;

    // Tokenize str2 into words separated by space
    for (char *t = strtok(str2, " "); t; t = strtok(NULL, " ")) {
        w[++c] = t;  // Store word at index starting from 1
    }

    for (int i = 0; str1[i];) {
        if (str1[i] == '{') {
            int n = 0;
            i++;  // Move past '{'

            // Extract the number inside braces
            while (isdigit(str1[i])) {
                n = n * 10 + (str1[i] - '0');
                i++;
            }

            if (str1[i] == '}') {
                i++;  // Move past '}'
                if (n >= 1 && n <= c)
                    printf("%s", w[n]);
            }
        } else {
            putchar(str1[i++]);  // Print character as-is
        }
    }
}

int main() {
    char str1[10001], str2[10001];
    scanf("%[^\n]\n%[^\n]", str1, str2);  // Read two lines of input
    customStringFormat(str1, str2);

    return 0;
}
/*
  The function/method customStringFormat must replace the pair curly braces with the words from the string str2 based on the position inside the curly braces. Then the function must print the formatted string as the output.

Note: The integers present inside the curly braces are always valid (i.e., The string str2 will always have a word for the given position.).

Your task is to implement the function customStringFormat so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

1 <= P < 100

Example Input/Output 1:

Input

SkillRack (2) coding {1}

platform online

Output:

SkillRack online coding platform

Explanation:

The given two string values are SkillRack (2) coding (1) platform online After replacing (2) with online and (1) with platform, the formatted string becomes SkillRack online coding platform

Example Input/Output 2:

Input:

The time is (1):(2) (3).

10 54 AM

Output:

The time is 10:54 AM.
*/
