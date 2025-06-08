import java.util.*;

class MyList {
    static int min = Integer.MAX_VALUE;
    int[] arr;

    public MyList(int[] arr) {
        this.arr = arr;
        min = Math.min(arr.length, min);
    }

    public void printTheArray() {
        for (int i = min; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < min; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine().trim());

        MyList[] list = new MyList[size];

        for (int i = 0; i < size; i++) {
            String[] str = sc.nextLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int j = 0; j < str.length; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            list[i] = new MyList(arr);
        }

        for (MyList l : list) {
            l.printTheArray();
        }
    }
}
/*
   Please convert the following Python code to Java so that the Java program executes successfully passing the test cases.

N = int(input().strip())

lists = []

for ctr in range(N):

currList = list(map(int, input().split()))

lists.append(currList)

minCol = min([len(numList) for numList in lists])

for index in range(N):

lists [index] = lists [index] [minCol:] + lists[index][:minCol]

for numlist in lists:

print(*numList)
*/
