import java.util.*;

class Factors implements Comparable<Factors> {
    int count;
    int value;

    public Factors(int count, int value) {
        this.count = count;
        this.value = value;
    }

    @Override
    public int compareTo(Factors other) {
        // Sort by count descending, then by value descending
        if (this.count != other.count) {
            return other.count - this.count;
        }
        return other.value - this.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class Hello {
    public static void main(String[] args) {
        List<Factors> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            int count = 0;

            // Count factors
            for (int j = 1; j <= Math.sqrt(val); j++) {
                if (val % j == 0) {
                    if (j == val / j) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }

            list.add(new Factors(count, val));
        }

        Collections.sort(list);

        // Print values grouped by factor count
        int prev = -1;
        for (Factors f : list) {
            if (prev != -1 && prev != f.count) {
                System.out.println();
            }
            System.out.print(f.value + " ");
            prev = f.count;
        }
    }
}
/*
 The program must accept N integers, arr[i] where i is from 0 to N-1 and print the integers based on the number of factors in descending order. If multiple integers have the same number of factors, then they must be printed in the same line sorted in descending order.

Boundary Condition(s):

1 <= N <= 100 1 <= arr[i] <= 10000

Input Format:

The first line contains N.

The second line contains the N integer values separated by a space.

Output Format:

Several lines contain the N integer values.

Example Input/Output 1:

Input:

5 10 5 7 8 99

Output

99 10 8 7 5

Explanation:

Here N=5 and the given 5 integers are 10 5 7 8 99.

The number of factors of 10 is 4 (1, 2, 5, 10).

The number of factors of 5 is 2 (1, 5).

The number of factors of 7 is 2 (1, 7).

The number of factors of 8 is 4 (1, 2, 4, 8).

The number of factors of 99 is 6 (1, 3, 9, 11, 33, 99).

The given 5 integers are printed based on the number of factors in descending order as below.

99 10 8 75
*/
