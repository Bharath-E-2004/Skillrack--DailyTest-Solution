import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int x = sc.nextInt();

        int i = 0;
        long total = 0;

        while (i < str.length()) {

            int sign = (str.charAt(i++) == '+') ? 1 : -1;

            int digit = 0;
            int j = i;

            while (i < str.length() && str.charAt(i) != 'x' && str.charAt(i) != '+' && str.charAt(i) != '-') {
                digit = digit * 10 + (str.charAt(i) - '0');
                i++;
            }

            if (i < str.length() && str.charAt(i) == 'x') {
                i++;
            }

            int pow = 0;
            if (i < str.length() && str.charAt(i) == '^') {
                i++;
                while (i < str.length() && str.charAt(i) != '+' && str.charAt(i) != '-') {
                    pow = pow * 10 + (str.charAt(i) - '0');
                    i++;
                }
            } else {
                pow = 1;
            }

            total += (sign * digit) * (long)(Math.pow(x, pow));

            System.out.print((sign == -1 ? "-" : "+") + str.substring(j, i));
        }

        System.out.print("\n" + total);
    }
}
