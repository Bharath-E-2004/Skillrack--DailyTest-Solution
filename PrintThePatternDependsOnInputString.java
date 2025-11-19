import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        List<String> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }

        // Print characters column-wise
        for (int i = 0; i < list.get(0).length(); i++) {
            for (String s : list) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
/*
The program must accept N string values as the input. The given N string values are aligned vertically or horizontally as shown in the Example Input/Output section. The empty spaces at the end of each string are denoted as asterisks. The program must change the alignment (vertical to horizontal or horizontal to vertical) of the given N string values and print them as the output.

Note: At least one string value is always longer than N.

Boundary Condition(s):

3<= N <= 50

1 <= Length of each string <= 100

Input Format:

The first line contains N.

The next lines contain the N string values vertically or horizontally.

Output Format:

The lines contain the N string values vertically or horizontally.

Example Input/Output 1:

Input

4

book**

pencil

Car

cycle

Output:

bpcc oeay onrc kc "i'e

Explanation:

Here N = 4 and the string values are aligned horizontally.

So they are printed vertically.
*/
