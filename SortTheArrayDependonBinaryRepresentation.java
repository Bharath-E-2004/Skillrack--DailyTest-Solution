import java.util.*;

// Store class that implements Comparable
class Store implements Comparable<Store> {
    long val1;
    int bit;

    // Constructor
    public Store(long val1, int bit) {
        this.val1 = val1;
        this.bit = bit;
    }

    // Comparison logic
    @Override
    public int compareTo(Store other) {
        if (this.bit == other.bit) {
            return Long.compare(this.val1, other.val1);
        }
        return Integer.compare(this.bit, other.bit);
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Store> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            long val = sc.nextLong();
            String bin = Long.toBinaryString(val);
            int lastTwoBits = Integer.parseInt(bin.substring(Math.max(0, bin.length() - 2)), 2);
            list.add(new Store(val, lastTwoBits));
        }

        Collections.sort(list);

        for (Store s : list) {
            System.out.print(s.val1 + " ");
        }
    }
}
/*
Example Input/Output 1:

Input:

7 104158239

2

Output

4892 103 15

Explanation:

10->1010

4->0100

15->1111

8->1000

2->0010

3->0011

9->1001

After sorting the 7 integers based on the decimal equivallent of the last 2 lies, the integess

become

489210315
*/
