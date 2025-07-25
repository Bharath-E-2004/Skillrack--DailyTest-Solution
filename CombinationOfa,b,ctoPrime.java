import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new TreeSet<>();

        // Generate combinations with two digits
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    String str = "" + arr[i] + arr[j];
                    int num = Integer.parseInt(str);
                    if (isPrime(num)) {
                        set.add(num);
                    }
                }
            }
        }

        // Print the primes found
        for (int val : set) {
            System.out.println(val);
        }
    }

    public static boolean isPrime(int val) {
        if (val <= 1) return false;
        if (val == 2 || val == 3) return true;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
}
/*
Example Input/Output 1:

Input: 3 0 1

Output: 3 13 31 103

Explanation:

Here a=3, b=0 and c=1.

All the possible numbers that can be formed with the digits 3, 0 and 1 are given below.

0-> not a prime number

1-> not a prime number

3-> prime number

10-> not a prime number

13-> prime number

30-> not a prime number

31-> prime number

103 -> prime number

130-> not a prime number

301-> not a prime number

310-> not a prime number

Hence the output is 3 13 31 103

Example Input/Output 2:

Input: 7 3 5

Output 3 5 7 37 53 73
*/
