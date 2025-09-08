import java.util.Scanner;

public class BitwiseAndCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int result = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            int value = scanner.nextInt();
            result &= value;
        }
        System.out.println(Integer.bitCount(result));
        
        scanner.close();
    }
}
