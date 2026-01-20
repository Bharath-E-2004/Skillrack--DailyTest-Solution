import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] slots = new int[N];

        for (int i = 0; i < N; i++)
            slots[i] = sc.nextInt();

        String[] t = sc.next().split(":");
        int hh = Integer.parseInt(t[0]);
        int mm = Integer.parseInt(t[1]);

        int start = 0;

        for (int i = 0; i < N; i++) {
            int end = start + slots[i];

            if (mm > start && mm < end) {
                System.out.println(-1);
                return;
            }

            if (mm == start) {
                int endMM = (start + slots[i]) % 60;
                int endHH = hh + ((start + slots[i]) / 60);
                endHH = endHH > 12 ? endHH % 12 : endHH;

                System.out.printf("%d %02d:%02d %02d:%02d",
                        i + 1, hh, start, endHH, endMM);
                return;
            }
            start = end % 60;
        }
        System.out.println(-1);
    }
}

/*
In a toy watch(12-hr format), there are N bands of different colors representing the time slots in 60 minutes. The program must accept N integers representing the duration of the N slots and a time T(12-hr format) as the input. The program must print the position of the band in which the minute hand is present at the time T. Then the program must print the starting time and the ending time of that band with respect to the given time T as the output. If the given time T is present in the middle of two bands, then the program must print -1 as the output.

Note: The first band always starts from 0.

Boundary Condition(s): 2<= N <=30

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains T.

Output Format:

The first line contains -1 or the position of the band followed by its starting time and ending

time.

Example Input/Output 1:

Input:

6 10 10 10 10 10 10 04:15

Output 2 04:10 04:20

Explanation:

There are 6 bands in the toy watch.

Band 1->0 to 10 (0 is common for the bands 1 and 6)

Band 2 -> 10 to 20 (10 is common for the bands 1 and 2)

Band 3-> 20 to 30 (20 is common for the bands 2 and 3)

Band 4-> 30 to 40 (30 is common for the bands 3 and 4)

Band 5-> 40 to 50 (40 is common for the bands 4 and 5)

Band 6-> 50 to 0 (50 is common for the bands 5 and 6)

At T04:15, the minute hand is present in the 2nd band.

The starting time of the 2nd band is 04:10.

The ending time of the 2nd band is 04:20.
*/
