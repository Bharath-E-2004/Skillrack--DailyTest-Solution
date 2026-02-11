import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read tap code string
        String S = sc.nextLine();

        // Read 5x5 matrix
        String[][] matrix = new String[5][5];
        for (int i = 0; i < 5; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = row[j];
            }
        }

        String[] groups = S.split(" ");
        StringBuilder result = new StringBuilder();

        // Process in pairs
        for (int i = 0; i < groups.length; i += 2) {
            int row = groups[i].length();       // number of dots = row
            int col = groups[i + 1].length();   // number of dots = column

            String cell = matrix[row - 1][col - 1];

            // If cell contains '/', take left side
            if (cell.contains("/")) {
                result.append(cell.charAt(0));
            } else {
                result.append(cell);
            }
        }

        System.out.println(result.toString());
    }
}
/*
The program must accept a string S and a character matrix of size 5*5 as the input. The string S represents a tap code that contains dots and space characters. The 5*5 matrix represents the tap code table which contains 26 unique lower case alphabets, where exactly one cell contains two alphabets separated by a slash symbol (). The program must decrypt the given tap codie and find the string value using the given tap code table. Every pair of groups of dats in the string S represents the row and column position of an alphabet in the tap code table. Finally, the program must print the decrypted string value as the output. The program must consider the alphabet on the left side of the slash symbol when decrypting the tap codle.

Boundary Condition(s):

1 <= Number of pairs of groups of dots <= 100

Input Format:

The first line contains S

The next 5 lines contain the character matrix representing the tap code table.

Output Format:

The first line contains the decrypted string value.

Example Input/Output 1:

Input

abc/kde

fghij

Imnop

qrstu

vwxyz

Output: store
*/
