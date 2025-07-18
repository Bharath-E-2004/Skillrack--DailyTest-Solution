import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        String str = sc.nextLine();

        String bin = String.format("%26s", Integer.toBinaryString(num)).replace(' ', '0');
        int ind = 0;

        for (char alpha = 'Z'; alpha >= 'A'; alpha--) {
            if (str.indexOf(alpha) == -1) {
                if (ind >= bin.length() || bin.charAt(ind) != '1') {
                    System.out.println("NO");
                    System.exit(0);
                }
                ind++;
            }
        }

        System.out.println("YES");
    }
}
/*
  The program must accept an integer N and a string S containing only upper case alphabets as the input. The binary representation of N indicates the status of 26 upper case alphabets based on the following conditions.

- The 26-bits from LSB(least significant bit) to MSB(most significant bit) are mapped to the 26 upper case alphabets(A-Z).

- Each 1 in the binary representation indicates the presence of the corresponding upper case alphabet.

- Each 0 in the binary representation indicates the absence of the corresponding upper case alphabet.

The program must print YES if the string S is formed using only the alphabets indicated by the binary representation of N. Else the program must print NO as the output.

Boundary Condition(s):

1 <= N < 2^26

1 <= Length of S <= 100

Input Format:

The first line contains N. The second line contains S.

Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

10

BDBB

Output: YES

Explanation:

The binary representation of 10 and the alphabet mapping are given below. 00000000000000000000001010

ZYXWVUTSRQPONMLKJIHGFEDCBA

The alphabets that can be used to form a string are B and D.

Here the string BDBB is formed using only the alphabets B and D.

So YES is printed as the output.
*/
