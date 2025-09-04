import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        List<List<Character>> list = new ArrayList<>();

        // Initialize the list with empty sublists
        for (int i = 0; i < val; i++) {
            list.add(new ArrayList<>());
        }

        // Add '#' to each row initially
        for (int i = 0; i < val; i++) {
            list.get(i).add('#');
        }

        int v = val - 2;

        // Add '*' pattern to rows 1 to val-2
        for (int i = 1; i < val - 1; i++) {
            for (int j = 0; j < v * 2 - 1; j++) {
                list.get(i).add('*');
            }
            list.get(i).add('#');
        }

        System.out.println((val / 2 + val % 2) + " " + v);

        // Additional pattern logic (example structure)
        int c = 1;
        for (int i = 2; i < (val / 2) + val % 2; i++) {
            for (int j = 0; j < c * 2 - 1; j++) {
                list.get(i).add('*');
            }
            list.get(i).add('#');
            c++;
        }

        // Final row pattern if val is even
        if (val % 2 == 0) {
            v = val / 2;
            list.get(v).add('*');
            list.get(v).add('#');
        }

        // Print the pattern
        for (List<Character> subList : list) {
            for (char ch : subList) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

/*
The program must accept an integer N as the input. 
The program must print the reducing triangular wave pattern as shown in the Example Input/Output section.
*/
