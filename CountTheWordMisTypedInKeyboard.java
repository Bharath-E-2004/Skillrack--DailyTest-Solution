import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int i = 0, j = 0;
        int count = 0;

        while (i < s1.length() && j < s2.length()) {

            char c = s1.charAt(i);
            int freq1 = 0, freq2 = 0;

            // count frequency in S1
            while (i < s1.length() && s1.charAt(i) == c) {
                freq1++;
                i++;
            }

            // count frequency in S2
            while (j < s2.length() && s2.charAt(j) == c) {
                freq2++;
                j++;
            }

            // long press detected
            if (freq2 > freq1) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/*
The program must accept two string values $1 and S2 as the input. The string S1 indicates a message. A person types the message S1 using the keyboard. Some keys on his keyboard are sticky keys (i.e., If he types a character once, that character will appear on the screen more than once). The string S2 indicates the message he received on the screen. The program must print the number of times the keys are not working properly (i.e., the number of times the keys that have been pressed for a long time) as the output. If a character is repeated consecutively more than once in S1 and the corresponding key is pressed for a long time, then considered the count as 1.

Boundary Condition(s):

1 <= Length of S1 <= Length of S2 <= 100

Input Format:

The first line contains S1.

The second line contains S2.

Output Format:

The first line contains an integer representing the number of times the keys are not working

properly.

Example Input/Output 1:

Input:

monkey

moonkeeey

Output: 2

Explanation:

The 2 long pressed keys are o and e.

Example Input/Output 2:

Input:

skillrack

sssskkkilllllrackkkk
*/
