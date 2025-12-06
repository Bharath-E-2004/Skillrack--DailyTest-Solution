import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int result[] = new int[N];

        for(int i = 0; i < N; i++) {
            int count = 0;
            int needed = B[i];
            int base = A[i];
            int len = -1;

            for(int j = i; j < N; j++) {
                if(A[j] >= base) {
                    count++;
                }
                if(count >= needed) {
                    len = j - i + 1;
                    break;
                }
            }
            result[i] = len;
        }

        // output
        for(int i = 0; i < N; i++) {
            System.out.print(result[i]);
            if(i != N-1) System.out.print(" ");
        }
    }
}

/*
[06-12-2025 22:10] Bharath. E: The program must accept two arrays A and B of equal size N as the input. For every index i in the array A, the program must print the length of the smallest subarray starting from the index I such that the subarray contains at least B[i] integers greater than or equal to Alil. If there is no such subarray starting from the index i, the program must print -1.

Boundary Condition(s):

2 <= N <=100 1 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integers separated by a space representing the array A

The third line contains N integers separated by a space representing the array В.

Output Format:

The first line contains N integer values separated by a space.

Example Input/Output 1:

Input:

5 925210 23611

Output 53-111

Explanation:

For I = 0 the smallest subarray is [9, 2, 5, 2, 10] -> Length = 5.

For i = 1 the smallest subarray is [2, 5, 2] -> Length = 3

For I = 2 there is no such smallest subarray -> So-1 is printed.

For I = 3 the smallest subarray is [2] -> Length = 1.

For I = 4 the smallest subarray is [10] -> Length = 1.
[06-12-2025 22:11] Bharath. E: Example Input/Output 2:

Input:

6 39 53 13 11 11 84

213322

Output: 21-132-1
*/
