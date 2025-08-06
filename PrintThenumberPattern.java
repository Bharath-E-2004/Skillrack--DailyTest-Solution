import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();


        System.out.println("*");

        int size = 1;
        for (int i = 1; i <= 2 * val - 1; i++) {
            System.out.print("*");

            int v1 = 1;
            for (int j = 1; j <= size; j++) {
                System.out.print(v1);
                v1 = (j < (size / 2 + 1)) ? v1 + 1 : v1 - 1;
            }

            size = (i < val) ? size + 2 : size - 2;

            System.out.println("*");
        }

        System.out.println("*");

        scanner.close();
    }
}
/*
Example Input/Output 1:

Input

3

Output

7

121

12321

121

1

Explanation:

Here N=3, so the pattern contains 7 lines((2*3)+1) of output.

The 1st layer of the triangle contains asterisks.

The 2nd layer of the triangle contains 1s.

The 3rd layer of the triangle contains 25.

The 4th (inner) layer of the triangle contains 3.

Example Input/Output 2:

Input

4

Output

1

121

12321

1234321

12321

121

1

*/
