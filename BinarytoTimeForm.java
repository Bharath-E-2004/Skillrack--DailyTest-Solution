import java.util.*;

public class BinaryToTimeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        long totalSeconds = 0;

        for (int i = 0; i < n; i++) {
            String binary = sc.nextLine();
            int value = Integer.parseInt(binary, 2);
            totalSeconds += value;
        }

        int hours = (int) (totalSeconds / 3600);
        totalSeconds %= 3600;

        int minutes = (int) (totalSeconds / 60);
        int seconds = (int) (totalSeconds % 60);

        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
/*
Example Input/Output 1:

Input:

3

00111000

01001111

01000100

Output

00:03:23

Explanation:

1st lap: 00111000 -> 56 seconds.

2nd lap: 01001111 -> 79 seconds.

3rd lap: 01000100 -> 68 seconds.

So the total time is 203 seconds.

Hence the output is 00:03:23.

Example Input/Output 2:

Input:

6

01110001

10001100

10111100

11010100

10101001

10001100

Output:

00:16:02
*/
