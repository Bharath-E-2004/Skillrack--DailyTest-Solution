import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of columns for the initial pattern
        int row = sc.nextInt();
        System.out.println("*" + "- ".repeat(row - 1));

        // Read the number of iterations
        int N = sc.nextInt();

        int left = 0;
        int right = row - 1;
        int curr = 1;

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            int diff;

            if (curr < val) {
                diff = val - curr;
                while (diff > 0) {
                    left++;
                    right--;
                    System.out.println("-".repeat(left) + "*" + "-".repeat(right) + " " + left);
                    diff--;
                }
            } else {
                diff = curr - val;
                while (diff > 0) {
                    left--;
                    right++;
                    System.out.println("-".repeat(left) + "*" + "-".repeat(right));
                    diff--;
                }
            }

            curr = val;
        }

        sc.close();
        System.exit(0);
    }
}
/*
Example Input/Output 1:

Input:

5

5

31453

Output:

Explanation:

Initial position of the boy is 1.

1-3-1-> 4-> 5 -> 3.
*/
