import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // number of varieties

        String[] variety = new String[size];
        int[] count = new int[size];

        // Read variety names
        for (int i = 0; i < size; i++) {
            variety[i] = sc.next();
        }

        // Read count values
        for (int i = 0; i < size; i++) {
            count[i] = sc.nextInt();
        }

        TreeSet<String> tree = new TreeSet<>();

        // Read extra integer and add to set
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            tree.add(variety[i] + " " + count[i] + " " + val);
            System.out.println(tree.size());
        }

        sc.close();
    }
}

/*
The program must accept a string S containing only is and is as the input. The program must print Yes if the given string is a super binary string. Else the program must print Mo as the output. A super binary string must satisfy the following two conditions.

- The number of 1s must be equal to the number of Os.

- In each prefix of the string, the number of 1s must be greater than or equal to the number of Os in the prefix

Hint: Optimize your logic to avoid Time Limit Exceeded Error.

Boundary Condition(s): 1 <= Length of S <= 10^6

Input Format: The first line contains S.

Output Format:

The first line contains Yes or No.

Example Input/Output 1:

Input 110010

Output: Yes
*/
