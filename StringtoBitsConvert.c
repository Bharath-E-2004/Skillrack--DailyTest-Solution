#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* stringToBits(char *str) {
    int len = strlen(str);
    char *bits = (char *)malloc(len + 1); // One bit per character + null terminator

    for (int i = 0; i < len; i++) {
        bits[i] = (i % 2 == 0) ? '1' : '0'; // Position starts at 0, so even index → odd position
    }

    bits[len] = '\0'; // Null-terminate the string
    return bits;
}

int main() {
    char input[] = "Skill Rack";
    char *output = stringToBits(input);
    printf("%s\n", output); // Output: 10101010101
    free(output);
    return 0;
}
