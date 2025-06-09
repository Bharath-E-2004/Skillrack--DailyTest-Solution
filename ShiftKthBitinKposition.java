import java.util.*;

public class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

long val1=sc.nextLong();

int k=sc.nextInt();

String bin32-String.format("%32s", Long.toBinaryString(val1

)).replace('','0');

String nbin=bin32.substring(0,32-k)+bin32.charAt(31)+bin32.substring(32-k,31);

System.out.println(Long.parseInt(nbin, 2));

}
}
/*
   The program must accept two integers N and X as the input. The program must find the 32-bit binary representation of N. Then the program must shift the last X bits to the right by 1 position in the binary representation of N. Finally, the program must print the revised value of N as the output.

Boundary Condition(a): 1 <= N < 2^32 1 = X = 32

Input Format:

The first line contains N and X separated by a space.

Output Format:

The first line contains the revised value of N.

Example Input/Output 1:

Input

756

Output 101

Explanation:

Here N 75 and X = 6.

The 32-bit binary representation of 75 is 00000000000000000000000001001011.

After shifting the last 6 bits to the right by 1 position, the binary representation becomes 00000000000000000000000001100101

So the revised value of N is 101.

Example Input/Output 2:

Input: 132

Output: 2147483648
*/
