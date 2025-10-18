import java.util.*;

class Store implements Comparable<Store> {
    int num;
    String str;

    public Store(int num, String str) {
        this.num = num;
        this.str = str;
    }

    @Override
    public int compareTo(Store other) {
        if (this.num == other.num) {
            return this.str.compareTo(other.str);
        }
        return this.num - other.num;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Store> list = new ArrayList<>();

        for (char i = 'a'; i <= 'c'; i++) { // Assuming 'a' to 'c' as example range
            int size = sc.nextInt();
            for (int j = 0; j < size; j++) {
                int val = sc.nextInt();
                list.add(new Store(val, i + "" + j));
            }
        }

        Collections.sort(list);
        for (Store s : list) {
            System.out.print(s.str + " ");
        }
    }
}
/*
[18-10-2025 22:02] Bharath. E: The program accepts three array elements with the size of the arrays as A, B and C as the input. 
All the integers in the given arrays are sorted in ascending order. 
The program must merge the three sorted arrays so that the integers in the resulting array are sorted in ascending order.
The program must print the original indices(i.e., the indices before merging) of all the integers in the resulting array. 
The indices of the given three arrays must be denoted as given below

1st array: a0, a1, a2,.. a(A-1).

2nd array: bo, b1, b2, ... b(B-1).

3rd array: co, c1, c2, с(C-1).
[18-10-2025 22:02] Bharath. E: Example Input/Output 1:

Input:

5 10 20 50 90 100 4 15 25 35 40 6 5 30 39 45 60 98

Output:

co ao bo a1 b1 c1 b2 c2 b3 c3 a2 c4 a3 c5 a4

Explanation:

Here A=5, B-4 and C=6,

After merging the given 3 arrays, the resulting array becomes 5 10 15 20 25 30 35 39 40 45 50 60 90 98 100

Example Input/Output 2:

Input:

3 10 10 20 3 10 20 20 3

10 10 20

Output:

a0 a1 bo co c1 a2 b1 b2 c2
*/
