#include <stdio.h>
#include <ctype.h>

int solveExpression(char *expression) {
    int val1 = 0, val2 = 0, val3 = 0;
    int i = 0;

    // parse val1
    while (isdigit(expression[i])) {
        val1 = val1 * 10 + (expression[i++] - '0');
    }

    // parse operator
    char op = expression[i++]; // assume '+' or '-'

    // parse val2
    while (isdigit(expression[i])) {
        val2 = val2 * 10 + (expression[i++] - '0');
    }

    // parse val3
    while (expression[i] != '\0' && isdigit(expression[i])) {
        val3 = val3 * 10 + (expression[i++] - '0');
    }

    printf("Parsed: val1=%d val2=%d val3=%d op=%c\n", val1, val2, val3, op);

    // Now evaluate
    if (val1 == 0) {
        return (op == '+') ? (val3 - val2) : (val3 / val2);
    } else if (val2 == 0) {
        return (op == '+') ? (val3 - val1) : (val3 / val1);
    } else {
        return (op == '+') ? (val1 + val2) : (val1 * val2);
    }
}
