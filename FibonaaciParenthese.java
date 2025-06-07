import java.util.*;

public class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int N=sc.nextInt(),X=sc.nextInt();

String T1="()", T2="()", Temp="()";

for(int i=2;i<N;i++){

Temp="("+T2+T1+")";

T1-T2;

T2-Temp;

} System.out.println(Temp.charAt(X-1)); I

System.exit(0);

}

}

/*
  The program must accept two integers N and X as the input. The program must print the Xth character in the Nth term of the Fibonacci parentheses series. The Fibonacci parentheses series

given below.

T1 = 0

T2 = (0

T3 (T2+T1) = (00)

T4 (T3+T2) = ((00)0)

T5(T4+T3) = (((00)0)(00))

Similarly, the remaining terms are formed using the sum of the two preceding terms.

Note: The value of X is always less than or equal to the number of characters in the Nth term.

Boundary Condition(s):

1 <= N <= 30

Input Format:

The first line contains N and X separated by a space.

Output Format:

The first line contains the Xth character in the Nth term of the Fibonacci parentheses series.

Example Input/Output 1:

Input: 46

Output: )

Explanation:

Here N=4 and X=6. The 4th term in the fibonacci parentheses series is ((()()()). The 6th character in the 4th term is).
  */
