import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result = 0;

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            String str = sc.next();

            // Remove repeated empty strings (though this has no effect)
            for (int j = 1; j < 10; j++) {
                str = str.replace((""+j).repeat(j), ""+j);
            }

            // Parse the cleaned string to integer and add to result
            result += Integer.parseInt(str);
        }

        System.out.println(result);
    }
}

/*
Example Input/Output 1:

Input:

4 2222

13334444

44449999999994444

555556666661333

Output:

6263

Explanation:

13334444 -> 134.

2222 -> 22.

44449999999994444 -> 494.

555556666661333 -> 5613.

134+22+494+56136263.

Example Input/Output 2:

Input

3

88888888

122122

44447777777

Output:

1267

Explanation:

88888888 -> 8

122122 -> 1212.

44447777777 -> 47.

8+1212+47-1267.
*/
