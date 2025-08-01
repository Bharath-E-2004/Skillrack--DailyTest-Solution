import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String[] array = new String[row];
        StringBuilder sb = new StringBuilder();

        // Read input strings and build a combined string
        for (int i = 0; i < row; i++) {
            array[i] = sc.nextLine();
            sb.append(array[i]).append(" ");
        }

        // Check for specific pattern in each row
        for (int i = 0; i < row; i++) {
            boolean found = false;

            for (int j = 1; j <= col; j++) {
                String target = "" + (i * col + j);

                if (array[i].contains(target)) {
                    found = true;
                    break;
                }

                if (!sb.toString().contains(target)) {
                    found = false;
                    break;
                }
            }

            if (!found) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}

/*
Example Input/Output 1:

Input:

3 4

5 6 3 8

1 2 10 7

11 9 12 4

Output:

Yes

Explanation:

N=3*4 12. All the values from 1 to 12 are present.

1st row contains 3 (that is for at least one value from 1 to 4).

2nd row contains 7 (that is for at least one value from 5 to 8).

3rd row contains 9, 11, 12 (that is for at least one value from 9 to 12).

As all the conditions are satisfied the output is Yes.

Example Input/Output 2:

Input:

3 4

5 6 3 8

1 2 10 12

11 9 7 4

Output:

No
*/
