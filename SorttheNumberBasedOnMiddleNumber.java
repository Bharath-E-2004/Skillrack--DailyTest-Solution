import java.util.*;

class SortAlgo implements Comparable<SortAlgo> {
    int val;
    int mid;

    public SortAlgo(int val) {
        this.val = val;
        String str = String.valueOf(val);
        this.mid = Character.getNumericValue(str.charAt(str.length() / 2));
    }

    public int compareTo(SortAlgo other) {
        if (this.mid != other.mid) {
            return this.mid - other.mid;
        }
        return this.val - other.val;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SortAlgo> list = new ArrayList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++)
            list.add(new SortAlgo(sc.nextInt()));

        Collections.sort(list);

        for (SortAlgo s : list)
            System.out.print(s.val + " ");

        sc.close();
    }
}
/*
The program must accept N integers as the input. Each integer contains an odd number of digits. The program must sort the integers based on the middle digit. If two or more integers have the same middle digit, then the program must sort those integers in ascending order.

Boundary Condition(s):

2 <= N <= 1000

100 <= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains the N sorted integers separated by a space.

Example Input/Output 1:

Input:

5 82315 40215 70051 5610320201

Output:

70051 56103 20201 40215 82315

Explanation:

Here N=5 and the given 5 integers are 82315, 40215, 70051, 56103 and 20201. After sorting the integers based on the middle digit, the integers become 70051 56103 2020140215 82315

Example Input/Output 2:

Input:

6

77344 572 994 583 130 7193942

Output:

130 77344 7193942 572 583 994
*/
