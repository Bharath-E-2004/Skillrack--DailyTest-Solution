import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char delimiter = str.charAt(0);

        List<String> segments = new ArrayList<>();
        int start = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                segments.add(str.substring(start, i));
                start = i;
            }
        }
        segments.add(str.substring(start)); // Add the last segment

        Collections.sort(segments);

        for (String segment : segments) {
            System.out.println(segment);
        }

        scanner.close();
    }
}
/*
The program must accept a string S as the input. The program must split the string S into as many substrings as possible so that each substring starts with the first character of S. Then the program must print those substrings in sorted order as the output.

Boundary Condition(s): 2 <= Length of S <= 100

Input Format: The first line contains S.

Output Format:

The first line contains the substrings of S separated by a space based on the given conditions.

Example Input/Output 1:

Input:

owiaxtion

Output: on owl adi

Explanation:

The first character of the given string is a

The substrings that start with the character o are given below. owl axli on

So they are printed in sorted order.

Example Input/Output 2:

Input

bookbankbloodbaby

Output:

be bank blood book by
*/
