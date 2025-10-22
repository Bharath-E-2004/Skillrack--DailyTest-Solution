import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of students
        int[] reg = new int[N]; // Registration numbers
        for (int i = 0; i < N; i++) {
            reg[i] = sc.nextInt();
        }

        int Q = sc.nextInt(); // Number of questions
        int[] marks = new int[Q];
        for (int i = 0; i < Q; i++) {
            marks[i] = sc.nextInt();
        }

        int[] totalMarks = new int[N];
        int questionIndex = 0;

        while (questionIndex < Q) {
            // 1. All students
            for (int i = 0; i < N && questionIndex < Q; i++) {
                totalMarks[i] += marks[questionIndex++];
            }

            // 2. Even registration number students
            for (int i = 0; i < N && questionIndex < Q; i++) {
                if (reg[i] % 2 == 0) {
                    totalMarks[i] += marks[questionIndex++];
                }
            }

            // 3. Odd registration number students
            for (int i = 0; i < N && questionIndex < Q; i++) {
                if (reg[i] % 2 != 0) {
                    totalMarks[i] += marks[questionIndex++];
                }
            }
        }

        // Print total marks
        for (int i = 0; i < N; i++) {
            System.out.print(totalMarks[i]);
            if (i < N - 1) System.out.print(" ");
        }
    }
}
/*
In a game, there are N students standing as a circle. Each student has a registration number.

The class teacher asks Q questions to the N students in the following order.

-All N students from 1 to N.

- All N students from 1 to N except the students having an odd registration number. - All N students from 1 to N except the students having an even registration number.

-Then he repeats the above order till he asks all Q questions.

The class teacher also awards marks to each question based on their answers. The registration number of each student and the marks awarded for each question are passed as the input. The program must print the total marks scored by each student as the output.

Note: There will be at least one student with an odd registration number and at least one student with an even registration number.

Boundary Condition(s):

2<=N<= 100

1<= Registration number of each student <= 1000

1Q<= 10^4

0< Marks for each question <= 100

Input Format:

The first line contains N.

The second line contains N Integers separated by a space representing the registration A

numbers of the N students.

The third line contains Q.

The fourth line contains Q integers separated by a space representing the marks awarded for the Q questions.

Output Format:

The first line contains N Integers separated by a space representing the total marks scored by the N students.

Example Input/Output 11

Input:

5

100 120 103 148 155 16

9 1 9 3 8 3 1 8 5 6 7 5 9 7 2 5 4 3

Output:

24 11 23 21 16

Explanation:

1st student 100: Q1+Q6+Q11+Q16 = 9+3+7+5=24.

2nd student 120: Q2+Q7+Q12+Q17 = 1+1+5+4 = 11.

3rd student 103: Q3+Q9+Q13 = 9+5+9 = 23.

4th student 148: Q4+Q8+Q14+Q18 = 3+8+7+3 = 21.

5th student 155: Q5+Q10+Q15 = 8+6+2 = 16.

Example Input/Output 2:

Input:

4

11 12 13 14 

15 

9 9 7 9 1 4 5 3 5 2 3 5 9 4 9

Output: 28 21 13 22
*/
