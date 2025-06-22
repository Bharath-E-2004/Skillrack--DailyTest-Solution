import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isAlphabetic(ch)) {
                stk.push(ch);
            } else {
                char alpha = stk.pop();

                if (alpha == 'T') {
                    if (ch == '|') {
                        stk.push(S.charAt(i + 1) == 'T' ? 'T' : 'T');
                    } else if (ch == '&') {
                        stk.push(S.charAt(i + 1) == 'T' ? 'T' : 'F');
                    } else { // ch == '!'
                        stk.push(S.charAt(i + 1) == 'T' ? 'F' : 'T');
                    }
                    i++; // skip next operand
                } else { // alpha == 'F'
                    if (ch == '|') {
                        stk.push(S.charAt(i + 1) == 'F' ? 'F' : 'T');
                    } else if (ch == '&') {
                        stk.push('F');
                    } else { // ch == '!'
                        stk.push(S.charAt(i + 1) == 'F' ? 'T' : 'F');
                    }
                    i++; // skip next operand
                }
            }
        }

        System.out.println(stk.pop());
    }
}
/*
  The program must accept a string S representing a boolean expression. The string S contains T,

F, &, | and ^.

T-True

F-False

&- Bitwise AND Operator

|- Bitwise OR Operator

A - Bitwise XOR Operator

The program must evaluate the given expression from left to right and print the result as the output.

Boundary Condition(s): 3 <= Length of S <= 99

Input Format:

The first line contains S.

Output Format:

The first line contains the result for the given boolean expression.

Example Input/Output 1:

Input:

TIFATIT&F

Output: F

Explanation:

T[F^T]T&F -> T^T]T&F -> FIT&F -> T&F -> F

Example Input/Output 2:

Input:

TIT&FAT

Output T

Explanation:

TIT&FAT -> T&FAT -> FAT -> T
*/
