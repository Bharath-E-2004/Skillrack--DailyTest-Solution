import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        scanner.close();

        printThePattern(val);
        System.exit(0);
    }

    public static void printThePattern(int val) {
        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.print((j % val == i) ? "*" : "-");
            }
            System.out.println();
        }
    }
}
/*
The program must accept an integer N as the input. The program must form a grid of hyphens of size (N^2)(N^2).
Then the program must replace the top-left to bottom-right diagonal in each N°N subgrid with asterisks.
Finally, the program must print the (N^2)(N^2) grid as the output.

Boundary Condition(s):

1 <= N <= 15

Input Format:

The first line contains N.

Output Format:

The first N'N lines contain the pattern as shown in the Example Input/Output section.
*/
