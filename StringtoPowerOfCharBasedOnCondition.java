import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        int T = sc.nextInt();

        Map<Character, Integer> countMap = new HashMap<>();
        Map<Character, Integer> powerMap = new HashMap<>();

        int totalPower = 0;

        for (char ch : s.toCharArray()) {
            int count = countMap.getOrDefault(ch, 0);

            if (count >= T) {
                // Do nothing — power becomes zero
                countMap.put(ch, count + 1);
                continue;
            }

            int power;
            if (count == 0) {
                power = 1;
            } else {
                power = powerMap.get(ch) * 2;
            }

            totalPower += power;
            countMap.put(ch, count + 1);
            powerMap.put(ch, power);
        }

        System.out.println(totalPower);
    }
}
/*
  The program must accept a string S and print the string power P based on the statements below.

- When a character occurs for the first time in the string, its power is 1.

- When a character occurs for the second time or more, its power is twice the previous value.

- P is the sum of the individual powers of the characters in S.

- A character has zero power after it has occurred more than T times in a string.

Boundary Condition(s):

1<= Length of S <= 100

1 <= T <= 15

Input Format:

The first line contains S.

The second line contains T.

Output Format: The first line contains P.

Example Input/Output 1:

Input: engine 10

Output: 8

Explanation:

The powers of the characters are e-1, n-1, g-1, 1-1, n-2, e-2 and their sum is 8.

Example Input/Output 2:

Input:

5

Output: 18

Explanation:

The powers of the characters are a-1, a-2, b-1, a-4, a-8, b-2 and their sum is 18.
*/
