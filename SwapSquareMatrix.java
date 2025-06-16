import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt(), k = sc.nextInt();
        char[][] alpha = new char[row][col];

        // Input the matrix
        for (int i = 0; i < row * col; i++) {
            alpha[i / col][i % col] = sc.next().charAt(0);
        }

        int r1 = sc.nextInt(), c1 = sc.nextInt(), r2 = sc.nextInt(), c2 = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int pr1 = process(r1, k), pc1 = process(c1, k);
            int pr2 = process(r2, k), pc2 = process(c2, k);

            char temp = alpha[pr1][pc1];
            alpha[pr1][pc1] = alpha[pr2][pc2];
            alpha[pr2][pc2] = temp;
        }

        // Output the modified matrix
        for (char[] arr : alpha) {
            for (char val : arr)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }

    public static int process(int i, int k) {
        return i - k / 2 - 1;
    }
}
/*
  The program must accept a character matrix of size R°C, an odd integer X and the positions of two cells in the matrix as the input. The positions of the given two cells represent the positions of the middle cell of the two square submatrices of size X*X (the submatrices never overlap in the matrix). The program must swap the two submatrices within the given matrix. Finally, the program must print the revised matrix as the output.

Notes The value of X is always odd.

Example Input/Output 1:

Input

883

ArMpyoKH

NxBgKDwX

qXrqxENF

RfSQExfp

JxVdPaKq

SISbbHFW

egMCOJMM

ayeVbfXS

33

75

Output

ArMpyoKΗ

NbbHKDwX

qCOJXENF

RVbfExfp

JxVdPaKq

SISxBgFW

egMXrqMM

ayefSQXS
*/
