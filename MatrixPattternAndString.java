import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of rows and columns
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Read the matrix
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read the string
        sc.nextLine(); // Consume newline before reading the string
        String str = sc.nextLine();

        // Validate length
        if (str.length() != row) {
            System.out.println("NO");
            return;
        }

        // Use a map to track row-pattern to character
        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < row; i++) {
            // Convert row to a string representation
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                sb.append(matrix[i][j]).append(",");
            }
            String rowKey = sb.toString();

            char ch = str.charAt(i);

            if (map.containsKey(rowKey)) {
                if (map.get(rowKey) != ch) {
                    System.out.println("NO");
                    return;
                }
            } else {
                map.put(rowKey, ch);
            }
        }

        System.out.println("YES");
    }
}
/*
Example Input/Output 1:

Input

5 4

2 8 8 3

6 8 7 2

2 8 8 3

9 6 3 4

6 8 7 2

ABACB

Output:

YES

Explanation:

Here P = "ABACB".

1st & 3rd alphabets are the same. Similarly, the 1st and 3rd rows of the matrix are the same. 2nd & 5th alphabets are the same. Similarly, the 2nd and 5th rows of the matrix are the same. 4th alphabet is not repeated. Similarly, the 4th row of the matrix is not repeated.

Example Input/Output 2:

Input

6 5

10 20 30 40 50

10 20 30 40 50

60 70 80 90 99

10 20 30 40 50

60 70 80 90 99

10 20 30 40 50

GGHGHK

Output:

NO
*/
