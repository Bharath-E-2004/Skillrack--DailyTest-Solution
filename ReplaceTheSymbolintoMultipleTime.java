import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt(); // currently unused
        String[] str = new String[row];

        // Read row strings
        for (int i = 0; i < row; i++) {
            str[i] = sc.next();
        }

        int change = sc.nextInt();

        // Process each string
        for (String s : str) {
            String replaced = s.replace("", " ".repeat(change)).trim();
            System.out.println(replaced);
        }

        sc.close();
    }
}
