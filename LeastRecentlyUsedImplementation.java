import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read N
        int N = sc.nextInt();

        // Read page requests
        int[] req = new int[N];
        for (int i = 0; i < N; i++) {
            req[i] = sc.nextInt();
        }

        // Read S, R, X
        int S = sc.nextInt();
        int R = sc.nextInt();
        int X = sc.nextInt();

        ArrayList<Integer> lru = new ArrayList<>();
        int addedPages = 0;
        int cacheSize = S;

        for (int i = 0; i < N; i++) {

            // Increase cache size after R requests
            if (i == R) {
                cacheSize += X;
            }

            // If page already in cache
            if (lru.contains(req[i])) {
                lru.remove((Integer) req[i]); // remove old position
            } else {
                // Page added newly
                addedPages++;
            }

            // Add page as most recently used
            lru.add(req[i]);

            // Remove least recently used if cache exceeds size
            if (lru.size() > cacheSize) {
                lru.remove(0);
            }
        }

        System.out.println(addedPages);
    }
}

/*
The program must accept N integers representing the N page requests and the size 5 of an LRU (Least Recently Used) cache as the input. After R requests the size of the LRU cache is increased by X. The values of R and X are also passed as the input. The program must print the number of pages added in the cache when processing the N requests as the output.

Boundary Condition(s):

1 <= R < N <= 1000

1<= Each integer value <= 1000 145, X < 100

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

The third line contains S, R and X separated by a space.

Output Format:

The first line contains the number of pages added in the cache when processing the N requests,

Example Input/Output 1:

Input: 12 121314512632 342

Output: 7
*/
