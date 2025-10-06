import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        long[][] arr = new long[size][2];

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            long result = convert(val);
            arr[i][0] = val;
            arr[i][1] = result;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return Long.compare(a[0], b[0]);
            } else {
                return Long.compare(a[1], b[1]);
            }
        });

        for (long[] a : arr) {
            System.out.println(a[0]);
        }
    }

    public static long convert(int val) {
        long result = 0;
        while (val > 0) {
            int digit = val % 10;
            result += digit*Integer.parseInt(Integer.toBinaryString(digit));
            val /= 10;
        }
        return result;
    }
}

/*
Example Input/Output 1:

Input 4 313 22 15 133

Output: 22 133 313 15

Explanation:

313-> (3*111*1 + 3*11) -> 33+1+3367.

22-> (2*10+2*10) -> 20+ 20 = 40.

15-> (1°1+5*101) -> 1 + 505 506.

133-> (1*1+3*113*11) ->1+33+3367.

After sorting the integer values based on the given conditions, the integers become 22 133 313 15

Example Input/Output 2:

Input: 5 28 3322 2332 7 3232

Output: 2332 3232 33227 28
*/
