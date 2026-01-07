#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void concatAndConvertToOctal(int SIZE, int arr[])
{
    char bin[3200] = "";
    int pos = 0;

    // Step 1: build concatenated binary
    for (int i = 0; i < SIZE; i++)
    {
        int val = arr[i];
        char temp[32];
        int j = 0;

        if (val == 0)
            temp[j++] = '0';
        else
        {
            while (val > 0)
            {
                temp[j++] = (val % 2) + '0';
                val /= 2;
            }
        }

        // reverse temp into bin
        for (int k = j - 1; k >= 0; k--)
            bin[pos++] = temp[k];
    }

    bin[pos] = '\0';

    // Step 2: pad with leading zeros to make length multiple of 3
    int len = strlen(bin);
    int pad = (3 - (len % 3)) % 3;

    char padded[3200];
    int idx = 0;

    for (int i = 0; i < pad; i++)
        padded[idx++] = '0';

    strcpy(padded + idx, bin);

    // Step 3: convert each 3-bit group to octal
    int plen = strlen(padded);
    int printed = 0;

    for (int i = 0; i < plen; i += 3)
    {
        int val =
            (padded[i] - '0') * 4 +
            (padded[i + 1] - '0') * 2 +
            (padded[i + 2] - '0');

        if (val != 0 || printed)
        {
            printf("%d", val);
            printed = 1;
        }
    }

    if (!printed)
        printf("0");
}
