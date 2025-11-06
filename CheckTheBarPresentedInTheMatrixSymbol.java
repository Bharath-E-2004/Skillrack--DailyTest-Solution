import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] grid = new String[N];

        // Read grid from bottom to top (line 1 is bottom)
        for (int i = N - 1; i >= 0; i--) {
            grid[i] = sc.nextLine();
        }

        int cols = grid[0].length();

        // For each column
        for (int c = 0; c < cols; c++) {
            int start = -1, end = -1;

            for (int r = 0; r < N; r++) {
                if (grid[r].charAt(c) == '#') {
                    if (start == -1) start = r + 1; // first occurrence
                    end = r + 1;                     // update last occurrence
                }
            }

            // Print only if a bar exists
            if (start != -1) {
                System.out.println(start + " " + end);
            }
        }
    }
}

/*
The program must accept N lines as the input, which represents a bar graph pattern. The N lines in the bar graph pattern are numbered from 1 to N (bottom to top). Each column of the bar graph pattern contains exactly one vertical bar and the bar is denoted by consecutive hash symbols. The program must print the range(from and to positions) of each vertical bar in the given bar graph pattern as the output.

Boundary Condition(s):

1<= N <= 100

1 <= Number of columns in the bar graph pattern <= 50

Input Format:

The first line contains N.

The next N lines contain the bar graph pattern.

Output Format:

The lines, each contains two integers separated by a space representing the range of a vertical bar.

Example Input/Output 1:

Input:

6

Output:

14

12

24

15

46

13

24

35

66

45

13
*/
