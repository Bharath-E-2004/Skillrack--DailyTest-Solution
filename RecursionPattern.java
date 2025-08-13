import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        System.out.printf("0\n1\n");
        recursion(val, 2, "0", "1");
        System.out.printf("1\n0");
    }

    public static void recursion(int val, int ind, String prev1, String prev2) {
        if (val < ind) return;

        String curr = prev1 + prev2;
        System.out.println(curr);

        recursion(val, ind + 1, prev2, curr);

        if (val - 1 == ind) {
            System.out.println(curr);
        }
    }
}
/*
The program must accept an integer N as the input. The program must print the Binary Fibonacci pattern of (2°N)-1 lines based on the following conditions.

-The first line contains 0.

The second line contains 1.

-Each line from 3 to N contains the concatenation of previous two lines.

- The remaining N-1 lines contain the water image of the first N-1 lines.

Boundary Condition(s):

3<= N <= 20

Input Format:

The first line contains N.

Output Format:

The first (2*N)-1 lines contain the Binary Fibonacci pattern.

Example Input/Output 1:

Input

6

Output

0

1

01

101

01101

10101101

01101

101

01

1

0
*/
