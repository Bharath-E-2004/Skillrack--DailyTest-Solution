import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input line and split into words
        String[] str = sc.nextLine().split(" ");

        // Read the position K (1-based index) and convert to 0-based
        int K = sc.nextInt() - 1;

        // Get the K-th word
        String s = str[K];
        int len = s.length();

        // Divide and reverse the halves
        String firstHalf = s.substring(0, len / 2 + len % 2);
        String secondHalf = s.substring(len / 2);

        // Reconstruct the word with second half followed by reversed first half
        str[K] = new StringBuilder(secondHalf).toString() + new StringBuilder(firstHalf).reverse().toString();

        // Print the modified array
        for (String word : str) {
            System.out.print(word + " ");
        }

        sc.close();
    }
}

/*
The program must split the Kth word into two equal halves. If the word length is odd, then consider the middle character for both halves.

-Then the program must reverse the first half and then merge the second halt and first half into a single word.

- Then the program must replace the Kth word with the obtained word in the string S. Finally, the program must print the revised string S.

Boundary Condition(s):

1 <= Length of S <= 1000

1<= K <= Number of words in S.

Input Format:

The first line contains S.

The second line contains K.

Output Format:

The first line contains the revised string S.

Example Input/Output 1:

Input:

This is the right choice

4

Output:

This is the ghtgir choice

Explanation:

Here K = 4.

The 4th word is right, whose length is odd.

First Half: rig

Second Half: ght

After reversing the first half, rig becomes gir.

After merging the second half and first half, the word becomes ghtgir,
*/
