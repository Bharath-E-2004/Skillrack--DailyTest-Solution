import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                int j = i + 1;
                int printed = 0;

                while (j < str.length() && printed < count) {
                    if (Character.isAlphabetic(str.charAt(j))) {
                        System.out.print(str.charAt(j));
                        printed++;
                    }
                    j++;
                }
                System.out.println();
            }
        }
    }
}
/*
The program must accept a string S containing only alphabets and nonzero digits. For each digit D in the string S, the program must print the next D alphabets in the string 5. Consider the alphabets in circular fashion when printing the next D alphabets in the string S.

Boundary Condition(s): 2 <= Length of S <= 1000

Input Format: The first line contains S.

Output Format:

The lines, each contains a string value.

Example Input/Output 1: Input:

9skill4rack6

Output: skillrack rack skillr

Explanation:

Here the given string is 9skill4rack6.

The 1st digit is 9, so the next 9 alphabets s, kir, a, cand e are printed. The 2nd digit is 4, so the next 4 alphabets r, a, e and e are printed. The 3rd digit is 6, so the next 6 alphabets s, k, I, I, I and rare printed.

Example Input/Output 2: Input: Wat99er1

Output: erWaterWa erWaterWa W
*/
