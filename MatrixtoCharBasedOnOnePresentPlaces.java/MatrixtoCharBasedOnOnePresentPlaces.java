import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        char ch = sc.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    System.out.print(ch + " ");

                    // Update character circularly (A–Z, a–z)
                    if (ch >= 'A' && ch < 'Z') {
                        ch++;
                    } else if (ch == 'Z') {
                        ch = 'A';
                    } else if (ch >= 'a' && ch < 'z') {
                        ch++;
                    } else if (ch == 'z') {
                        ch = 'a';
                    }

                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
The program must accept an integer matrix of size R°C and an alphabet CH as the input. The program must replace all the 1s with the alphabets starting from CH. Consider the English alphabet set in circular fashion when replacing the 1s. Finally, the program must print the revised matrix as the output.

Boundary Condition(s):

2<R, C<= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

The R+2nd line contains CH.

Output Format:

The first R lines contain the revised matrix.

Example Input/Output 1:

Input

34

0101

0000

1001

x

Output:

0x0y

0000

Z00a
*/
