import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt(), val2 = sc.nextInt();

        System.out.println(MaximumOp(val1, val2));
    }

    public static char MaximumOp(int v1, int v2) {
        int add = v1 + v2;
        int sub = v1 - v2;
        int mul = v1 * v2;
        int div = v2 != 0 ? v1 / v2 : Integer.MIN_VALUE;  // avoid divide by zero

        int max = Math.max(add, Math.max(sub, Math.max(mul, div)));

        if (max == add) return '+';
        else if (max == sub) return '-';
        else if (max == mul) return '*';
        else return '/';
    }
}

/*
Example Input/Output 1:

Input:

4 9

Output:

*

Explanation:

Multiplication: 49-36

Subtraction: 4-9--5

Addition: 4+9=13

Division: 4/9=0

Here the multiplication gives the maximum value.

Hence is printed as the output.

Example Input/Output 2:

Input:

4 -10

Output:

-

Example Input/Output 3:

Input:

-10 5

Output:

/

Example Input/Output 4:

Input:

2 2

Output:

*
*/
