import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] digitWords = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        long sum = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int number = 0;

            for (int idx = 0; idx < s.length(); ) {
                char ch = s.charAt(idx);

                // Case 1: digit character
                if (Character.isDigit(ch)) {
                    number = number * 10 + (ch - '0');
                    idx++;
                }
                // Case 2: word digit
                else {
                    for (int d = 0; d <= 9; d++) {
                        if (s.substring(idx).startsWith(digitWords[d])) {
                            number = number * 10 + d;
                            idx += digitWords[d].length();
                            break;
                        }
                    }
                }
            }
            sum += number;
        }

        System.out.println(sum);
    }
}
/*
The program must accept N integers as the input, but certain digits in some integers are denoted in words (in lower case). The program must find the integer values and print their sum as the output.

Note: The value of each integer less than or equal to 10^5.

Boundary Condition(s):

1 <= N <= 100

Input Format:

The first line contains N.

The second line contains N integers separated by a space, but certain digits in some integers are denoted in words.

Output Format:

The first line contains an integer representing the sum of N integers.

Example Input/Output 1:

Input

4 10zero five6 75 2four9

Output 480

Explanation:

10zero -> 100

five6 -> 56 75-> 75 2four9 -> 249 100+56+75 + 249-480

Example Input/Output 2:

Input:

5 six38eight four70three 3seven4zero threefivethreeseven 15eight4
*/
