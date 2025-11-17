import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();

        int l1 = s1.length(), l2 = s2.length(), l3 = s3.length(), l4 = s4.length();

        int row = Math.max(l1, l2) + Math.max(l3, l4);
        int col = Math.max(l1, l3) + Math.max(l2, l4);

        char array[][] = new char[row][col];

        // fill with *
        for (int i = 0; i < row; i++)
            Arrays.fill(array[i], '*');

        int midRow = Math.max(l1, l2) - 1;
        int midCol = Math.max(l1, l3) - 1;

        // Print S1 (middle → top-left)
        for (int k = 0; k < l1; k++) {
            int i = midRow - k;
            int j = midCol - k;
            if (i >= 0 && j >= 0) array[i][j] = s1.charAt(k);
        }

        // Print S2 (middle → top-right)
        for (int k = 0; k < l2; k++) {
            int i = midRow - k;
            int j = midCol + k;
            if (i >= 0 && j < col) array[i][j] = s2.charAt(k);
        }

        // Print S3 (middle → bottom-left)
        for (int k = 0; k < l3; k++) {
            int i = midRow + k;
            int j = midCol - k;
            if (i < row && j >= 0) array[i][j] = s3.charAt(k);
        }

        // Print S4 (middle → bottom-right)
        for (int k = 0; k < l4; k++) {
            int i = midRow + k;
            int j = midCol + k;
            if (i < row && j < col) array[i][j] = s4.charAt(k);
        }

        // print array
        for (char[] arr : array) {
            System.out.println(new String(arr));
        }
    }
}
/*
The program must accept four string values S1, S2, S3 and 54 as the input. The program must print the irregular X-shape pattern using the four string values. The string 51 must be printed from the middle to the top-left, S2 must be printed from the middle to the top-right, 53 must be printed from the middle to the bottom-left and S4 must be printed from the middle to the bottom-right. The empty spaces must be printed as asterisks as shown in the Example Input/Output section.

Boundary Condition(s):

3 <= Length of S1, S2, S3, S4 <= 100

Input Format:

The first line contains S1.

The second line contains $2.

The third line contains S3.

The fourth line contains S4.

Output Format:

The lines contain the irregular X-shape pattern as shown in the Example Input/Output section.
*/
