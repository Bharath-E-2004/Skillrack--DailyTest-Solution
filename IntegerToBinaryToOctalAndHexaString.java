import java.util.*;

public class Hello {
    public static void main(String[] args) {

        int N = new Scanner(System.in).nextInt();
        String binary = Integer.toBinaryString(N);

        StringBuilder result = new StringBuilder();
        int len = binary.length();
        boolean useOctal = true;

        while (len > 0) {
            int groupSize = useOctal ? 3 : 4;

            int start = Math.max(0, len - groupSize);
            String chunk = binary.substring(start, len);

            if (useOctal) {
                chunk = String.format("%3s", chunk).replace(' ', '0');
                int value = Integer.parseInt(chunk, 2);
                result.append(Integer.toOctalString(value));
            } else {
                chunk = String.format("%4s", chunk).replace(' ', '0');
                int value = Integer.parseInt(chunk, 2);
                result.append(Integer.toHexString(value).toUpperCase());
            }

            len = start;
            useOctal = !useOctal;
        }

        System.out.println(result.reverse().toString());
    }
}
/*
The program must accept an integer N as the input. The program must find the binary representation of the integer N. Then the program must form a new number X based on the following conditions.

- The program must find the octal equivalent of three bits from LSB. Then the program must find the hexadecimal equivalent of the next four bits. Then the program must find the octal equivalent of the next three bits, and so on.

- Then the program must combine the resulting digits to create the number X. Finally, the program must print the value of X as the output.

Boundary Condition(s): 1 <= N <= 10^8

Input Format: The first line contains N.

Output Format: The first line contains X.

Example Input/Output 1:

Input:

5980

Output: 5684

Explanation:

Here N = 5980.

5980->1011101011100-> 0101 110 1011 100

100->4 (octal)

1011 -> B (hexadecimal)

110 -> 6 (octal)

0101-5 (hexadecimal)

After combining the resulting digits, the value of X becomes 5684. Hence the output is 5684.

Example Input/Output 2: Input: 

108799

Output:

6A1F7

Explanation:

Here N = 108799.

108799 -> 11010100011111111 -> 110 1010 001 1111 111

111 -> 7 (octal)

1111 -> F (hexadecimal)

001 -> 1 (octal)

1010 -> A (hexadecimal)

110 -> 6 (octal)

After combining the resulting digits, the value of X becomes 6A1F7.

Hence the output is 6A1F7.
*/
