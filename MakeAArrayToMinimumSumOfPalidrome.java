import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String arr[] = new String[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        int i = 0, j = n - 1;
        int result[] = new int[n];

        while(i < j) {
            String left = arr[i];
            String right = arr[j];

            if(!left.equals("*") && !right.equals("*")) {
                int a = Integer.parseInt(left);
                int b = Integer.parseInt(right);
                if(a != b) {
                    System.out.println(-1);
                    return;
                }
                result[i] = result[j] = a;
            }
            else if(left.equals("*") && right.equals("*")) {
                result[i] = result[j] = 1;  // minimum possible
            }
            else if(left.equals("*")) {
                result[i] = Integer.parseInt(right);
                result[j] = Integer.parseInt(right);
            }
            else {
                result[i] = Integer.parseInt(left);
                result[j] = Integer.parseInt(left);
            }
            i++;
            j--;
        }

        // Middle element if odd length
        if(i == j) {
            if(arr[i].equals("*")) {
                result[i] = 1;
            } else {
                result[i] = Integer.parseInt(arr[i]);
            }
        }

        for(int x : result) System.out.print(x + " ");
    }
}


/*
The program must accept an array of N integers as the input with some integers missing. The missing integers are denoted by the asterisks. The program must replace the asterisks with positive integer values so that the array becomes palindrome with a minimum sum. Then the program must print the palindromic array as the output. If it is not possible to make the array

palindrome, then the program must print -1 as the output. Note: There will be at least one asterisk in the given array.

Boundary Condition(s):

1 <= N <= 100

1 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains integers and asterisks separated by a space.

Output Format:

The first line contains the palindromic array or -1 based on the given conditions.

Example Input/Output 1:

Input:

6 1030 30 20

Output:

10 20 30 30 20 10

Explanation:

Here N-6.

To make the array palindrome with the minimum sum, the first asterisk must be replaced with 20 and the second asterisk must be replaced with 10.

Hence the output is 10 20 30 30 20 10

Example Input/Output 2 Input: 5

* 3 * 3 *

Output 13131
*/
