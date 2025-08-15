import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt(); // 'col' is unused but kept for compatibility

        String input = sc.next();
        int len = input.length() / row;

        for (int i = 0; i < len; i++) {
            String sub = input.substring(i * row, i * row + row);
            printPattern(sub, row, len);
        }

        sc.close();
    }

    public static void printPattern(String sub, int row, int len) {
        int ind = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row * len; j++) {
                if (i % row == row / 2 && j % row == row / 2) {
                    System.out.print(sub.charAt(ind++));
                } else {
                    System.out.print('*');
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}


/*
The program must accept two integers N, X and a string S as the input. The length of the string S is always N°N. The value of X is always odd. The program must form a grid of asterisks of size (N*X)*(N*X). For each X*X subgrid, the program must replace the middle element with the corresponding character in the string S(left to right). Finally, the program must print the revised grid as the output.

Boundary Condition(s):

1 <= N, X <= 25

Input Format:

The first line contains N and X separated by a space.

The second line contains S.

Output Format:

The first N*X lines contain the grid based on the given conditions.
*/
