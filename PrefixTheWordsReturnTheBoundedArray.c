#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int SIZE;
    char **words;
} BoundedArray;

BoundedArray* getWordsStartingWithPrefix(char *str, char *prefix) {
    BoundedArray *result = (BoundedArray *)malloc(sizeof(BoundedArray));
    result->SIZE = 0;
    result->words = (char **)malloc(1000 * sizeof(char *));

    int prefixLen = strlen(prefix);
    char *word = strtok(str, " ");
    
    while (word != NULL) {
        if (strncmp(word, prefix, prefixLen) == 0) {
            result->words[result->SIZE] = (char *)malloc(strlen(word) + 1);
            strcpy(result->words[result->SIZE], word);
            result->SIZE++;
        }
        word = strtok(NULL, " ");
    }

    if (result->SIZE == 0) {
        result->words[result->SIZE] = (char *)malloc(3 * sizeof(char));
        strcpy(result->words[result->SIZE], "-1");
        result->SIZE++;
    }

    return result;
}

int main() {
    char str[10001], prefix[101];
    scanf(" %[^\n]", str);  // Read line with spaces
    scanf("%s", prefix);

    BoundedArray *bArr = getWordsStartingWithPrefix(str, prefix);

    printf("Words starting with prefix %s:\n", prefix);
    for (int index = 0; index < bArr->SIZE; index++) {
        printf("%s\n", bArr->words[index]);
        free(bArr->words[index]);  // Free individual word memory
    }

    free(bArr->words);  // Free array of words
    free(bArr);         // Free structure
    return 0;
}

/*
  typedef struct BoundedArray.

int SIZE;

char **words;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

once onscreen octal ontology online old on

Output:

Words starting with prefix on:

once

onscreen

ontology

online

Explanation:

Here the given string is "once onscreen octal ontology online old" and the prefix is "on", The words starting with the prefix on are given below.

once

onscreen

ontology

online

Example Input/Output 2:

Input:

cat candle crow goat cow railcar

car

Output

Words starting with prefix car:

-1
*/
