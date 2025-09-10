import java.math.BigInteger;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputValue = scanner.nextLong();
        StringBuilder binaryBuilder = new StringBuilder();

        // Convert each digit to its corresponding 7-segment binary representation
        while (inputValue > 0) {
            int digit = (int) (inputValue % 10);
            binaryBuilder.insert(0, getSegmentBinary(digit));
            inputValue /= 10;
        }

        // Convert the final binary string to a decimal number
        BigInteger decimalValue = new BigInteger(binaryBuilder.toString(), 2);
        System.out.println(decimalValue);
    }

    // Returns the 7-segment binary representation of a digit
    public static String getSegmentBinary(int digit) {
        switch (digit) {
            case 0: return "1111110";
            case 1: return "0110000";
            case 2: return "1101101";
            case 3: return "1111001";
            case 4: return "0110011";
            case 5: return "1011011";
            case 6: return "1011111";
            case 7: return "1110000";
            case 8: return "1111111";
            case 9: return "1111011";
            default: return "0000000"; // fallback for non-digit input
        }
    }
}
/*
Output: 1507123

Explanation:

5 -> 1011011

0 -> 1111110

4 -> 0110011 504->101101111111100110011 -> 1507123

Example Input/Output 2:

Input: 618235

Output:

3277328186587

Explanation:

6->1011111

1-> 0110000

2-> 1101101

3-> 1111001

5->1011011

618235 -> 101111101100001111111110110111110011011011 -> 3277328186587
*/
