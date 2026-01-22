import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        int K = sc.nextInt();

        String[] words = S.split(" ");

        int currentLen = 0;

        for (int i = 0; i < words.length; i++) {
            int wordLen = words[i].length();

            // If a single word itself is longer than K → impossible
            if (wordLen > K) {
                System.out.println("NO");
                return;
            }

            // First word in a line
            if (currentLen == 0) {
                currentLen = wordLen;
            }
            // Try to add word with space
            else if (currentLen + 1 + wordLen <= K) {
                currentLen += 1 + wordLen;
            }
            // Move to next line
            else {
                currentLen = wordLen;
            }
        }

        System.out.println("YES");
    }
}
/*
Split Words ints Lines

The program must accept a string S containing multiple words and an integer K as the input. The program must print YES if it is possible to print the words on separate lines based on the following conditions.

- Each line except the last line must have exactly K characters including the space characters.

- The last line must have less than or equal to K characters including the space characters.

- There should be no leading space in each line.

- If there is a space between two words, then the space is must when printing on the same line.

Only complete words are allowed in each line.

But the space is optional when printing on different lines (ie., only one trailing space is allowed

when printing two words on different lines).

If it is not possible, the program must print NO as the output.

Boundary Condition(s):

1 <= Length of S <= 1000

1 <= K <= 100

Input Format:

The first line contains a string S.

The second line contains K.

Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

Tiger Lion Cow 5

Output: YES

The words in the given string can be printed on separate lines based on the given conditions.

Explanation:

1st line: Tiger

2nd line: Liont

3rd line: Cow

The hash symbol (#) represents a space character
Example Input/Output 2:

Input:

Tiger Cow Lion

5

Output: NO

Example Input/Output 3:

Input:

a an the and was were not carefull

8

Output

YES
*/
