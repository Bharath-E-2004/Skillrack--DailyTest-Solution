import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int T = sc.nextInt();

        int index = 0;

        for (int t = 0; t < T; t++) {

            if (list.isEmpty()) {
                System.out.println(-1);
                return;
            }

            int val = list.get(index);
            int unit = Math.abs(val % 10);

            // remove unit digit
            val = val / 10;

            if (val == 0) {
                list.remove(index);

                if (!list.isEmpty()) {
                    index = index % list.size();
                }
            } else {
                list.set(index, val);

                // move index based on unit digit parity
                if (unit % 2 == 0) { // even → next
                    index = (index + 1) % list.size();
                } else { // odd → previous
                    index = (index - 1 + list.size()) % list.size();
                }
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
            return;
        }

        long sum = 0;
        for (int x : list) sum += x;

        System.out.println(sum);
    }
}
/*
The function/method sortintegersinplace accepts an argument str. The string str contains words and integers.

The function/method sortintegersinplace must sort the integers in the string str among their positions. Then the function must return the revised string as a new string.

Your task is to implement the function sortintegersinplace so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

skillrack 50 20 code 105 how are 40 you 30

Output

skillrack 20 30 code 40 how are 50 you 105

Explanation:

The integers in the given string are 50, 20, 105, 40 and 30. After sorting the integers in their positions, the string becomes skillrack 20 30 code 40 how are 50 you 105

Example Input/Output 2:

Input:

135 cat 9841 dog rat 12 987 cow

Output:

12 cat 135 dog rat 987 9841 cow
*/
