import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] array = new int[num];
        
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        long count = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                int diff = array[i - 1] - array[i];
                
                if (diff == 0) {
                    count++;
                    array[i] += k;
                } else {
                    int div = diff / k + (diff % k == 0 ? 0 : 1);
                    count += div;
                    array[i] += k * div;
                }

                // Recheck in case new value still matches previous
                if (array[i] == array[i - 1]) {
                    count++;
                    array[i] += k;
                }
            }
        }

        System.out.println(count);
    }
}
/*
The program must accept N integers and an integer K as the input. The program must convert the given sequence of N integers into a rising sequence (ie, a sequence of integers in strictly increasing order) by adding K to one or more elements, any number of times. The program must print the minimum number of times the value K to be added to the sequence to make the rising sequence as the output

Boundary Condition(s):

2<= N <= 1000

1 <= Each integer value, K <= 10^6

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains K

Output Format:

The first line contains an integer representing the minimum number of times the value K to be added to the sequence to make the rising sequence.

Example Input/Output 1:

Input

4

2665

2

Output

3

Explanation:

Here K-2

The rising sequence can be formed as 2, 6, 8 and 9 by adding the value K thrice.

3rd integer -> 6+2 = 8 (2 is added once)

4th integer -> 5+2+2=9 (2 is added twice)

Hence 3 is printed as the output.
*/
