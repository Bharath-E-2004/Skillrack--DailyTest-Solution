import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        int[] minDigits = new int[col];

        // Reading matrix and calculating minimum digit count per column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
                int digitCount = (int) Math.log10(matrix[i][j]) + 1;

                if (i == 0) {
                    minDigits[j] = digitCount;
                } else {
                    minDigits[j] = Math.min(minDigits[j], digitCount);
                }
            }
        }

        long sum = 0;

        // Processing matrix and printing transformed values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String str = String.valueOf(matrix[i][j]);
                int newVal = Integer.parseInt(str.substring(0, minDigits[j]));
                sum += newVal;

                System.out.print(newVal + " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
/*
The program must accept an integer matrix of size R°C as the input. For each column in the matrix, the program must remove the digits at the end of integers so that the number of digits in all the integers are equal to the number of digits in the smallest integer in that column. Then the program must print the revised matrix and its sum as the output.

Boundary Condition(s):

2<= R, C <= 50

1 Matrix element value <= 10^5

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space.

Output Format:

The first R lines, each contains C integers separated by a space representing the revised matrix. The R+1st line contains an integer representing the sum of integers in the revised matrix.

Example Input/Output 1:

Input

33

12 500 26

6 812 657

498 458 32

Output:

1 500 26

6 812 65

4458 32

1904

Explanation:

1st column -> Smallest integer 6 -> 1 digit.

2nd column -> Smallest integer 458 -> 3 digits.

3rd column -> Smallest integer 26 -> 2 digits.

After removing the digits of integers based on the given conditions, the matrix becomes

1 500 26

6 812 65

4 458 32

The sum of integers in the revised matrix is 1904.
*/
