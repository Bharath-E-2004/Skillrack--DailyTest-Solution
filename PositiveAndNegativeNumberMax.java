import java.util.*;

public class PositiveNegativeMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // TreeMap keeps keys sorted
        Map<Integer, Boolean> map = new TreeMap<>();

        // Populate the array and track presence of positive-negative pairs
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            int value = numbers[i];
            int absValue = Math.abs(value);

            if (map.containsKey(absValue)) {
                map.put(absValue, true); // Both + and - found
            } else {
                map.put(absValue, false); // Only one version seen
            }
        }

        // Find the largest value with both + and - present
        int max = -1;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                max = Math.max(max, entry.getKey());
            }
        }

        System.out.println(max);
    }
}
/*
The program must accept an array of N integers as the input. The program must print the largest integer X (where X > 0) such that both values X and -X (the integer X with negative sign) exist in the given array. If there is no such integer, then the program must print -1 as the output.

Boundary Condition(s):

2<= N <= 1000

-10^5 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains the largest integer X or -1.

Example Input/Output 1:

Input:

5

4 3 -3 6 -4

Output:

4

Explanation:

Here N-5 and the given 5 integers are 4 3-3 6-4.

The largest integer with the positive sign and negative sign is 4.

So 4 is printed as the output.

Example Input/Output 2:

Input:

6

 2 2 3 -2 3 -2

Output:

2

*/
