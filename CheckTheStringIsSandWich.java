import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(CheckSandwichString(input) ? "YES" : "NO");
        sc.close();
    }

    private static boolean CheckSandwichString(String str) {
        List<String> parts = new ArrayList<>();
        int start = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(start) == str.charAt(i)) {
                parts.add(str.substring(start, i));
                start = i;

                if (parts.size() > 3) {
                    return false;
                }
            }
        }

        parts.add(str.substring(start));

        return parts.size() == 3 && parts.get(0).equals(parts.get(2));
    }
}
/*
The program must accept a string S as the input. The program must print "YES" if the given string a sandwich string. Else the program must print "NO" as the output. A sandwich string is a string that is formed by two identical ends and a different middle. The sandwich string contains only 2 unique characters.

Boundary Condition(s): 1 <= Length of S <= 100

Input Format:

The first line contains S.

Output Format: The first line contains YES or NO.

Example Input/Output 1:

Input:

XXYYYXX.

Output: YES

Explanation:

Here the given string is XXYYYXX. The given string has two identical ends as XX and the different middle as YYY. So YES is printed as the output.

Example Input/Output 2:

Input:

5@@5

Output:

YES
*/
