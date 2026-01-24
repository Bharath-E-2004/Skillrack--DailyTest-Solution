import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String result = words[0];

        for (int i = 1; i < words.length; i++) {
            String curr = words[i];
            int maxOverlap = 0;

            int limit = Math.min(result.length(), curr.length());

            // find maximum overlap
            for (int j = limit; j > 0; j--) {
                if (result.endsWith(curr.substring(0, j))) {
                    maxOverlap = j;
                    break;
                }
            }

            // append remaining part
            result += curr.substring(maxOverlap);
        }

        System.out.print(result);
    }
}
/*
The program must accept a string S containing multiple words as the input. The words in a given string are always connected by at least one character at the ends (ie, some characters at the end of each word occur at the beginning of the next word). The program must form the shortest string by connecting the words from left to right (ie, removing the duplicate characters in the overlap). Finally, the program must print the shortest string as the output

Boundary Condition(s):

3 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The first line contains the shortest string

Example Input/Output 1:

Input

water terminator ortho holly yellow awł

Output

waterminatorthollyellow!

Explanation:

Here S = "water terminator ortho holly yellow owl".

The shortest string is formed by connecting the words as given below.

water+terminator -> waterminator

waterminator+ortho -> waterminatortho

waterminatortho+holly-> waterminatortholly waterminatortholly+yellow -> waterminatorthollyellow

waterminatorthollyellow+awl-> waterminatorthollyellowl

Example Input/Output 2:

Input: cat tap pig gun

Output: catapigun
*/
