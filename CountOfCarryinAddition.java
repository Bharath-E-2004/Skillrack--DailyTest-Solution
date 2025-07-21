import java.util.*;
public class CountOfCarryinAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = 0, carry = 0;

        while (num1 > 0 || num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            int sum = d1 + d2 + carry;

            if (sum > 9) count++;

            carry = sum / 10;

            num1 /= 10;
            num2 /= 10;
        }

        System.out.println(count);
    }
}
/*
The program must accept two integers X and Y as the input. The program must print the number of carries generated when adding X and Y as the output.

Boundary Condition(s):

1<=X, Y <= 10^8

Input Format:

The first line contains X.

The second line contains Y.

Output Format:

The first line contains an integer representing the number of carries generated when adding X and Y.

Example Input/Output 1:

Input: 451 349

Output: 2

Explanation:

Here X=451 and Y=349.

The unit digits 1 and 9 are added. The carry is 1.

Then 1 + the digits in tenth position = 1+5+4= 10 and hence the carry is 1.

Then 1 + the digits in hundredth position = 1+4+3 = 8 and hence NO carry.

Total number of carries is 2, which is printed as the output.

Example Input/Output 2:

Input:

99 190

Output: 1
*/
