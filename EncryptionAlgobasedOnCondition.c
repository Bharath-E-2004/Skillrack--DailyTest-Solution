#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* encryptPAN(char *str) {
    // Reversed consonant mapping
    char rev[] = "zxywvtsrqpnmlkjhgfdcb";
    
    int i = 0, k = 0;
    int len = strlen(str);
    
    // Allocate space for result
    char *res = (char*)malloc(sizeof(char) * (len + 2));
    
    while (str[i]) {
        char c = str[i];
        
        if (strchr("AEIOUaeiou", c)) {
            // Skip vowels completely
        } else if (isalpha(c)) {
            // For consonants
            res[k++] = '*';
            
            if (isupper(c)) {
                // Find position in alphabet excluding vowels
                int p = 0;
                for (char ch = 'A'; ch < c; ch++) {
                    if (!strchr("AEIOU", ch)) p++;
                }
                res[k++] = rev[p];
            } else {
                res[k++] = c;
            }
        } else {
            // Non-alphabet characters added as-is
            res[k++] = c;
        }
        i++;
    }
    
    res[k] = '\0';
    return res;
}

int main() {
    char str[101];
    scanf("%100s", str);  // Prevent buffer overflow

    char *encryptedPAN = encryptPAN(str);

    printf("Original PAN: %s\n", str);
    printf("Encrypted PAN: %s\n", encryptedPAN);

    free(encryptedPAN); // Free allocated memory
    return 0;
}
/*
  The function/method encryptPAN accepts a string str representing the PAN number of a person.

The function/method encryptPAN must encrypt the given PAN number based on the following conditions.

1) Remove all the vowels.

2) Insert an asterisk before each consonant.

3) Replace all upper case consonants with the corresponding lower case consonant in the reverse alphabetical order.

Finally, the function must return a new string representing the encrypted PAN number.

Your task is to implement the function encryptPAN so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

ABCDEF145R

Output

Original PAN: ABCDEF145R

Encrypted PAN: *z*y*x*w145*k

Explanation:

Here the given string is ABCDEF145R

After encrypting the given PAN number based on the given conditions, the PAN number becomes *z*y*x*w145°k.

Example Input/Output 2:

Input:

pqrs55tuvYZ

Output:

Original PAN: pqrs55tuvYZ

Encrypted PAN: *p*q*r*s55*t*v*c*b
*/
