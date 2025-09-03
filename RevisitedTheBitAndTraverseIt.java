import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int size = sc.nextInt();
        long[] arr = new long[size];

        // Read the first value and extract its last bit
        int first = sc.nextInt();
        int lastBit = first & 1;

        // Read the value to be used for transformation
        for (int i = 1; i < size; i++) {
        int val=sc.nextInt();
        String binVal=Integer.toBinaryString(val);
        // Construct the binary string with lastBit and modified val
        String str = lastBit + binVal.substring(0, binVal.length() - 1);
        long transformedVal = Long.parseLong(str, 2);
        // Fill the array from index 1 to size-1 with transformed value
            arr[i] = transformedVal;
          latBit=val&1;
        }
    
        // Handle the first element separately using 'first'
        String binFirst = Integer.toBinaryString(first);
        String firstStr = lastBit + binFirst.substring(0, binFirst.length() - 1);
        arr[0] = Long.parseLong(firstStr, 2);

        // Print the array
        for (long valOut : arr) {
            System.out.print(valOut + " ");
        }
    }
}
/*
The program must accept an array of N integers as the input. The program must transfer the LSB of each integer to the MSB of its next integer in the given array. For the last integer in the array, consider the first integer as the next integer. Then the program must print the revised values of the N integers as the output.

Boundary Condition(s):

2<=N<=100

1<= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the revised N integers separated by a space.

Example Input/Output 1:

Input

4

174 27 120 79

Output

215 13 124 39

Explanation:

The binary representations of the 4 integers are given below.

After transferring the LSB of each integer to the MSB of its next integer, the binary

representations become

Example Input/Output 2:

Input

6

10 9 15 12 14 5 10

Output:

13 4 15 14 7 2
*/
