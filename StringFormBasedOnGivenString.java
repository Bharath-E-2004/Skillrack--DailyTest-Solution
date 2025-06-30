import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int start = str.indexOf('[');
        int end = str.indexOf(']');

        if (start == -1 || end == -1 || start >= end) {
            System.out.println("Invalid input format.");
            return;
        }

        char[] arr = str.substring(start + 1, end).toCharArray();
        Arrays.sort(arr);

        for (char ch : arr) {
            if (ch == '|') continue;
            System.out.print(str.substring(0, start) + ch + str.substring(end + 1) + " ");
        }
    }
}
/*
  The program must accept a string S as the input. The string S contains only alphabets and a pair of square brackets in which the two or more alphabets are separated by the pipe symbol (1). The program must print all possible combinations that can be formed by choosing only one alphabet within the square brackets and the remaining alphabets in S as the output. All possible combinations must be printed in sorted order.

Boundary Condition(s): 5 <= Length of S <= 100

Input Format:

The first line contains S.

Output Format:

The first line contains the string values separated by a space representing the combinations of S based on the given conditions.

Example Input/Output 1: Input albicid

Output: abd and

Explanation:

Here the given string is alb/cjd The two possible combinations are abd and acd.

Example Input/Output 2: Inputt abc@gleAdjz

Output:

abcdiz abcez abcfz albegz
*/
