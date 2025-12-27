import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();   // N as string
        int digit = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {

            // skip minus sign
            if (str.charAt(i) == '-') continue;

            // check if digit matches
            if (str.charAt(i) - '0' == digit) {

                String formed =
                        str.substring(0, i) + str.substring(i + 1);

                int value = Integer.parseInt(formed);
                max = Math.max(max, value);
            }
        }

        System.out.println(max);
    }
}
/*
The program must accept an integer N and a digit Das the input. The program must print the maximum possible integer value that can be formed by removing the digit D exactly once in the integer N.

Note: The integer N will have at least one digit D.

Boundary Condition(s): -10^5 <= N <= 10^5

Input Format:

The first line contains N.

The second line contains D.

Output Format:

The first line contains an integer representing the maximum possible integer value based on the given conditions.

Example Input/Output 1:

Input: 26967 6

Output: 2967

Explanation:

Here N 26967 and D = 6. The two possible integer values obtained by removing the digit 6 exactly once in N are 2697 and 2967.

The maximum value between the above two integers is 2967. Hence 2967 is printed as the output.

Example Input/Output 2: Input: -4749 4

Output: -479
*/
