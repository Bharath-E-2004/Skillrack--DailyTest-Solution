long long int everyTwoDigitsToInteger(int N)
{
    long long int result = 0;
    char temp[20];

    sprintf(temp, "%d", N);
    int len = strlen(temp);

    for(int i = 0; i < len - 1; i++)
    {
        int first = temp[i] - '0';
        int second = temp[i + 1] - '0';

        long long int total = 0;

        if(first <= second)
        {
            for(int d = first; d <= second; d++)
            {
                total = total * 10 + d;
            }
        }
        else
        {
            for(int d = first; d >= second; d--)
            {
                total = total * 10 + d;
            }
        }

        result += total;
    }

    return result;
}

/*
The function/method every TwoDigits Tolnteger accepts an argument N representing an integer value.

The function/method every Two Digits Tolnteger must form integer values based on the following condition.

- For every two digits D1 and D2 in the integer N, the program must form a new integer by using the digits from D1 to D2.

Then the function must return an integer representing the sum of the resulting integers.

Your task is to implement the function every TwoDigits Tolnteger so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input: 2514

Output

57900

Explanation:

Here N = 2514.

1st integer: 2345 (2 to 5).

2nd integer: 54321 (5 to 1).

3rd integer: 1234 (1 to 4).

2345+54321 + 1234-57900.

Example Input/Output 2:

Input:

90109

Output:

10000000010
*/
