void zipArrays(int count, ...)
{
    va_list args;
    va_start(args, count);

    if(count == 4)  // Two arrays
    {
        int A = va_arg(args, int);
        int *arr1 = va_arg(args, int*);
        int B = va_arg(args, int);
        int *arr2 = va_arg(args, int*);

        int min = (A < B) ? A : B;

        for(int i = 0; i < min; i++)
        {
            printf("%d %d\n", arr1[i], arr2[i]);
        }
    }
    else if(count == 6)  // Three arrays
    {
        int A = va_arg(args, int);
        int *arr1 = va_arg(args, int*);
        int B = va_arg(args, int);
        int *arr2 = va_arg(args, int*);
        int C = va_arg(args, int);
        int *arr3 = va_arg(args, int*);

        int min = A;
        if(B < min) min = B;
        if(C < min) min = C;

        for(int i = 0; i < min; i++)
        {
            printf("%d %d %d\n", arr1[i], arr2[i], arr3[i]);
        }
    }

    va_end(args);
}
/*
The program accepts three array elements with the size of the arrays as A, B and C as the input. The program must print "Two Arrays Zip:" followed by the integers that occur in the same positions in the first two arrays in separate lines. Then the program must print "Three Arrays Zip: followed by the integers that occur in the same positions in the three arrays in separate lines.

Your task is implement the function zipArrays so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

555

12345

678910

10 20 30 40 50

Output

Two Arrays Zip:

16

27

38

49

5 10

Three Arrays Zip

1610

2720

3830

4940

5 10 50
Explanation:

The integers that occur in the same positions in the first two arrays are given below.

16

27

38

49

5 10

The integers that occur in the same positions in the three arrays are given below.

16 10

27 20

38 30

49 40

5 10 50

Example Input/Output 2:

Input:

7 10 6

54 15 58 39 70 44 78

48 74 40 87 39 84 12 27 55 41

15 56 86 11 59 34

Output

Two Arrays Zip:

54 48

15 74

58 40

39 87

70 39

44 84

78 12

Three Arrays Zip:

54 48 15

15 74 56

58 40 86

39 87 11

70 39 59

44 84 34
*/
