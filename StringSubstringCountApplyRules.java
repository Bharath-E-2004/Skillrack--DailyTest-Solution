import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();

        int count = str.length();           // every single char is special

        // check all substrings of length ≥ 2
        for (int len = 2; len <= str.length(); len++) {
            for (int start = 0; start <= str.length() - len; start++) {
                String sub = str.substring(start, start + len);
                if (isSpecial(sub)) count++;
            }
        }
        System.out.println(count);
    }

    /**
     * Returns true if the given substring is “special”.
     */
    private static boolean isSpecial(String s) {

        // Collect the distinct characters in the substring
        Set<Character> set = s.chars()
                              .mapToObj(c -> (char) c)
                              .collect(Collectors.toSet());

        // Case 1: all identical characters
        if (set.size() == 1) return true;

        // Case 2: odd length, exactly two distinct characters,
        //         and all characters except the middle one are identical
        if (s.length() % 2 == 1 && set.size() == 2) {
            int mid = s.length() / 2;
            char midChar = s.charAt(mid);
            char edgeChar = s.charAt(0);

            if (midChar == edgeChar) return false; // middle must be the different one

            // verify that every position except the middle matches edgeChar
            for (int i = 0; i < s.length(); i++) {
                if (i == mid) continue;
                if (s.charAt(i) != edgeChar) return false;
            }
            return true;
        }

        return false;
    }
}
/*
The program must accept a string S as the input. The program must print the count of special substrings in S as the output. A special substring is a substring in which all the characters are the same or all the characters are the same except middle character.

Boundary Condition(s): 1 <= Length of S <= 100

Input Format:

The first line contains S.

Output Format:

The first line contains an integer representing the count of special substrings in S.

Example Input/Output 1:

Input:

abcbcdcc

Output: 12

Explanation:

The 12 special substrings are given below.

a, b, c, b, c, d, c, c, cc, bcb, cbc, các

Example Input/Output 2: Input:

Output: 19

Explanation:

The 19 special substrings are given below.

AAAAB,B,C,B. 8, AA, AA, AA, 88, 88, AAA, AAA, BCB, AAAA, BBC88
*/
