import java.util.";

public class Hello {

public static void main(String[] args) {

String array[]=new Scanner(System.in).nextLine().split(" ");

String prev-array[0]; for(int i=1;i<array.length;i++){ if

(prev.length()+11=array[i].length() ||| (array[1] .startsWith(prev) 88 Tarray[1].endsWith(prev))){

}

}

System.out.println("NO");

System.exit(0);

} System.out.println("YES");

}

22104010@perl
/*
The program must accept a string S containing multiple words as the input. The program must print YES if each word(except the first word) is formed from the previous word by adding exactly one character to the beginning or the end of the previous word. Else the program must print NO as the output.

Boundary Condition(s):

4 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The first line contains YES or NO.

Example Input/Output 1: Input: an and cand candi candle

Output: YES

Explanation:

Here S= "an and cand candl candle".

2nd word: and (an + d)

3rd word: cand (c + and)

4th word: candl (cand + 1)

5th word: candle (candi + e)

So YES is printed as the output

Example Input/Output 2:

Input:

i it bit bite biter bitter

Output: NO
*/
