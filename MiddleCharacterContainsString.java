import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String S = sc.nextLine();

        // Read number of values to be stored in the map
        int size = sc.nextInt();

        // Initialize map to store character as key and string as value
        Map<Character, String> map = new HashMap<>();

        // Read and process 'size' number of strings
        for (int i = 0; i < size; i++) {
            String val = sc.next();
            int len = val.length() / 2;
            map.put(val.charAt(len), val);
        }


        // Iterate through each character in input string S
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                // Print the character surrounded by repeated 'val' string
                String repeat = map.values().iterator().next(); // Use any value from map
                System.out.println(repeat + c + repeat);
            }
        }
    }
}

/*
The program must accept a string S containing only unique alphabets and N string values as the input. All N string values have an equal odd length. For each alphabet in S, the program must print the string having the same alphabet(ignoring case) in its middle. If there is no such string, then the program must print asterisks except the middle alphabet.

Note: There will be no string value with the same alphabet in the middle.

Boundary Condition(s):

1 <= N <= Length of S <= 26 1 <= Length of each string <= 99

Input Format:

The first line contains S.

The second line contains N.

The next N lines, each contains a string value.

Output Format:

The lines, each contains a string value.

Example Input/Output 1:

Input:

pencil

4

yield

paper 

hills

white

Output:

paper

yield

**n**

**c**

white

hills
*/
