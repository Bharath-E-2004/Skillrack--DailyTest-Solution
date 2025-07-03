import java.util.*;

public class Hello {

    public static void main(String[] args) {

        String number = new Scanner(System.in).next();

        for (char digit : number.toCharArray()) {
            DiePattern(Character.getNumericValue(digit));
            System.out.println(); // Space between die patterns
        }

        System.exit(0);
    }

    public static void DiePattern(int val) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (val % 2 == 1 && i == 1 && j == 1) {
                    // Center dot for odd values
                    System.out.print("*");
                } else if (val >= 2 && ((i == 0 && j == 0) || (i == 2 && j == 2))) {
                    // Top-left and bottom-right
                    System.out.print("*");
                } else if (val > 3 && ((i == 0 || i == 2) && j == 2 || j == 0)) {
                    // Top-right and bottom-left (after 4)
                    System.out.print("*");
                } else if (val > 5 && i == 1 && (j == 0 || j == 2)) {
                    // Middle-left and middle-right (for 6)
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
/*
The program must accept a string S containing only the digits from 1 to 6 as the input. The digits in the string S represent the results of rolling a die.
For each digit in S, the program must print the corresponding face of the die as shown in the Example Input/Output section.

Die face - 1

Die face - 2

Die face - 3

Die face - 4

Die face - 5

Die face - 6
*/
