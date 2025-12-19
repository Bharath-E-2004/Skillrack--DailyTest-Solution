import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        // Final matrix size
        char[][] matrix = new char[R * 3][C * 3];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {

                String s = sc.next();
                char[] expanded = new char[9];

                int idx = 0;
                int pos = 0;

                // Expand compressed string
                while (idx < s.length()) {
                    char ch = s.charAt(idx++);
                    int count = Character.getNumericValue(s.charAt(idx++));

                    while (count-- > 0) {
                        expanded[pos++] = ch;
                    }
                }

                // Place into 3x3 block
                int k = 0;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        matrix[i * 3 + r][j * 3 + c] = expanded[k++];
                    }
                }
            }
        }

        // Print result
        for (char[] row : matrix) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

/*
The program must accept a matrix of size R°C containing compressed string values as the input. A compressed string contains alphabet-integer pairs which represent the alphabets and their frequencies. For each compressed string in the matrix, the program must expand the compressed string as a string of length 9 and print the characters in 3*3 matrix format as shown in the Example Input/Output section.

Boundary Condition(s):

1<=RC <= 15

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C compressed string values separated by a space.

Output Format:

The first R*3 lines, each contains C*3 characters separated by a space.

Example Input/Output 1:

Input:

22

b4c1a4 bla1c5a2

a3b3c3 c9
*/
