import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] bin = new String[N];

        // Generate binary strings from 1 to N
        for (int i = 0; i < N; i++) {
            bin[i] = Long.toBinaryString(i + 1);
        }

        // Special case: if N >= 10^4, print N ones and exit
        // Print binary strings column-wise
        for (int i = 0; i < bin[0].length(); i++) {
            for (int j = 0; j < N; j++) {
                if (i < bin[j].length()) {
                    System.out.print(bin[j].charAt(i));
                } else {
                   break;// Fill with space if shorter
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
/*
Explanation:

The binary representation of the integers from 1 to 8 are given below.

1->1

2->10

3->11

4->100

5->101

6->110

7->111

8->1000

The binary representations of the integers from 8 to 1 are printed vertically.

Example Input/Output 2:

Input

17

Output:

11111111111111111

0011110000110010

00110011001010

0010101010

10
*/
