import java.util.Scanner;

public class StringPairMatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of first array
        int n = sc.nextInt();
        String[] arr1 = new String[n];

        // Read first array
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }

        // Read size of second array
        int m = sc.nextInt();
        String[] arr2 = new String[m];

        // Read second array
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.next();
        }

        // Pairing logic
        for (int i = 0; i < n; i++) {
            char lastChar = arr1[i].charAt(arr1[i].length() - 1);

            for (int j = 0; j < m; j++) {
                char firstChar = arr2[j].charAt(0);

                if (lastChar == firstChar) {
                    System.out.println(arr1[i] + arr2[j]);
                }
            }
        }

        sc.close();
    }
}
