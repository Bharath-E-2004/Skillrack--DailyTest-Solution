import java.util.*;

public class Main {

    static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] appts = new int[N][2];

        for (int i = 0; i < N; i++) {
            String start = sc.next();
            String end = sc.next();
            appts[i][0] = toMinutes(start);
            appts[i][1] = toMinutes(end);
        }

        // Sort by start time
        Arrays.sort(appts, (a, b) -> a[0] - b[0]);

        int busy = 0;
        int curStart = appts[0][0];
        int curEnd = appts[0][1];

        for (int i = 1; i < N; i++) {
            if (appts[i][0] <= curEnd) {
                // Overlapping or continuous
                curEnd = Math.max(curEnd, appts[i][1]);
            } else {
                busy += (curEnd - curStart);
                curStart = appts[i][0];
                curEnd = appts[i][1];
            }
        }

        // Add last interval
        busy += (curEnd - curStart);

        int totalMinutes = 24 * 60;
        int freeMinutes = totalMinutes - busy;

        System.out.print(freeMinutes);
    }
}
/*
A doctor has N appointments in a day. The start time and end time of each appointment are passed as the input. The program must print the number of minutes the doctor is free (i.e., the number of minutes the doctor has no appointment).

Note: The start time and end time of each appointment will be 24-hr format HH:MM.

Boundary Condition(s):

1 <= N <= 50

Input Format:

The first line contains N.

The next N lines, each contains the start time and end time of each appointment.

Output Format:

The first line contains the number of minutes the doctor is free.

Example Input/Output 1:

Input:

6

14:30 15:00

15:00 16:30

07:30 08:30

11:00 12:30

19:00 20:00

06:00 07:00

Output:

1050

Explanation:

The free slots of the doctor are given below.

00:00 06:00 -> 360 minutes

07:00 07:30 -> 30 minutes

08:30 11:00 -> 150 minutes

12:30 14:30 -> 120 minutes

16:30 19:00 -> 150 minutes

20:00 00:00 -> 240 minutes

So the total time = 1050 minutes (360+30+150+120+150+240).

Example Input/Output 2:

Input:

9

11:00 11:15

10:15 10:30

16:00 16:45

17:30 18:00

10:00 10:15

09:30 09:45

17:00 17:30

09:00 09:30

11:15 11:30

Output:

1230
*/
