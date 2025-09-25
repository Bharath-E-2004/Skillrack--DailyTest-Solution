import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt(); // number of swaps

        // Initialize 5x5 matrix
        String[][] str = new String[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(str[i], "*");
            if (i==4 || i==0) {
                str[i][1] = "" + (12 - i - 1);
                str[i][3] = "" + (i + 1);
                str[i][2] = "" + (12 / (i==0?1:2));
            } else {
                str[i1[0]=""+(12-i-1);
                str[i][4] = "" + (i + 1);
            }
        }

        // Perform swaps
        for (int k = 0; k < val; k++) {
            String v1 = sc.next();
            String v2 = sc.next();

            int r1 = -1, c1 = -1, r2 = -1, c2 = -1;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (str[i][j].equals(v1)) {
                        r1 = i;
                        c1 = j;
                    }
                    if (str[i][j].equals(v2)) {
                        r2 = i;
                        c2 = j;
                    }
                }
            }

            // Swap if both found
            if (r1 != -1 && r2 != -1) {
                String temp = str[r1][c1];
                str[r1][c1] = str[r2][c2];
                str[r2][c2] = temp;
            }
        }

        // Print final matrix
        for (String[] arr : str) {
            for (String v : arr) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
