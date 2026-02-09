import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strArr[] = sc.nextLine().split(" ");

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String str : strArr) {

            String key = form(str);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        // Convert List -> Array -> String.join
        for (String key : map.keySet()) {

            List<String> list = map.get(key);

            // Step 1: List to Array
            String[] arr = list.toArray(new String[0]);

            // Step 2: Array to String using join
            String result = String.join(" ", arr);

            System.out.println(result);
        }
    }

    public static String form(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
/*
The program must accept a string S containing multiple words as the input. The program must group the words where each word is a combination of the other words. Then the program must print the groups of words in separate lines in the order of their occurrence.

Boundary Condition(s):

3 <= Length of S <= 1000

Input Format: The first line contains S.

Output Format:

The lines contain the groups of words separated by a space based on the given conditions.

Example Input/Output 1:

Input:

neon nose ones race none noes care

Output:

neon none

nose ones noes

race care

Explanation:

Here S= "neon nose ones race none noes care".

1st group: neon none

2nd group: nose ones noes

3rd group: race care

In each group, each word is a combination of the other words in the group.

Hence the output is

neon none

nose ones noes

race care
*/
