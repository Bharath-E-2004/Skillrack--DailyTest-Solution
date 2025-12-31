import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];

        // Read matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> list = new ArrayList<>();

        // Traverse each 3x3 submatrix
        for (int i = 0; i < R; i += 3) {
            for (int j = 0; j < C; j += 3) {

                // Row-wise
                for (int r = 0; r < 3; r++) {
                    String num = "";
                    for (int c = 0; c < 3; c++) {
                        num += matrix[i + r][j + c];
                    }
                    list.add(Integer.parseInt(num));
                }

                // Column-wise
                for (int c = 0; c < 3; c++) {
                    String num = "";
                    for (int r = 0; r < 3; r++) {
                        num += matrix[i + r][j + c];
                    }
                    list.add(Integer.parseInt(num));
                }

                // Diagonal: top-left to bottom-right
                String diag1 = "";
                for (int d = 0; d < 3; d++) {
                    diag1 += matrix[i + d][j + d];
                }
                list.add(Integer.parseInt(diag1));

                // Diagonal: top-right to bottom-left
                String diag2 = "";
                for (int d = 0; d < 3; d++) {
                    diag2 += matrix[i + d][j + (2 - d)];
                }
                list.add(Integer.parseInt(diag2));
            }
        }

        // Sort and print
        Collections.sort(list);
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}

/*
The program must accept a matrix of size R°C containing only digits as the input. The values of R and C are always divisible by 3. For each 3*3 submatrix in the given matrix, the program must form 8 integers by concatenating the digits as given below.

Row wise(3 integers - left to right)

Column wise(3 integers - top to bottom)

- Diagonal wise (2 integers - top-left to bottom-right and top-right to bottom-left)

Finally, the program must print all the integers obtained in sorted order as the output.

Boundary Condition(s):

3 <= R, C <= 48

0 <= Matrix element value <= 9

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space.

Output Format:

The first line contains ((R/3)*(C/3))*8 integers separated by a space.

Example Input/Output 1:

Input

36 123145 789893

456726

Output:

123 123 145 147 159 178 258 357 369 429 456 528 563 726 789 893

Explanation:

The 8 integers from the first 3*3 submatrix are given below.

123, 456, 789, 147, 258, 369, 159 and 357.

The 8 integers from the second 3*3 submatrix are given below.

145, 726, 893, 178, 429, 563, 123 and 528.

So the resulting 16 Integers are printed in sorted order.
*/
