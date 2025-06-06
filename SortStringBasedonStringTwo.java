import java.util.";

public class SortStringBasedonStringTwo {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in); String str1=sc.nextLine();

String str2=sc.nextLine();

int arr[]=new int[10];

for(char c:str1.toCharArray())

arr[Character.getNumericValue(c)]++;

for(char c:str2.toCharArray())

if(arr[Character.getNumericValue(c)]>0)|

System.out.printl(String.valueOf(c).repeat(arr[Character

.getNumericValue(c)]));

System.exit(0);

}
}

/*
  The program must accept two string values St and S2 containing only digits as the input. The string 52 contains exactly 10 unique digits. The program must sort the digits in S1 based on the order of 10 digits in S2. Then the program must print the revised string S1 as the output.

Boundary Condition(s):

1<= Length of St <= 100

Input Format:

The first line contains S1.

The second line contains S2.

Output Format:

The first line contains the revised string $1.

Example input/Output 1:

Input

1358719

0219487563

Output 1198753

Expilamationc

S11358719 and S2 = 0219487563.

After sorting the digits in St based on the order of 10 digits in S2, the string S1 becomes 1198753.

So 1798753 is printed as the output.

Example input/Output 2:

Input 220196034808762 6732501984

Output 667322200019884
*/
