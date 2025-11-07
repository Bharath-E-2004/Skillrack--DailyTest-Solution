import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ind = 0;

        while (ind < str.length()) {

            // Find next occurrence of the same character
            int nextIndex = str.indexOf(str.charAt(ind), ind + 1);

            if (nextIndex != -1) {
                // Print substring from current index to next matched index (inclusive)
                System.out.println(str.substring(ind, nextIndex + 1));
            } else {
                break;
            }

            ind++;
        }

    }
}

/*
he program must accept a string 5 as the input. The program must print the output based on The following conditions.

The program must print the substring from the first letter to its next occurrence in the string

Then the program must print the substring from the second letter of the previously printedi substring to its next occurrence in the string 5.

-The program must repeat the above process till there is no next occurence of the second etter of the previously printed substring.

Note: There will be at least two occurrences of the first letter in the string S.

Boundary Condition(s): 2 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The lines, each contains a string value representing the substrings of S based on the given conditions.

Example Input/Output 1:

Input:

abcdebabcd

Output:

abcdeba

bcdeb

cdebabc

debabcd
*/
