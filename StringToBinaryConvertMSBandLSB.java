import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int num = sc.nextInt();

        String bin = Integer.toBinaryString(num);

        int i = 0;

        for (i = 0; i < bin.length(); i++) {
            System.out.print(bin.charAt(i) == '1' ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)));
        }

        System.out.println(str.substring(i));

        i = str.length() - bin.length();

        System.out.print(str.substring(0, 1));

        for (int j = 0; j < bin.length(); j++) {
            System.out.print(bin.charAt(j) == '1' ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)));
            i++;
        }

        System.exit(0);
    }
}
/*
The program must accept a string S and an integer X as the input. The program must print two string values based on the following conditions.

- For each is from MSB in the binary representation of X, the program must toggle the characters in the same position to upper case and for each Os, the program must toggle the characters to lower case. The remaining characters in the string S must not be altered. Then the program must print the modified string in the first line of output.

- For each 1s from LSB in the binary representation of X, the program must toggle the characters in the same position to upper case and for each Os, the program must toggle the characters to lower case. The remaining characters in the string S must not be altered. Then the program must print the modified string in the second line of output.

Note: The length of the string S is always greater than or equal to the number of bits in the binary representation of X.

Boundary Condition(s): 1<= Length of S <= 100 1<X<= 10^8

Input Format:

The first line contains S. The second line contains X.

Output Format:

The first line contains a string value. The second line contains a string value.

Example Input/Output 1:

Input: BasketBall 23

Output BaSKEtBall BaskeTBALL

Explanation:

Here the given string is BasketBall and the value of K is 23.

The binary representation of 23 is 10111.

BasketBall -> BaSKEtBall

BasketBall -> BaskeTbALL

Example Input/Output 2:

Input:

PAPER

10

Output:

PaPeR

PApEr
*/
