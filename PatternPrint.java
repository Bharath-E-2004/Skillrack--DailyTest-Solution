import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String h = "-".repeat(2 * (n - 1));       // Hyphens on each side
            String s = "*".repeat(2 * i - 1);         // Center stars
            String b = "[".repeat(i) + s + "]".repeat(i);  // Brackets and stars

            System.out.println(h + b + h);
        }

        sc.close();
    }
}
/*
The program must accept an integer N as the input. The program must print the desired pattern of N lines as shown in the Example Input/Output section.

Boundary Condition(s):

1 <= N <= 50

Input Format:

The first line contains N.

Output Format:

The first N lines contain the desired pattern as shown in the Example Input/Output section.

Example Input/Output 1:

Input:

3

Output:

--[[*]]--

[[[]]]

Explanation:

Here N = 3, so the pattern contains 3 lines.

1st line: ----[*]----

2nd line: --[[*]]--

3rd line: [[[*]]]
*/
