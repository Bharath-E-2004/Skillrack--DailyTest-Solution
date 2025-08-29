import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().toLowerCase(); // Read input and convert to lowercase

        int[] arr = new int[26]; // Fibonacci values for 'a' to 'z'
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < 26; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        long sum = 0;
        for (char alpha : S.toCharArray()) {
                sum += arr[(alpha|=32 )- 'a'];
        }

        System.out.println(sum);
    }
}
/*
The program must accept a string S containing only alphabets as the input. Each alphabet(ignoring case) has a weight as given below.

A = 0

B = 1

C= Weight of A + Weight of B

D= Weight of B + Weight of C

and so on.

The program must print the total weight of the alphabets in the given string S as the output.

Boundary Condition(s): 1 <= Length of S <= 100

Input Format:

The first line contains S.

Output Format:

The first line contains an integer value representing the total weight of the alphabets.

Example Input/Output 1:

Input:

Bat

Output:

4182

Explanation:

Here S "Bat". a = 0 So their sum is 4182 (1 + 0 + 4181) t = 4181 B = 1

Example Input/Output 2:

Input:

Skill Rack

Output: 4491
*/
