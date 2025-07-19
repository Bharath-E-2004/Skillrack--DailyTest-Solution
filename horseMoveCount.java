import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0, col = 0;

        // Read an 8x8 grid and locate 'H'
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                char alpha = sc.next().charAt(0);
                if (alpha == 'H') {
                    row = i;
                    col = j;
                }
            }
        }

        sc.close();

        int sum = 0;

        // Simulate pattern based on relative positions
        for (int i = row - 2; i <= row + 2; i++) {
            if (i != row) {
                int r = Math.abs(row - i);
                if (r % 2 == 1) {
                    sum += check(i, col - 1);
                    sum += check(i, col - 2);
                } else {
                    sum += check(i, col + 1);
                    sum += check(i, col + 2);
                }
            }
        }

        System.out.println(sum);
    }

    public static int check(int row, int col) {
        return (row >= 1 && row <= 8 && col >= 1 && col <= 8) ? 1 : 0;
    }
}
/*
This seems inspired by a modified knight movement where the target positions depend on whether vertical distance is odd or even from the 'H' position. 
It might be part of a puzzle or game logic involving positional evaluation.
*/
