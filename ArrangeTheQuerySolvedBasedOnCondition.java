import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] students = new int[N][4];

        // Read student details
        for (int i = 0; i < N; i++) {
            students[i][0] = sc.nextInt(); // Roll No
            students[i][1] = sc.nextInt(); // A
            students[i][2] = sc.nextInt(); // B
            students[i][3] = sc.nextInt(); // C
        }

        int Q = sc.nextInt();
        sc.nextLine(); // consume newline

        while (Q-- > 0) {
            char CH = sc.nextLine().charAt(0);
            String S = sc.nextLine();

            char subject = S.charAt(0);
            char operator = S.charAt(1);
            int value = Integer.parseInt(S.substring(2));

            boolean found = false;

            for (int[] arr : students) {
                int checkValue = 0;

                if (subject == 'A') checkValue = arr[1];
                else if (subject == 'B') checkValue = arr[2];
                else if (subject == 'C') checkValue = arr[3];

                boolean condition = false;

                if (operator == '>' && checkValue > value) condition = true;
                else if (operator == '<' && checkValue < value) condition = true;
                else if (operator == '=' && checkValue == value) condition = true;

                if (condition) {
                    found = true;

                    if (CH == '*') {
                        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
                    } else if (CH == 'A') {
                        System.out.println(arr[1]);
                    } else if (CH == 'B') {
                        System.out.println(arr[2]);
                    } else if (CH == 'C') {
                        System.out.println(arr[3]);
                    }
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}

/*
There are N students in a class. The program must accept the roll number and the marks in three subjects(A, B, C) of each student as the input. The program also accepts Q queries as the input. Each query contains two lines, where the first line contains a character CH and the second line contains a string S representing a condition. The value of CH can be any one of the following.

-It indicates all four fields (Roll Number, A, B and C).

A-It indicates the field A (the marks in the subject A).

B-It indicates the field B (the marks in the subject B).

C-It indicates the field C (the marks in the subject C).

The string S contains the subject name (A, B or C), an operator (>, < or =) and an integer value. For each query, the program must print the details of the students based on the character CH and the condition S. If there are no students for the given query, then the program must print -1 as the output.

Note: For each query, the details of the students must be printed in the order of their occurrence.

Boundary Condition(s):

1 <= N. Q <= 100 1 <= Roll Number, Marks in each subject (A, B, C) <= 100

Input Format:

The first line contains N.

The next N lines, each contains the roll number and the marks in three subjects(A, B, C) of each

student.

The N+2nd line contains Q.

The next Q pairs of lines, each contains the character CH in the first line and the string S in the second line.

Output Format:

The lines contain the details of the students based on the character CH and the condition S or -1.
Example Input/Output 1:

Input

4

1 50 60 80

2 99 64 90

3 70 90 80

4 60 70 95

3

*

A>50

A

B<70

*

B=95

Output:

2 99 64 90

3 70 90 80

4 60 70 95

50

99

-1
*/
