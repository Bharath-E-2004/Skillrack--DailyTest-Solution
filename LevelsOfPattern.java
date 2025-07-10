import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int levels = sc.nextInt();
        int N = sc.nextInt();

        int array[] = new int[N];

        if (levels == 1) {
            Arrays.fill(array, 1);
        } else {
          if(N>=levels){
            array[levels - 1] = 1;
            for (int i = levels; i < N; i++) {
                for (int j = 1; j <= levels; j++) {
                    array[i] += array[i - j];
                }
            }
        }
        }
        for (int val : array)
            System.out.print(val + " ");
        
        sc.close();
    }
}
/*
The program must accept two integers N and Tas the input. The program must print the first T terms in the Nth level increasing series as given below.

Level 1: 1, 1, 1, 1, 1, 1, 1, 1, and so on.

Level 2: 0, 1, 1, 2, 3, 5, 8, 13, and so on.

Level 3: 0, 0, 1, 1, 2, 4, 7, 13, 24, and so on.

Level 4: 0, 0, 0, 1, 1, 2, 4, 8, 15, 29, and so on.

Level 5:0, 0, 0, 0, 1, 1, 2, 4, 8, 16, 31, and so on.

Similarly, the remaining levels are formed.

In Kth level increasing series, the next term is formed by the sum of previous K terms, where the first K-1 terms are Os and Kth term is 1.

Boundary Condition(s):

1<= N <=9 1<=T<=50

Input Format:

The first line contains N and T separated by a space.

Output Format:

The first line contains the first T terms in the Nth level increasing series separated by a space.

Example Input/Output 1:

Input: 3 10

Output: 0 0 1 1 2 4 7 13 24 44

Explanation:

Here N 3 and T = 10.

The first 10 terms in the 3rd level increasing series are printed as the output.

0 0 1 1 2 4 7 13 24 44
*/
