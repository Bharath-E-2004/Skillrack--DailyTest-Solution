import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Size of the array
        int arr[] = new int[N];

        // Reading array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt(); // K value

        // Updating array based on given logic
        for (int i = 0; i < K; i++) {
            for (int j = K; j < N; j++) {
                arr[j] += (arr[j] % arr[i]);
            }
        }

        // Printing updated array
        for (int val : arr) {
            System.out.print(val + " ");
        }
        
        sc.close();
    }
}
/*
The program must accept N integers and an integer K. Starting from the 1st element to the Kth element, the program must divide the integers starting from the K+1th element and add the respective remainders to the array elements. The program must finally print the revised array values

Boundary Condition(s):

1 <= K < N <= 100

1 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

The third line contains K.

A

Output Format:

The first line contains the revised array values separated by a space.

Example Input/Output 1:

Input:

5 10 24 61 78 90

2

Output

10 24 76 100 108

Explanation:

Here K-2.

After dividing by 10 and adding the remainders the array becomes 10 24 62 86 90.

After dividing by 24 and adding the remainders the array becomes 10 24 76 100 108.
*/
