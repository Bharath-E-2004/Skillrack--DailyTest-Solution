import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] names = new String[N];

        int maxLen = 0;

        // Read strings and find maximum length
        for (int i = 0; i < N; i++) {
            names[i] = sc.next();
            maxLen = Math.max(maxLen, names[i].length());
        }

        // Result matrix
        char[][] result = new char[maxLen][N];

        // Fill with '*'
        for (char[] row : result) {
            Arrays.fill(row, '*');
        }

        // Place each string vertically
        for (int col = 0; col < N; col++) {
            int len = names[col].length();

            // Starting row so middle characters align
            int startRow = (maxLen - len) / 2;

            for (int row = 0; row < len; row++) {
                result[startRow + row][col] = names[col].charAt(row);
            }
        }

        // Print output
        for (char[] row : result) {
            System.out.println(new String(row));
        }
    }
}

/*
The program must accept N string values as the input. The length of each string is always odd. The program must print the N string values vertically so that the middle character of each string occurs on the same line. The empty spaces must be printed as asterisks.

Boundary Condition(s):

1 <= N <= 100

1<= Length of each string <= 99

Input Format:

The first line contains N.

The next N lines, each contains a string value.

Output Format:

The lines contain the N string values vertically based on the given conditions.
*/
