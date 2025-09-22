import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Stack<Long> stk = new Stack<>();

        int maxConsecutiveZeros = 0;

        for (int i = 0; i < size; i++) {
            long val = sc.nextLong();
            int consecutiveZeros = getMaxConsecutiveZeros(val);

            if (consecutiveZeros > maxConsecutiveZeros) {
                maxConsecutiveZeros = consecutiveZeros;
                stk.clear(); // Clear previous entries
                stk.push(val);
            } else if (consecutiveZeros == maxConsecutiveZeros) {
                stk.push(val);
            }
        }

        System.out.println("Numbers with max consecutive zeros in binary:");
        System.out.println(stk);
    }

    public static int getMaxConsecutiveZeros(long val) {
        int max = 0, count = 0;
        for (char c : Long.toBinaryString(val).toCharArray()) {
            if (c == '0') {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
/*
The program must accept N integers and print the integers having the longest sequence of consecutive zeroes in their reverse order of occurrence.

Boundary Condition(s):

1 <= N <= 10^4

1 <= Each integer value <= 10^18

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the integer values separated by a space.

Example Input/Output 1:

Input

5

9 10 32 65 7

Output 65 32

Explanationc

32 binary representation is 100000 having 5 consecutive zeroes.

65 binary representation is 1000001 having 5 consecutive zeroes.

They are printed in the reverse order of occurrence.

Example Input/Output 2:

Input:

4 925 10

Output: 9
*/
