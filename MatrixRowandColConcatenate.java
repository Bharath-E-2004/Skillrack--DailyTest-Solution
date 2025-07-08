import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = sc.nextInt();
                String str = "" + (i + 1) + (j + 1);  // Construct position string
                if (Integer.parseInt(str) == val) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
/*
The program must accept an integer matrix of size R°C as the input. The program must print the number of cells having the values as same as the concatenation of the row and column coordinates in the matrix.

Boundary Condition(s):

1<= R, C <= 50

1<= Matrix element value <= 9999

Input Format:

The first line contains R and C separated by a space. The next R lines, each contains C integers separated by a space.

Output Format:

The first line contains an integer representing the number of cells having the values as same as the concatenation of the row and column coordinates in the matrix.

Example Input/Output 1:

Input:

55

34 21 32 41 25

14 42 43 24 31

54 45 33 34 23

33 15 51 31 35

21 52 53 13 55

Output:

6

Explanation:

In the given matrix, the six cells which are having the values as same as the concatenation of the row and column coordinates are highlighted below. 34 21 32 41 25

14 42 43 24 31

54 45 33 34 23

33 15 51 31 35

21 52 53 13 55
*/
