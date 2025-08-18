import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int dash = 0;
        int addition = (N - 1) * 4;

        for (int i = 0; i < N; i++) {
            // Print leading dashes and one asterisk
            System.out.print("-".repeat(dash) + "*");

            // Print the pattern of asterisks and dashes
            for (int j = 1; j <= addition; j++) {
                if ((i == 0 && j % 2 == 0) || j == addition / 2 || j == addition) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }

            addition -= 4;
            dash += 2;
            System.out.println();
        }

        scanner.close();
        System.exit(0);
    }
}
/*
The program must accept an integer N as the input. The program must print the desired pattern as shown in the Example Input/Output section.

Boundary Condition(s):

2 <= N <= 50

Input Format:

The first line contains N.

Output Format:

The first N lines contain the desired pattern as shown in the Example Input/Output section.
*/
