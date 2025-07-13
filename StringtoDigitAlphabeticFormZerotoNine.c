#include <string.h>
#include <ctype.h>

int countDigitsInWords(char *str) {
    char *token = strtok(str, " ");
    int arr[26] = {0};

    // Count letter frequencies in the input string
    while (token != NULL) {
        for (int i = 0; token[i] != '\0'; i++) {
            arr[tolower(token[i]) - 'a']++;
        }
        token = strtok(NULL, " ");
    }

    // Check how many digit words can be formed
    int count = 0;
    char digitWords[] = "zero one two three four five six seven eight nine";
    char *digitToken = strtok(digitWords, " ");

    while (digitToken != NULL) {
        int temp[26] = {0};
        int canForm = 1;

        for (int i = 0; digitToken[i] != '\0'; i++) {
            int idx = digitToken[i] - 'a';
            temp[idx]++;
            if (temp[idx] > arr[idx]) {
                canForm = 0;
                break;
            }
        }

        if (canForm) count++;
        digitToken = strtok(NULL, " ");
    }

    return count;
}
/*
The function/method countDigitsin Words accepts an argument str representing a string value.

The function/method countDigitsInWords must return an integer representing the count of single-digit word representations (zero, one, two, three, four, five, six, seven, eight and nine) that can be formed using the alphabets in the given string by ignoring the case.

Your task is to implement the function countDigitsin Words so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

zinc copper sulphate

Output:

3

Explanation:

The single-digit word representations-that can be formed using the alphabets in the given string are zero, one and three.

Example Input/Output 2:

Input:

Environment

Output

2

Max Execution Time Limit: 50 millisecs
*/
