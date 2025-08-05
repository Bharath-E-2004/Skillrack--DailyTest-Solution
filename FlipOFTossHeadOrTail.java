import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        char face = sc.next().charAt(0);
        int head = 0, tail = 0;

        if (face == 'H') {
            head++;
        } else {
            tail++;
        }

        for (int val : array) {
            if (val % 2 == 0) {
                if (face == 'H') {
                    tail++;
                    face = 'T';
                } else {
                    head++;
                    face = 'H';
                }
            } else {
                if (face == 'T') {
                    tail++;
                } else {
                    head++;
                }
            }
        }

        System.out.println(head + " " + tail);
    }
}
/*
Hector is playing a game with a coin. The coin has two faces HEAD and TAIL. He tosses the coin N times. The number of times the coin is flipped in each toss is passed as the input. After each toss, he uses the face obtained in the previous toss to start the next toss. The program also accepts a character F representing the initial face of the coin. Finally, the program must print the number of times he gets HEAD and the number of times he gets TAIL as the output.

Boundary Condition(s):

1 <= N <= 100

1 <= Each Integer value <= 1000

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

The third line contains a character F.

Output Format:

The first line contains two integer values representing the number of times he gets HEAD and the number of times he gets TAIL

Example Input/Output 1:

Input:

5 33452 H

Output: 23

Explanation:

Initially, the coin face = HEAD.

After the 1st toss, the coin face- TAIL

After the 2nd toss, the coin face HEAD.

After the 3rd toss, the coin face = HEAD.

After the 4th toss, the coin face TAIL

After the 5th toss, the coin face = TAIL

He got the HEAD twice and the TAIL thrice.

Hence the output is

23
*/
