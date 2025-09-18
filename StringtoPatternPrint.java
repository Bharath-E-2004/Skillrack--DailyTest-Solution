import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();      // Input string
        int val = sc.nextInt();      // Maximum indentation level

        int count = 0;               // Current indentation level
        boolean increasing = true;   // Direction flag

        for (int i = 0; i < str.length(); i++) {
            // Print asterisks followed by the character
            System.out.println("*".repeat(count) + str.charAt(i));

            // Change direction if bounds are hit
            if (count == 0) {
                increasing = true;
            } else if (count == val - 1) {
                increasing = false;
            }

            // Update count based on direction
            count = increasing ? count + 1 : count - 1;
        }
    }
}
/*
The program must accept a string S and an integer K as the input. The program must print the string $ in triangular wave pattern of width K as shown in the Example Input/Output section.

Boundary Condition(s): 1 <= Length of $ <= 100

2 <= K <=20

Input Format:

The first line contains 5.

The second line contains K.

Output Format:

The lines contain the string S in triangular wave pattern as shown in the Example Input/Output section.
*/
