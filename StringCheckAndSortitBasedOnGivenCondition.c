#include <stdio.h>
#include <string.h>

int main() {
    char s1[1001], s2[27];
    scanf("%s", s1);
    scanf("%s", s2);

    int freq[26] = {0};

    // Count frequency of characters in s1
    for(int i = 0; s1[i] != '\0'; i++) {
        freq[s1[i] - 'a']++;
    }

    // Print characters in order of s2
    for(int i = 0; s2[i] != '\0'; i++) {
        int index = s2[i] - 'a';
        while(freq[index] > 0) {
            printf("%c", s2[i]);
            freq[index]--;
        }
    }

    // Print remaining characters in alphabetical order
    for(int i = 0; i < 26; i++) {
        while(freq[i] > 0) {
            printf("%c", i + 'a');
            freq[i]--;
        }
    }

    return 0;
}

/*
The program must accept two string values 51 and 52-containing only lower case alphabets as the input. The string $2 represents a template that contains only unique alphabets. The

program must sort the alphabets in the string $1 based on the following conditions. - The alphabets that occur in the template 52 come first in the order of their occurrence.

-Then the other alphabets must be sorted in alphabetical order. Finally, the program must print the revised string 51 as the output.

Boundary Condition(s):

1 Length of S1 <= 1000

1<= Length of S2 <= 26

Input Format:

The first line contains $1.

The second line contains S2.

Output Format:

The first line contains the revised string $1.

Example Input/Output 1:

Input

skillrack

Beri

Output:

Le

Ikkriacs

Explanation:

Here $1-skillrack and S2-Ikri.

After sorting the alphabets in S1 based on the given conditions, the string becomes Ilkkriack

Example Input/Output 2:

Input:

abcdzyxw

day

Output:

daybewxz
*/
