import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String number = new Scanner(System.in).nextLine();
        int count = 0;

        for (int i = 1; i < 9; i++) {
            int curr = 0, next = 0;

            for (int j = 0; j < number.length(); j++) {
                int digit = Character.getNumericValue(number.charAt(j));

                if (digit == -1) continue;

                if (digit == i) curr++;
                if (curr>=2 && digit == i + 1) next++;
            }

            if (curr >= 2 && next >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
/*
The program must accept a string S containing only nonzero digits as the input. The program must find the count of unique four-digit integers that can be formed using the digits in S based on the fpillowing conditions.

-Exactly four digits must be picked from the string in the same order of their occurrence.

-First 2 digits of the integer must be the same, say x

-Last 2 digits of the integer must be the same, say y

-The value of the digit y must be x+1.

Boundary Condition(): 1-Length of S <= 100

Inputt Format: The first lime contains S.

Output Format:

The frest line contains the count of unique four-digit integers that can be formed using the digits in S

Example Input/Output:

212112572388

Output 2

Explanattion

The 2 possible four-digit integers are 2233 and 7788,

Example Input/Output 2:

impatt

133033825456465643298789

Duutput:

44

Exgilanation

The possible four-digit integers are 1122, 2233, 3344 and 5566.
*/
