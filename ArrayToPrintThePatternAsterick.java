import java.util.*;
public class Main
{
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int size=sc.nextInt();
		  int arr[]=new int[size];
		  int max=0;
		  for(int i=0;i<size;i++){
	         arr[i]=sc.nextInt();
	         max=Math.max(arr[i],max);
		  }
		  int bar=sc.nextInt();
		  for(int i=0;i<max;i++){
		    for(int j=0;j<size;j++){
		      System.out.print((max-i<=arr[j]?"*":"-").repeat(bar));
		    }
		    System.out.println();
		  }
	}
}
/*
input :

3
1 2 3
4

output:

--------****
----********
************
*/
