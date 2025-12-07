import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] mat = new int[R][C];

        // Read matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Submatrix starts at row (R - X), col (Y - 1)
        int startRow = R - X;
        int startCol = Y - 1;

        // Number of columns in submatrix
        int width = C - Y + 1;

        List<Integer> list = new ArrayList<>();

        // Collect elements from submatrix
        for (int i = startRow; i < R; i++) {
            for (int j = startCol; j < C; j++) {
                list.add(mat[i][j]);
            }
        }

        // Sort the values
        Collections.sort(list);
        int index = 0;

        // Put back sorted values
        for (int i = startRow; i < R; i++) {
            for (int j = startCol; j < C; j++) {
                mat[i][j] = list.get(index++);
            }
        }

        // Print output matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
The program must accept an integer matrix of size R°C and two integers X, Y as the input. The integers X and Y represent the bottom-left position of a submatrix of size X*(C-Y+1). The program must sort the integers in the specified submatrix. Then the program must print the revised matrix as the output.

Boundary Condition(s):

2 R, C<=50

1<= Matrix element value <= 10^5

1< X <= R

1<=Y<= C

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space.

The R+2nd line contains X and Y separated by a space.

Output Format:

The first R lines contain the revised matrix.

Example Input/Output 1:

Input:

56

90 49 77 41 32 21

67 71 69 14 94 28

60 87 92 42 88 26

34 75 33 66 51 86

38 99 15 81 97 55

34

Output:

90 49 77 14 21 26

67 71 69 28 32 41

60 87 92 42 88 94

34 75 33 66 51 86

38 99 15 81 97 55
*/
