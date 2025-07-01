import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] < 0)
                System.out.print(arr[i] * arr[size - Math.abs(arr[i])]);
            else
                System.out.print(arr[i] * arr[arr[i] - 1]); // Added * for multiplication
        }

        System.exit(0);
    }
}
/*
   The program must accept N integers as the input. The value of each integer can be any integer from-N to N except 0. A positive integer X indicates the Xth integer from left to right. A negative integer -X indicates the Xth integer from right to left. For each integer among the given N integers, the program must print the product of the integer and the integer present at the position based on its value.

Boundary Condition(s):

1 <= N <= 1000

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains N integer values separated by a space.

Example Input/Output 1:

Input:

5 -241-34

Output

6-12-2-3-12

Explanation:

The given 5 integers are -241-34.

1st integer:-2-3(2nd integer from right to left) = 6

2nd integer: 4-3(4th integer from left to right) = -12

3rd integer. 1-2(1st integer from left to right) = -2

4th integer: -31(3rd integer from right to left) = -3

5th integer. 4-3(4th integer from left to right) = -12

Example Input/Output 2:

Input:

8 -7552-4-4-61

Output

-35-20-20 10 16 16-30-7
*/
