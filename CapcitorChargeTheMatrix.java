import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] matrix = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = sc.nextInt();

                if (val == 1) {
                    // Propagate 'charge' to neighboring cells
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            if (valid(i + di, j + dj, row, col)) {
                                matrix[i + di][j + dj] = 1;
                            }
                        }
                    }
                } else {
                    matrix[i][j] = val;
                }
            }
        }

        // Print the matrix
        for (int[] arr : matrix) {
            for (int val : arr) {
                System.out.print((val == 1 ? 'C' : val) + " ");
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }

    public static boolean valid(int i, int j, int r, int c) {
        return i >= 0 && i < r && j >= 0 && j < c;
    }
}
/*
Capacitor Charged Cells

The program must accept an integer matrix of size R°C consisting of only 1s and 0s. 
1 indicates that the cell has a capacitor that will charge the current cell as well cells. 
The program must mark the charged cells with C. Finally the program must print the matrix state as the output.


*/
