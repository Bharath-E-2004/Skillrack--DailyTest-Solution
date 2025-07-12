import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        long[] arr = new long[26];

        char last = str.charAt(0); // First character is a letter

        for (int i = 1; i < str.length(); ) {
            int sum = 0;

            // Collect numeric value following the character
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                sum = sum * 10 + Character.getNumericValue(str.charAt(i));
                i++;
            }

            // Add the value to the corresponding character index
            arr[last - 'a'] += sum;

            // If next character exists, update 'last'
            if (i < str.length()) {
                last = str.charAt(i);
                i++;
            }
        }

        // Output the result
        char ch = 'a';
        for (long val : arr) {
            if (val > 0) {
                System.out.print(ch + "" + val);
            }
            ch++;
        }
    }
}
/*
The program must accept a string S as the input. The string & contains a series of alphabet-integer pairs. The integer value in each pair represents the frequency of the related alphabet.
The program must compress the string by merging the pairs having the same alphabet (i.e., a single alphabet with the total frequency. 
For example, "a3a5a8" can be merged like "a16", where 163+5+ 8). Finally, the program must print the compressed string as the output. 
The alphabets in the compressed string must be sorted in alphabetical order.

Note: The alphabets in S are always in lower case.

Boundary Condition(s): 2 <= Length of S <= 100

Input Format: The first line contains S.

Output Format: The first line contains the compressed string.

Example Input/Output 1: Input:

a3t4a5a8c2

Output: a16c2t4

Explanation:

Here the given string is a3t4a5a8c2.

After compressing the string by merging the pairs having the same alphabet, the compressed string becomes a16c2t4.

Example Input/Output 2: Input: x1y1z1a2b2k10a3b3x1y1z1

Output: a5b5k10x2y2z2
*/
