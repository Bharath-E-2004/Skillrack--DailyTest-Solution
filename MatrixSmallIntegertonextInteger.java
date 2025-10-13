import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        Map<Integer, Integer> map = new TreeMap<>();

        // Read input and populate array and map
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], i); // Store value and its index
        }

        System.out.println("TreeMap contents: " + map);

        int prev = -1;

        for (Integer key : map.keySet()) {
            int curr = map.get(key);

            if (prev == -1) {
                prev = key;
                continue;
            }

            int ind1 = map.get(prev);
            int ind2 = curr;
            int step = ind1 > ind2 ? -1 : 1;

            while (ind1 != ind2) {
                System.out.print(arr[ind1] + " ");
                ind1 += step;
            }

            System.out.println(arr[ind2]);
            prev = key;
        }
    }
}
/*
The program must accept N unique integers as the input. The program must print N-1 lines of output based on the following conditions.

- In the 1st line, the program must print the integers from the smallest integer to the second smallest integer.

- In the 2nd line, the program must print the integers from the second smallest integer to the third smallest integer.

- In the 3rd line, the program must print the integers from the third smallest integer to the fourth smallest integer.

- Similarly, the program must print the integers in the remaining lines as the output.

Boundary Condition(s):

2 <= N <= 100

1 <= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first N-1 lines, each contains the integer values separated by a space.

Example Input/Output 1:

Input:

5

30 50 10 20 40

Output:

10 20 20 10 50 30 30 50 10 20 40 40 20 10 50

Explanation:

1st line: The integers from the smallest integer to the second smallest integer are printed.

10 20

2nd line: The integers from the second smallest integer to the third smallest integer are

printed.

20 10 50 30

3rd line: The integers from the third smallest integer to the fourth smallest integer are printed. 30 50 10 20 40

4th line: The integers from the fourth smallest integer to the fifth smallest integer are printed.

40 20 10 50

Example Input/Output 2:

Input:

8

75 60 16 67 99 64 19 87

Output:

16 67 99 64 19

19 64 99 67 16 60

60 16 67 99 64

64 99 67

67 16 60 75

75 60 16 67 99 64 19 87

87 19 64 99
*/
