import java.util.*;

public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        List<String> list = new ArrayList<>();
        list.add(S);

        while(true){
            // Print current split level
            for(String s : list){
                System.out.print(s + " ");
            }
            System.out.println();

            // Check if all strings length == 1 → stop
            boolean allOne = true;
            for(String s : list){
                if(s.length() > 1){
                    allOne = false;
                    break;
                }
            }
            if(allOne) break;

            // Next level splitting
            List<String> temp = new ArrayList<>();
            for(String s : list){
                int len = s.length();
                if(len == 1){
                    temp.add(s);
                } else {
                    // even length → equal split
                    // odd length → middle character goes to second half
                    int mid = len / 2;
                    temp.add(s.substring(0, mid));
                    temp.add(s.substring(mid));
                }
            }
            list = temp;
        }
    }
}

/*
The program must accept a string S as the input. The program must split the string recursively based on the following conditions.

- If the length of the string is even, then the program must split the string into two equal halves. Else consider the middle character for the second half. After dividing the string, the program must print the resulting string values.

- Then the program must repeat the above process of dividing each word in the string S till the length of each word becomes 1.

Boundary Condition(s):

2 <= Length of S <= 100

Input Format: The first line contains S.

Output Format:

The lines contain the string values separated by a space.

Example Input/Output 1:

Input:

abcdefgh

Output:

abcd efgh

ab cd ef gh

abcdefgh

Explanation:

Here the given string is abcdefgh.

1st split: abcd efgh

2nd split: ab cd ef gh

3rd split: abcdefgh
*/
