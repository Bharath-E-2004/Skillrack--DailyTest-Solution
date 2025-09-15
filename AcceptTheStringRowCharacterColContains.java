import java.util.*;

class Store {
    char val;
    int row;
    int col;

    public Store(char val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxRow = 0, maxCol = 0;
        List<Store> list = new ArrayList<>();

        while (sc.hasNext()) {
            String val = sc.next();
            int i = 0, r = 0, c = 0;

            // Parse row
            while (i < val.length() && Character.isDigit(val.charAt(i))) {
                r = r * 10 + (val.charAt(i) - '0');
                i++;
            }

            // Parse character
            if (i >= val.length()) continue;
            char ch = val.charAt(i++);

            // Parse column
            while (i < val.length() && Character.isDigit(val.charAt(i))) {
                c = c * 10 + (val.charAt(i) - '0');
                i++;
            }

            list.add(new Store(ch, r - 1, c - 1));
            maxRow = Math.max(maxRow, r);
            maxCol = Math.max(maxCol, c);
        }

        char[][] grid = new char[maxRow][maxCol];
        for (char[] row : grid) {
            Arrays.fill(row, '.'); // Fill with default character
        }

        for (Store s : list) {
            grid[s.row][s.col] = s.val;
        }

        for (char[] row : grid) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
/*
The program must accept a string S containing multiple words as the input. Each word in the string S represents an element of a matrix (row position, a character and col position). The program must form a character matrix using the given string S. Then the program must print the character matrix as the output.

Boundary Condition(s):

3<= Length of S <= 10^4

Input Format:

The first line contains S.

Output Format:

The lines contain the character matrix based on the given conditions.

Example Input/Output 1:

Input:

1C3 242 1A1 1D4 2p1 2r3 254 182

Output

ABCD

pqrs

Explanation:

1C3 -> 1st row and 3rd column -> C

2q2 -> 2nd row and 2nd column -> q

1A1 -> 1 row and 1st column -> A

1D4- 1 row and 4th column -> D

2p1 -> 2nd row and 1st column -> p

2r3- 2nd row and 3rd column -> r

254- 2nd row and 4th column ->

182- 1 row and 2nd column ->

Example Input/Output 2:

Input:

3y2 2e2 3z3 2d1 1a1 1b2 2f3 3x1 1c3

Output:

abc

def

xyz
*/
