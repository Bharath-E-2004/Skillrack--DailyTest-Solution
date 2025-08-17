import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        long max = val;
        String valStr = String.valueOf(val);

        for (int i = 0; i < valStr.length(); i++) {
            char currentChar = valStr.charAt(i);
            String binaryStr = bin(currentChar);

            String newValStr = valStr.substring(0, i) + binaryStr + valStr.substring(i + 1);
            try {
                long newVal = Long.parseLong(newValStr);
                max = Math.max(max, newVal);
                System.out.println("Modified value: " + newVal);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid conversion: " + newValStr);
            }
        }

        System.out.println("Maximum value: " + max);
    }

    public static String bin(char val) {
        return Integer.toBinaryString(Character.getNumericValue(val));
    }
}
/*
The program must accept an integer N as the input. The program must print the largest integer that can be formed by replacing a digit with its binary representation in the integer N.

Boundary Condition(s):

1<= N <= 10^8

Input Format:

The first line contains N.

Output Format:

The first line contains an integer value representing the largest integer that can be formed by replacing a digit with its binary representation in the integer N.

Example Input/Output 1:

Input:

392

Output: 310012

Explanation:

The three possible integer values are given below.

Here N = 392. 1192 (3->11) 310012 (9->1001) 3910 (2->10)

Hence the largest integer 310012 is printed as the output.

Example Input/Output 2:

Input:

4765

Output 476101
*/
