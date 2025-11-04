import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                mat[i][j] = row.charAt(j) - '0';
            }
        }

        int count = 0;

        // We use two hashmaps to count diagonals:
        // One for main diagonals (r - c)
        // One for anti-diagonals (r + c)
        Map<Integer, Integer> diag1 = new HashMap<>();
        Map<Integer, Integer> diag2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    int d1 = i - j;
                    int d2 = i + j;

                    // Each bishop already placed on this diagonal attacks all previous bishops
                    count += diag1.getOrDefault(d1, 0);
                    count += diag2.getOrDefault(d2, 0);

                    // Update count on both diagonals
                    diag1.put(d1, diag1.getOrDefault(d1, 0) + 1);
                    diag2.put(d2, diag2.getOrDefault(d2, 0) + 1);
                }
            }
        }

        System.out.println(count);
    }
}


/*
The program must accept a matrix of size N°N representing a chessboard. The chessboard contains a certain number of bishops(marked by 1) and the empty squares are marked by the value 0. In the given chessboard, two bishops attack each other if they share the same diagonal. This includes the bishops that have another bishop located between them(le bishops can attack through pieces). The program must print the number of pairs of bishops that attack each other.

Boundary Condition(s):

2 <= N <= 50

Input Format:

The first line contains N.

The next N lines, each contains N integer values separated by a space.

Output Format:

The first line contains the number of pairs of bishops that attack each other.

Example Input/Output 1:

Input:

5

10000

00100

00100

00000

10000

Output

2

Explanation:

The bishops at (1, 1) and (3, 3) attack each other.

Similarly, the bishops at (5, 1) and (3, 3) attack each other.

2 pairs of bishops that attack each other, so 2 is printed as the output
*/
