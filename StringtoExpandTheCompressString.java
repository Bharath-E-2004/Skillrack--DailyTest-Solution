import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256]; // store frequency of each character already printed
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {

            char c = str.charAt(i++);
            int num = 0;

            // read full number (multi-digit supported)
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');
                i++;
            }

            // digit - frequency previously printed = how many to print now
            int toPrint = num - freq[c];

            // update freq
            freq[c] = num;

            // print required occurrences
            for (int j = 0; j < toPrint; j++)
                result.append(c);
        }

        System.out.print(result.toString());
    }
}

/*
In a string compression technique, a string can be compressed based on the following condition.

- If a character occurs consecutively(possibly once) in the string, then those characters must be replaced with the single character and the frequency of the character till that position in the string.

For example, aaabbcccaaabbb can be compressed as a3b2c3a6b5. abcabcaabbcc can be compressed as a1b1c1a2b2c2a4b4c4.

The program must accept a string S representing a compressed string as the input. The program must expand the given string and print the original string as the output.

Boundary Condition(s): 2<= Length of S <= 100

Input Format: The first line contains S.

Output Format:

The first line contains the expanded string based on the given conditions.

Example Input/Output 1:

Input: a3b3c3a6

Output: aaabbbcccaaa

Explanation: a3-> aaa b3-> bbb c3-> ccc a6-> aaa (already the character 'a' has occurred thrice before)

Example Input/Output 2: Input: x5y2z1x6y3z6

Output :
xxxxxyyzzzzz
*/
