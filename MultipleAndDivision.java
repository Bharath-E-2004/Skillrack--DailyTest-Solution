import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j]) {
                    if (arr[i] % arr[j] == 0 || arr[j] % arr[i] == 0) {
                        count++;
                      break;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
/*
Example Input/Output 1:

Input

5

10 5 70 10 4

Output:

4

Explanation:

10 has 5 as its factor as well as 70 as its multiple.

5 has 10 and 70 as its multiple.

70 has 5 and 10 as its factors.

10 has 5 as its factor as well as 70 as its multiple.

4 has no factors and no multiples.

So 4 integers meet the conditions given.
*/
