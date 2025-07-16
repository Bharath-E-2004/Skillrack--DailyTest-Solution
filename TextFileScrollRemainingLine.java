import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int scroll = sc.nextInt(), max = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] str = sc.nextLine().split(" ");

        int count = 1; // Count of lines needed
        int len = 0;   // Current line length

        for (int i = 0; i < str.length; i++) {
            if (len + str[i].length() +  1 <= max) {
                // Add word to current line (add space if not first word)
                len += str[i].length()+1;
            } else {
                // Move word to new line
                count++;
                len = str[i].length();
            }
        }

        System.out.println(count - scroll);
    }
}
/*
Program Note: Line Wrapping Based on Maximum Width
This Java program reads a list of words and simulates how they would be arranged in lines, 
given a maximum allowed character width (max) for each line. 
It then calculates how many lines are required to display all the words and subtracts a given number of scrollable lines (scroll) to find the number of extra lines that would require scrolling.


*/
