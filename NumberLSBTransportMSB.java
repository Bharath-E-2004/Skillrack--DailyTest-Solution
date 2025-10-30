import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();  // Number of inputs
        
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();  // Read integer value
            
            String bin = Integer.toBinaryString(val);  // Convert to binary string
            
            // Move first bit to the end
            String modifiedBin = bin.substring(1) + bin.charAt(0);
            
            // Convert back to integer
            int result = Integer.parseInt(modifiedBin, 2);
            
            System.out.print(result + " ");
        }
        
        sc.close();
    }
}
/*
The program must accept an array of N integers as the input. The program must transfer the MSB of each integer to the LSB of its previous integer in the given array. For the first integer the array, consider the last integer as the previous integer. Then the program must print the revised values of the N integers as the output.

Boundary Condition(s):

2 <= N <= 100

1 <= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the revised N integers separated by a space.

Example Input/Output 1:

Input

4

15 10 12 35

Output:
15 5 9 7

Explanation:

The binary representations of the 4 integers are given below.

After transferring the MSB of each integer to the LSB of its previous integer, the binary representations become

Example Input/Output 2:

Input: 5 

32 21 65 56 9

Output

1 11 349 3
*/
