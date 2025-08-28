import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // Size of the array
        int[] arr = new int[size];
        int missingIndex = -1;
        long sum = 0;

        for (int i = 0; i < size; i++) {
            try {
                int val = sc.nextInt();
                arr[i] = val;
                sum += val;
            } catch (Exception e) {
                // If input is missing or invalid, mark the index
                missingIndex = i;
                sc.next(); // Skip the invalid input
            }
        }

        long total = sc.nextLong(); // Total sum expected
        arr[missingIndex] = (int)(total - sum); // Calculate missing value

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

/*
The program must accept N integers and their sum S, but exactly one digit is missing in an integer. The missing digit in the integer is denoted by an asterisk. The program must find the missing digit and print the N integers without missing any digits.

Boundary Condition(s):

1 <= N <= 100

0 <= Each integer value <= 10^6

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains S.

Output Format:

The first line contains N integers separated by a space.

Example Input/Output 1:

Input:

3

468 120 9*5

1573

Output: 468 120 985

Explanation:

Here N = 3 and a digit is missing in the 3rd integer. If the missing digit is 8, then 468 + 128985 = 1573.

Example Input/Output 2:

Input

4

15 8652 987 52364

152018

Output:

15 98652 987 52364
*/
