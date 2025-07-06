import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        long digit = 0, sum = 0;

        for (int i = 1; i <= number.length(); i++) {
            if (i < number.length() && number.charAt(i - 1) == number.charAt(i)) {
                digit = digit * 10 + Character.getNumericValue(number.charAt(i - 1));
            } else {
                digit = digit * 10 + Character.getNumericValue(number.charAt(i - 1));
                sum += digit;
                digit = 0;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
