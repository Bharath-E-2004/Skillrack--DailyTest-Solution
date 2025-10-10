import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        // Store the first element of each k-sized block with its starting index
        for (int i = 0; i < size; i += k) {
            map.put(arr[i], i);
        }

        // Print each k-sized block in order of their first element
        for (Integer key : map.keySet()) {
            int ind = map.get(key);
            for (int i = 0; i < k && (ind + i) < size; i++) {
                System.out.print(arr[ind + i] + " ");
            }
        }
    }
}
