import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Sort words
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        // Build output
        for (String w : list) {
            if (map.get(w) == 2) {
                System.out.print(w + w + " ");
            } else {
                System.out.print(w + " ");
            }
        }
    }
}

/*
Input:

cat code cat code moon earth cat

Expected Output:

cat catcat codecode earth moon

*/
