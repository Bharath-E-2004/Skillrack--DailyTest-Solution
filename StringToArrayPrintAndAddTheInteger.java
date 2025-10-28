import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();

        // Split input by spaces to get tokens
        String[] tokens = str.split(" ");
        List<Integer> result = new ArrayList<>();

        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> current = new ArrayList<>();

        for (String token : tokens) {
            if (token.startsWith("[")) {
                // Start of a subarray
                current.addAll(parseNumbers(token.substring(1)));
                stack.push(new ArrayList<>(current));
                current.clear();
            } else if (token.endsWith("]")) {
                // End of a subarray
                String numPart = token.substring(0, token.length() - 1);
                if (!numPart.isEmpty()) current.add(Integer.parseInt(numPart));
                Collections.reverse(current);
                result.addAll(current);
                current.clear();

                if (!stack.isEmpty()) {
                    current = stack.pop();
                }
            } else {
                // Normal number
                current.add(Integer.parseInt(token));
            }
        }

        result.addAll(current);

        long sum = 0;
        for (int num : result) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\n" + sum);
    }

    private static List<Integer> parseNumbers(String part) {
        List<Integer> list = new ArrayList<>();
        if (!part.isEmpty()) {
            list.add(Integer.parseInt(part));
        }
        return list;
    }
}

/*
The program must accept an array of integers with some pairs of square brackets as the input. The integers between the open and close square brackets represent a subarray. The program must reverse all such subarrays in the given array. Then the program must print the revised array without any square brackets and then the program must print the sum of integers in the revised array as the output.

Note: The maximum size of the array will be 100.

Boundary Condition(s):

1<= Each integer value <= 10^5

Input Format:

The first line contains an array of integers with some pairs of square brackets.

Output Format:

The first line contains the integers in the revised array without any square brackets. The second line contains the sum of integers in the revised array.

Example Input/Output 1:

Input:

10 (20 45 15] 19 [1030]

Output:

10 15 45 20 19 30 10 149

Explanation:

There are 2 subarrays represented by the pairs of square brackets.

1 subarray: (20 45 15)-> (15 45 201

2nd subarray: (10 30)-> (3010)

After reversing the 2 subarrays, the array becomes 10 15 45 20 19 30 10

The sum of integers in the array is 149.
*/
