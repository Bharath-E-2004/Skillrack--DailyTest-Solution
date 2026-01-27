import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        int start = arr[0];
        int prev = arr[0];

        for (int i = 1; i < n; i++) {
            // Skip duplicates
            if (arr[i] == prev) continue;

            // If not consecutive, close the range
            if (arr[i] != prev + 1) {
                sb.append(start).append("-").append(prev).append(" ");
                start = arr[i];
            }
            prev = arr[i];
        }

        // Print last range
        sb.append(start).append("-").append(prev);

        System.out.print(sb.toString());
        sc.close();
    }
}
/*
The program must accept N integers and print the unique ranges in ascending order.

Boundary Condition(s):

1<=N<= 1000

0 <= Each integer value <= 1000

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains the ranges separated by a space.

Example Input/Output 1:

Input:

8

46197023

Output: 0-46-79-9

Explanation:

The integers in the range 0-4 are 0, 1, 2, 3 and 4.

The integers in the range 6-7 are 6 and 7.

The only integer in the range 9-9 is 9.

Example Input/Output 2:

Input:

8

48756335
*/
