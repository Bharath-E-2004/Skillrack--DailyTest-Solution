import java.util.*;

public class Hello {
    // helper to get first digit
    static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    // helper to get last digit
    static int lastDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLen = 0;
        int maxSum = 0;

        int currLen = 1;
        int currSum = arr[0];

        for (int i = 1; i < n; i++) {
            if (firstDigit(arr[i]) == lastDigit(arr[i - 1])) {
                currLen++;
                currSum += arr[i];
            } else {
                if (currLen >= 2) {
                    if (currLen > maxLen || (currLen == maxLen && currSum > maxSum)) {
                        maxLen = currLen;
                        maxSum = currSum;
                    }
                }
                currLen = 1;
                currSum = arr[i];
            }
        }

        // final check (important)
        if (currLen >= 2) {
            if (currLen > maxLen || (currLen == maxLen && currSum > maxSum)) {
                maxLen = currLen;
                maxSum = currSum;
            }
        }

        // if no valid subarray found
        if (maxLen == 0) {
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            System.out.println(max);
        } else {
            System.out.println(maxSum);
        }
    }
}

/*
The program must accept N integers as the input. The program must print the sum of the integers in the longest subarray of minimum size 2 where the first digit of each integer(except the first integer) is equal to the last digit of the previous integer. If two or more such longest subarrays occur, then the program must consider the subarray which gives the maximum sum. If there is no such subarray, then the program must print the maximum integer among the given N integers as the output.

Boundary Condition(s):

2<=N<=100

1 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains an integer representing the sum of integers in the longest subarray

based on the given conditions.

Example Input/Output 1:

Input:

8 67 12 24 49 901 54 48 806

Output: 986

Explanation:

The longest subarray where the first digit of each integer(except the first integer) is equal to the last digit of the previous integer is given below. 12, 24, 49 and 901.

The sum of the integers in the longest subarray is 986 (12+24+49 +901). Hence the output is 986.
*/
