int countSpecialIntegers(int L, int R, int A, int B)
{
    int result = 0;

    // Convert digits A and B to characters
    char da = A + '0';
    char db = B + '0';

    for (int i = L + 1; i < R; i++)
    {
        // Condition-1: divisible by both A and B
        if (i % A == 0 && i % B == 0)
        {
            // Condition-2: contains digits A and B
            char str[20];
            sprintf(str, "%d", i);

            int hasA = 0, hasB = 0;

            for (int j = 0; str[j] != '\0'; j++)
            {
                if (str[j] == da) hasA = 1;
                if (str[j] == db) hasB = 1;
            }

            if (hasA && hasB)
                result++;
        }
    }

    return result;
}
/*
The function/method countSpecialintegers accepts four arguments L, R, A and B. The first two arguments L, R represent a range of integer values. The next two arguments A, B represent two nonzero digits.

The function/method countSpecialintegers must return an integer representing the count of special integers present in the range from L to R. A special integer is an integer divisible by both A and B, and contains the digits A and B at least once.

Your task is to implement the function countSpecialIntegers so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s): 10 <= L <R <= 10^6 1 A, B = 9

Example Input/Output 1:

Input: 1800 2500 36

Output 7

Explanation:

Here L 1800, R2500, A3 and B = 6. There are 7 special integers present in the range from 1800 to 2500. 1836 2136 2316 2346 2364 2376 2436

Example Input/Output 2:

Input: 5000 9999 47

Output 16
*/
