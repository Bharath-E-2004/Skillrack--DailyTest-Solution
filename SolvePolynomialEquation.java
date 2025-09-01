import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String polynomial = scanner.nextLine();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int len = polynomial.length();
        int i = 0;

        while (i < len) {
            int sign = polynomial.charAt(i) == '+' ? 1 : -1;
            i++;

            int value = 0;
            while (i < len && Character.isDigit(polynomial.charAt(i))) {
                value = value * 10 + (polynomial.charAt(i) - '0');
                i++;
            }

            i += 2; // Skip 'x^'
            int pow = 0;
            while (i < len && Character.isDigit(polynomial.charAt(i))) {
                pow = pow * 10 + (polynomial.charAt(i) - '0');
                i++;
            }

            value *= sign;
            map.put(pow, map.getOrDefault(pow, 0) + value);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer key : map.descendingKeySet()) {
            int coeff = map.get(key);
            if (coeff != 0) {
                sb.append(coeff > 0 && sb.length() > 0 ? "+" : "")
                  .append(coeff)
                  .append("x^")
                  .append(key);
            }
        }

        System.out.println(sb.length()==0?0:sb.toString());
    }
}

/*
simplify the given polynomial expression by combining the like terms (i.e, combining the terms having the same exponent values). Then the program must print the simplified polynomial expression. The terms in the simplified polynomial must be sorted by their exponent values in descending order. If there are no terms in the simplified polynomial expression, then the program must print 0 as the output.

Boundary Condition(s):

5<= Length of S <= 100

Input Format: The firstly contulins 5.

Output Format:

The first line contains the simplified polynomial expression or 0.

Example Input/Output 1:

Input:

- 4x ^ 1 + 3x ^ 2 - 7x ^ 0 + 9x ^ 1 - 12x ^ 2 - 5x ^ 4

Output:

- 5x ^ 4 - 9x ^ 2 + 5x ^ 1 - 7x ^ 0

Explanation:

+3x^2 and-12x^2 are combined as and 9x + 1 are combined as 5x + 1 So the simplified polynomial expression is - 5x ^ 4 - 9x ^ 2 + 5x ^ 1 - 7x ^ 0 - 9x + 2 - 4x + 1

Example Input/Output 2:

Input:

105x ^ 3 + 5x ^ 5 + 99x ^ 4 - 105x ^ 3 + 5x ^ 5 - 10x ^ 5

Output: +99x^4

Example Input/Output 3: Input: +1x^1-2x^50-1x^1+2x^50

Output 0
*/
