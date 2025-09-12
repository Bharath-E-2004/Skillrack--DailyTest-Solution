import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= row; i++) {
            int val = sc.nextInt();
            sum = sum * 10 + (val % 10); // Assuming this is the intended logic

            if (i % k == 0) {
                printFactors(sum);
                sum = 0;
            }
        }

        sc.close();
        System.exit(0);
    }

    public static void printFactors(int val) {
        if (val == 0) {
            System.out.print(0);
            return;
        }

        int sq = (int) Math.sqrt(val);
        StringBuilder sb = new StringBuilder();

        if (val % sq == 0) {
            sb.append(sq);
            sq--;
        }

        for (int i = sq; i >= 1; i--) {
            if (val % i == 0) {
                sb.insert(0, i + " ");
                sb.append(" " + (val / i));
            }
        }

        System.out.println(sb);
    }
}

/*
An integer array of N integers is passed as the input. Another integer value K is also passed as the input. The program must consider every K integers and form a new integer X with the unit digits of the K integers considered and print the factors for X.

Note: If the unit digits of all K integers under consideration is zero, then print 0.

Hint: Optimize your logic to avoid Time Limit Exceeded Error.

Boundary Condition(s):

1<= N <= 100

1<= Each integer value <= 10^5 
1<=K<=8

Input Format:

The first line contains N and K separated by a space.

The second line contains N integers separated by a space.

Output Format:

The first N/K lines contain the factors separated by a space.

Example Input/Output 1:

Input

7 3 

10 20 30 41 50 60 90

Output

0

1 2 4 5 10 20 25 50 100
*/
