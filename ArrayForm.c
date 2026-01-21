#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char* addOrConcat(char *str) {
    char *result = malloc(strlen(str) + 1);
    result[0] = '\0';

    char *token = strtok(str, "+");
    int sum = 0;
    int numberMode = 0;   // 1 = numbers, 0 = strings

    while (token != NULL) {

        if (isdigit(token[0])) {
            if (!numberMode && strlen(result) > 0)
                strcat(result, "+");

            numberMode = 1;
            sum += atoi(token);
        }
        else {
            if (numberMode) {
                char temp[20];
                sprintf(temp, "%d", sum);
                strcat(result, temp);
                strcat(result, "+");
                sum = 0;
                numberMode = 0;
            }
            strcat(result, token);
        }

        token = strtok(NULL, "+");

        if (!numberMode && token != NULL && isalpha(token[0]))
            ;  // continue concatenation
        else if (!numberMode && token != NULL)
            strcat(result, "+");
    }

    if (numberMode) {
        char temp[20];
        sprintf(temp, "%d", sum);
        strcat(result, temp);
    }

    return result;
}

int main() {
    char input[] = "5+10+rats+cats+25+monkeys+50+100+donkeys";

    char *output = addOrConcat(input);
    printf("%s\n", output);

    free(output);
    return 0;
}
/*

*/
