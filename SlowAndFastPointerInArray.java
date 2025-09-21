import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int i1 = 0, i2 = 0;

        while (true) {
            System.out.println(arr[i1] + " " + arr[i2]);

            i1 = (i1 + 1) % size;
            i2 = (i2 + 2) % size;

            if (i1 == i2)
                break;
        }
      System.out.println(arr[i1]+" "+arr[i2]);
    }
}
/*
Example Input/Output 1:

Input:

5 10 20 30 40 50

Output:

10 10

20 30

30 50

40 20

50 40

10 10

Explanation:

Here N=5.

Initially, the two boys stand on the 1st stone. So 10 10 are printed.

After 1 second, B1 jumps to the 2nd stone and B2 jumps to the 3rd stone. So 20 30 are printed.

After 2 seconds, 81 jumps to the 3rd stone and B2 jumps to the 5th stone. So 30 50 are printed.

After 3 seconds, B1 jumps to the 4th stone and B2 jumps to the 2nd stone. So 40 20 are printed.

After 4 seconds, 81 jumps to the 5th stone and 82 jumps to the 4th stone. So 50 40 are printed.

After 5 seconds, B1 jumps to the 1 stone and 82 jumps to the 1st stone. So 10 10 are printed.

Now the two boys reached the same stone, so they stop jumping.

Example Input/Output 2

Input:

6

11 22 33 44 55 66

Output:

1111

22 33

33 55

44 11

55 33

66 55

11 11
*/
