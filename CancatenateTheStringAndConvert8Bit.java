import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        // Read integers and convert to binary
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            String binary = Integer.toBinaryString(val);
            // Pad each binary string to 8 bits
        }
         if(sb.length()%8!=0)
            sb.append("0".repeat(8 - binary.length())).append(binary);
        // Process the binary string in 8-bit chunks
        for (int i = 0; i <= sb.length() - 8; i += 8) {
            String byteStr = sb.substring(i, i + 8);
            int decimal = Integer.parseInt(byteStr, 2);
            System.out.print(decimal + " ");
        }

        sc.close();
    }
}
/*
The program must accept an array of N integers as the Input. The program must find the binary representation of each integer in the array. Then the program must concatenate the binary representations of the N integers. Then the program must split the entire binary representation into bytes(8 bits) from LSB(Least Significant Bit). Finally, the program must print the decimal equivalent of each byte as the output.

Boundary Condition(s):

1 <= N <= 10^4

1<= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the decimal equivalent of each byte separated by a space.

Example Input/Output 1: Input: 5 110 40 85 63 33

Output: 221 69 95 225

Explanation:

110->1101110

40->101000

85-> 1010101

63->111111 33->100001

The concatenated binary representation is given below.

11011101010001010101111111100001

After dividing the binary representation into bytes(8 bits) from LSB, the bytes and their corresponding decimal values are given below.

11011101->221 01000101->69 01011111->95

11100001 -> 225

Example Input/Output 2:

Input:

4

8 10 5 1

Outputc

8 171
*/
