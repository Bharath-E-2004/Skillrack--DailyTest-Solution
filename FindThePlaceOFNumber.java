import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length() - 1;

        for (char digit : str.toCharArray()) {
            if (digit != '0') {
                System.out.print((digit + "").repeat(len));
                len--;
            }
        }

        System.exit(0);
    }
}
/*
The program must accept an integer N and print the expanded number.

Boundary Condition(s):

1 <= N <= 10^9

Input Format:

The first line contains N.

Output Format:

The first line contains the expanded number.

Example Input/Output 1:

Input

5180

Output

5000+100+80

Explanation: 0 is not considered.

Example Input/Output 2:

Input:

500619

Output

500000+600+10+9
*/
