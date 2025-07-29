import java.util.*;

public class PrintThePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // First line
        System.out.println("-".repeat(num - 1) + "*".repeat(num));

        // Middle lines
        for (int i = num - 2; i >= 1; i--) {
            System.out.println("-".repeat(i) + "*".repeat(num - 2));
        }

        // Last line
     if(num>1)
        System.out.println("*".repeat(num));

        sc.close();
    }
}

/*
The program must accept an integer N as the input. The program must print the tilted rectangle pattern of N lines based on the following conditions.

- In the 1st line, the program must print N-1 hyphens and N asterisks.

- In the 2nd line, the program must print N-2 hyphens, an asterisk, N-2 hyphens and an asterisk

- In the 3rd line, the program must print N-3 hyphens, an asterisk, N-2 hyphens and an asterisk.

- Similarly, the first N-1 lines are printed.

- In the Nth line, the program must print N asterisks.
*/
