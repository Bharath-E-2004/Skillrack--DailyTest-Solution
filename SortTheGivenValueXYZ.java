import java.util.*;

class Store implements Comparable<Store> {
    int X, Y, Z;

    public Store(int x, int y, int z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    @Override
    public int compareTo(Store other) {
        if (this.X != other.X) return this.X - other.X;
        if (this.Y != other.Y) return this.Y - other.Y;
        return this.Z - other.Z;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        List<Store> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String str[] = sc.nextLine().split("\\.");
            list.add(new Store(
                Integer.parseInt(str[0]),
                Integer.parseInt(str[1]),
                Integer.parseInt(str[2])
            ));
        }

        Collections.sort(list);

        for (Store s : list) {
            System.out.printf("%d.%d.%d\n", s.X, s.Y, s.Z);
        }
    }
}
/*
There are Q questions in a book. Each question has a number in the format X.Y.Z, where X represents the chapter number, Y represents the section number and Z represents the subsection number. Q question numbers are passed as the input. The program must sort the question numbers based on the chapter number, section number and subsection number in ascending order. Finally, the program must print the sorted question numbers as the output.

Boundary Condition(a):

2<=N<=100

1<=X, Y, Z <=20

Input Format:

The first line contains N.

The next N lines, each contains a question number(in the format X.Y.Z).

Output Format:

The first N lines contain the sorted question numbers(in the format X.Y.Z).

Example Input/Output 1:

Input:

7

4.2.3

2.5.1

1.4.6

2.5.7

4.2.1

1.4.2

2.1.3

Output:

142

146

2.1.3

2.5.1

2.5.7

4.2.1

4.2.3
*/
