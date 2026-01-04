mport java.util.*;

ublic class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int size sc.nextInt();

List<String> list=new ArrayList<>(); for

(int i=0;i<size;i++){ String str=sc.next();

list.add(str);

} int interval=sc.nextInt();

List<String> d=new ArrayList<>();

for(int i=0;i<size;i++){

}

String s[]=list.get(i).split("-");

int start Integer.parseInt(s[0]); int end Integer.parseInt(s[1]); System.out.println(start+" "+end); (start<interval && end interval){ d.add(list.get(i)); list.add(start+"-"+interval); list.add(interval+"-"+end);

}

for (String d1:d) list.remove(d1); Collections.sort(list, (A,B){

int s1-Integer.parseInt(A.split("-")[0]),e1-Integer.parseInt (A.split("-")[1]); int s2-Integer.parseInt(B.split("-")[0]),e2 Integer.parseInt (B.split("-")[1]); if(s1==s2) return e1-e2; return s1-s2;

});

}

for(String 1:list) } System.out.println(1);

522104010@perl

ode did not pass the execution
