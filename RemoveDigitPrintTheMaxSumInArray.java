import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String str[] = new String[size];

        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }

        long result = 0;

        // Assuming we want to calculate maximum sum after processing strings
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            boolean b = false;

            for (String s : str) {
                if (!s.isEmpty()) {
                    b = true;
                    s = s.replace("", ""); // <-- this removes all empty "" (does nothing actually)
                    try {
                        sum += Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        // Skip non-numeric strings
                    }
                }
            }

            if (b) {
                result = Math.max(result, sum);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
