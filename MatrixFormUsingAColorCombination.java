import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[][] c = new char[N][N];

        // Read matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                c[i][j] = sc.next().charAt(0);
            }
        }

        int Q = sc.nextInt();
        int ignored = 0;

        while (Q-- > 0) {
            char D = sc.next().charAt(0);
            int P = sc.nextInt() - 1; // convert to 0-based
            char C = sc.next().charAt(0);

            boolean hit = false;

            if (D == 'T') {
                for (int i = 0; i < N; i++) {
                    if (c[i][P] == C) {
                        c[i][P] = '*';
                        hit = true;
                        break;
                    }
                }
            } 
            else if (D == 'B') {
                for (int i = N - 1; i >= 0; i--) {
                    if (c[i][P] == C) {
                        c[i][P] = '*';
                        hit = true;
                        break;
                    }
                }
            } 
            else if (D == 'L') {
                for (int j = 0; j < N; j++) {
                    if (c[P][j] == C) {
                        c[P][j] = '*';
                        hit = true;
                        break;
                    }
                }
            } 
            else if (D == 'R') {
                for (int j = N - 1; j >= 0; j--) {
                    if (c[P][j] == C) {
                        c[P][j] = '*';
                        hit = true;
                        break;
                    }
                }
            }

            if (!hit) {
                ignored++;
            }
        }

        // Print final matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Print ignored bullets
        System.out.println(ignored);
    }
}

/*
In a bubble shooting game, there are N°N bubbles in Red, Green and Blue. The program must accept a character matrix of size N'N representing the colors of the bubbles and Q queries as the input. Each query contains three values D, P and C.

- D represents the direction in which the player can shoot (L- Left, R - Right, T-Top, B-Bottom).

- P represents the position of a row or column in which the player can shoot.

- C represents the color of the bullet given to the player.

For each query, the player plays the game with the following rules.

- The player can shoot a bubble using a bullet with the same color in the specified direction D and the specified position P.

- If two or more bubbles have the same color, then the first occurring bubble in the specified direction will explode.

- If there is no bubble to shoot with the given bullet, then the player will ignore the bullet. Finally, the program must print the modified matrix and the number of bullets he ignored as the output.

Notes The empty spaces in the matrix must be replaced with asterisks.

Boundary Condition(s):

2<=N<=50

1 <= P <= N

1<=Q<= 1000

Input Format:

The first line contains N.

The next N lines, each contains N characters separated by a space representing the colors of

the bubbles.

The N+2nd line contains Q.

The next Q lines, each contains D, P and C separated by a space.

Output Format:

The first N lines, each contains N characters separated by a space.

The N+1 line contains an integer representing the number of bullets the player ignored.
*/
