import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            queue.add(sc.nextInt());
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }

        int curr = queue.poll();
        int second;

        while (!queue.isEmpty()) {
            second = queue.poll();

            if (queue.isEmpty() && (curr + second > 0)) {
                System.out.println(curr + second);
                return;
            }

            curr = Math.abs(curr - second);
        }

        System.out.println(curr);
    }
}



/*
Example Input/Output 1:

Input

8

0 1583 21 12

Output

13

Explanation:

The missing Fibonacci number in the given series is highlighted below.

0, 1, 1, 2, 3, 5, 8, 13, 21.

Example Input/Output 2:

Input

4

144 21 89 34

Output:

55

Example Input/Output 3:

Input

9 01583 21 12 13

Output

21
*/
