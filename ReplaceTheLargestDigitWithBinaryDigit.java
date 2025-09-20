import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long total = 0;

        for (int i = 0; i < size; i++) {
            total += convert(sc.nextInt());
        }

        System.out.println(total);
    }

    public static long convert(int val) {
        String str = String.valueOf(val);

        for (int digit = 9; digit >= 0; digit--) {
            int index = str.indexOf(String.valueOf(digit));
            if (index != -1) {
                String binary = Integer.toBinaryString(digit);
                String replaced = str.substring(0, index) + binary + str.substring(index + 1);
                return Long.parseLong(replaced);
            }
        }

        return -1; // If no digit found (shouldn't happen with valid input)
    }
}
/*
The program must accept N integers as the input. For each integer X among the N integers, the program must replace the largest digit with its binary representation. Then the program must print the sum of the N revised integers as the output. If the largest digit occurs more than once in an integer, then consider the first occurrence in the integer.

Boundary Condition(s):

1 <= N <=100 1 <= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains an integer representing the sum of the N revised integers.

Example Input/Output 1:

Input: 4 204 535 190 99

Output 150264

Explanation: 204-> 20100 535 -> 10135 190 -> 110010 99 -> 10019 20100 + 10135 + 110010 + 10019 = 150264.

Example Input/Output 2: Input: 5 93 99 34 56 20

Output 28342
*/
