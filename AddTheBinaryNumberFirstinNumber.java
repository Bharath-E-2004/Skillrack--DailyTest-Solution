import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            String binaryStr = Integer.toBinaryString(num);

            // Find the position of the first '1' from the right (excluding trailing zeros)
            int lastOneIndex = binaryStr.lastIndexOf('1');
            int pow = binaryStr.length() - lastOneIndex - 1;

            sum += Math.pow(2, pow);
        }
            System.out.println(sum);
    }
}

/*
The program must accept N integers as the input. For each integer X among the N integers, the program must find the last occurrence of 1 in the binary representation of X. Then the program must find the corresponding power of 2 value for that last occurrence of 1. Finally, the program must print the sum S of those powers of 2 as the output.

Boundary Condition(s):

1 <= N <= 100

1 <= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains S.

Example Input/Output 1:

Input: 5 12 10 8 15 22

Output: 17

Explanation:

12 -> 1100->4 10-> 1010->2 8->1000->8 15->1111 -> 1 22-> 10110 -> 2

4+2+8+1+2-17

Example Input/Output 2: Input: 4 100 64 55 72

Output 77
*/
