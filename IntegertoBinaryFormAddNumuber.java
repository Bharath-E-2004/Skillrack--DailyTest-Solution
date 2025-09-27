import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val = sc.nextLong();   // Input number

        Stack<Integer> stk = new Stack<>();
        int start = 0;

        // Convert number into binary and store positions of set bits
        while (val > 0) {
            if (val % 2 == 1) {
                stk.push(start);  // store the power of 2
            }
            val /= 2;
            start++;
        }

        // Print as sum of powers of 2
        if (!stk.isEmpty()) {
            System.out.print((int) Math.pow(2, stk.pop()));
        }

        while (!stk.isEmpty()) {
            System.out.print(" + " + (int) Math.pow(2, stk.pop()));
        }
    }
}
/*
Example Input/Output 1

Input

10

Output

8+2

Explanation:

Here 10 whose Binary representation is 1010

112^3=8

0702^2-0

1121-2

0020-0

Hence the output is 8+2.

Example Input/Output 2:

Input

15

Output

8+4+201

Example Input/Output 3

Input

83

Output

64+16+2+1
*/
