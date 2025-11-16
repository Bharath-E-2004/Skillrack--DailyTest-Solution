import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        int Q = sc.nextInt();

        while (Q-- > 0) {
            int X = sc.nextInt();   // 1-based index
            int Y = sc.nextInt();   // 1-based index

            // Convert to 0-based index
            int i = X - 1;
            int j = Y - 1;

            int count = 0;

            // Compare characters until mismatch or end
            while (i < S.length() && j < S.length() && S.charAt(i) == S.charAt(j)) {
                count++;
                i++;
                j++;
            }

            System.out.println(count);
        }
    }
}
/*
The program must accept a string S and Q queries as the input. Each query contains two integers X and Y representing the positions of two characters in the string S. For each query, the program must print the length of the longest common substring starting from the given two positions X and Y.

Boundary Condiiton(s):

2 <= Length of S <= 100

1 <= Q <= 100

1 <=X, Y <= Length of S

Input Format:

A The first line contains S.

The second line contains Q.

The next Q lines, each contains two integers X and Y representing the positions of two characters in the string S.

Output Format:

The first Q lines, each contains the length of the longest common substring starting from the given two positions X and Y.

Example Input/Output 1:

Input:

cdcdcdacdcdcDcDCD 3 13 27 18

Output: 4 0 5

Explanation:

1st query: X 1 and Y = 3.

The longest common substring is eded, whose length is 4.

So 4 is printed as the output.
3 ^ (rd) query: X = 1 and Y = 8.

The longest common substring is cdcdc, whose length is 5. So 5 is printed as the output.

Example Input/Output 2:

Input:

cellCellscellcellcell

4

15

62

10 1

10 14

Output:

0

3

4

8
*/
