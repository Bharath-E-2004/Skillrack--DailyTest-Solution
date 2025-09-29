import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        char target = sc.next().charAt(0);
        char reverse = target;

        boolean isLower = Character.isLowerCase(target);

        for (int[] arr : matrix) {
            for (int val : arr) {
                if (val == 1) {
                    System.out.print(target);

                    // increment
                    target++;
                    if (isLower && target > 'z') {
                        target -= 26;
                    } else if (!isLower && target > 'Z') {
                        target -= 26;
                    }

                } else {
                    System.out.print(reverse);

                    // decrement
                    reverse--;
                    if (isLower && reverse < 'a') {
                        reverse += 26;
                    } else if (!isLower && reverse < 'A') {
                        reverse += 26;
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Example Input/Output 1:

Input

34

0101

0000

1001

X

Output:

xxwy

vuts

zrqa

Explanation:

Here R=3, C=4 and the given 3*4 matrix is

0101

0000

1001

The given alphabet CH is 'x'.

After replacing the 1s with the alphabets starting from 'x' and Os with the alphabets starting

from 'x' in reverse order, the matrix becomes

xxwy

vuts

zrqa

Example Input/Output 2:

Input

44

0001

0000

0001

1111

C

Output:

CBAC

ZYXW

VUTD

EFGH


*/
