#include <string.h>
#include <stdlib.h>

char* Tolnteger(char* str) {
    // Allocate memory for the output number string
    char* result = (char*)malloc(100);  // Adjust size as needed
    result[0] = '\0';  // Initialize as empty string

    int i = 0;
    while (i<strlen(str) {
        // Check for each digit word
        if (strncmp(&str[i], "zero", 4) == 0) {
            strcat(result, "0");
            i += 4;
        } else if (strncmp(&str[i], "one", 3) == 0) {
            strcat(result, "1");
            i += 3;
        } else if (strncmp(&str[i], "two", 3) == 0) {
            strcat(result, "2");
            i += 3;
        } else if (strncmp(&str[i], "three", 5) == 0) {
            strcat(result, "3");
            i += 5;
        } else if (strncmp(&str[i], "four", 4) == 0) {
            strcat(result, "4");
            i += 4;
        } else if (strncmp(&str[i], "five", 4) == 0) {
            strcat(result, "5");
            i += 4;
        } else if (strncmp(&str[i], "six", 3) == 0) {
            strcat(result, "6");
            i += 3;
        } else if (strncmp(&str[i], "seven", 5) == 0) {
            strcat(result, "7");
            i += 5;
        } else if (strncmp(&str[i], "eight", 5) == 0) {
            strcat(result, "8");
            i += 5;
        } else if (strncmp(&str[i], "nine", 4) == 0) {
            strcat(result, "9");
            i += 4;
        } else {
            // Invalid input: skip one character to avoid infinite loop
            i++;
        }
    }

    return result;
}
/*

*/
