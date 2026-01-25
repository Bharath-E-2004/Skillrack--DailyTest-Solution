void swapDigitsSameSum(int *ptr1, int *ptr2)
{
    int x = *ptr1, y = *ptr2;
    int d1 = 0, d2 = 0, temp;
    int big, small, D;

    temp = x;
    while (temp > 0) {
        d1++;
        temp /= 10;
    }

    temp = y;
    while (temp > 0) {
        d2++;
        temp /= 10;
    }

    D = abs(d1 - d2);

    if (x > y) {
        big = x;
        small = y;
    } else {
        big = y;
        small = x;
    }

    int powSmall = (int)pow(10, d1 < d2 ? d1 : d2);
    int first = big / powSmall;
    int remain = big % powSmall;

    small = first * (int)pow(10, D) + small;
    big = remain;

    if (x > y) {
        *ptr1 = small;
        *ptr2 = big;
    } else {
        *ptr1 = big;
        *ptr2 = small;
    }
}

/*
The function/method swapDigitsSameSum accepts two arguments ptr1 and ptr2 representing the addresses of two integer values X and Y. The number of digits in X and Y are always not equal.

The function/method swapDigitsSameSum must modify the given two integer values based on the following condition.

- The function must remove the first D digits from the largest integer and prepend them to the smallest integer between the given two integers, where D is the absolute difference between the number of digits in X and Y.

Please fill in the missing lines of code in the function swap DigitsSameSum so that the program runs successfully.

IMPORTANT; Do not write the main() function as it is already defined.

Example Input/Output 1:

Input 254 6573

Output: 6254 573

Explanation:

The largest integer is 6573 and the smallest integer is 254.

The number of digits in 6573 is 4.

The number of digits in 254 is 3.

After modifying the two integers based on the given conditions, the two integers become 6254

and 573.

Example Input/Output 2:

Input 5056 23

Output 56 5023

Example Input/Output Input 5000 654
*/
