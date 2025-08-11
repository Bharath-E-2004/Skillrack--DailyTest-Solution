import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int N=sc.nextInt(),Q=sc.nextInt();
	  char digit[]=String.valueOf(N).toCharArray();
	  for(int i=0;i<Q;i++){
	    int ind1=sc.nextInt()-1,ind2=sc.nextInt()-1;
	    char temp=digit[ind1];
	    digit[ind1]=digit[ind2];
	    digit[ind2]=temp;
	  }
	  System.out.println(N==Integer.parseInt(new String(digit))?"YES":2*Integer.parseInt(new String(digit)));
	  System.exit(0);
	}
}
/*
Example Input/Output 1:

Input:

1234

6

1 3

1 4

2 4

2 3

1 4

1 2

Output:

YES

Explanation:

Here N1234.

1st swap: 1,3 -> 3214

2nd swap: 1 4 -> 4213

3rd swap: 24 -> 4312

4th swap: 2 3 -> 4132

5th swap: 1 4 -> 2134

6th swap: 1 2 -> 1234

After 6 swaps, the resulting integer R = 1234 which is equal to N.

Hence YES is printed as the output.

Example Input/Output 2:

Input:

2139

3

1 3

2 4

1 4

Output:

3846
*/
