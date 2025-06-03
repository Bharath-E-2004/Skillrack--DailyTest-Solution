import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of time inputs: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] Time = new String[size];

        int hh = 0, mm = 0, ss = 0;

        // Read all time inputs
        for (int i = 0; i < size; i++) {
            Time[i] = sc.nextLine();
            String[] parts = Time[i].split(":");
            mm += Integer.parseInt(parts[0]);
            ss += Integer.parseInt(parts[1]);
        }

        // Normalize seconds to minutes
        mm += ss / 60;
        ss = ss % 60;

        // Convert total minutes to hours and minutes
        hh = mm / 60;
        mm = mm % 60;

        System.out.printf("Total Duration: %02d:%02d:%02d\n", hh, mm, ss);

        // Optional: Running total for first size-1 times
        hh = mm = ss = 0;
        for (int i = 0; i < size - 1; i++) {
            String[] parts = Time[i].split(":");
            mm += Integer.parseInt(parts[0]);
            ss += Integer.parseInt(parts[1]);

            mm += ss / 60;
            ss = ss % 60;
            hh = mm / 60;
            mm = mm % 60;

            System.out.printf("Cumulative till entry %d: %02d:%02d:%02d\n", i + 1, hh, mm, ss);
        }

        sc.close();
    }
}
/*
   Example Input/Output 1:

Input:

4

05:30

25:30

40:15

02:20

Output

Total Duration: 01:13:35

00:05:30

00:31:00

01:11:15

Explanation:

Here N = 4, the duration of the given 4 video clips are

05:30

25:30

40:15

02:20

The total duration of the video created is 01:13:35. So Total Duration: 01:13:35 is printed.

The time values at which the 3 cuts occur are given below.

00:05:30

00:31:00

01:11:15
*/
