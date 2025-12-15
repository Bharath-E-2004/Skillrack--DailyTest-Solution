import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] persons = new String[N];
        for (int i = 0; i < N; i++) {
            persons[i] = sc.nextLine(); // "Child Father"
        }

        String target = sc.nextLine(); // given person name

        List<String> currentGen = new ArrayList<>();
        currentGen.add(target);

        int count = 0;

        while (true) {
            List<String> nextGen = new ArrayList<>();

            for (String parent : currentGen) {
                for (String p : persons) {
                    String[] parts = p.split(" ");
                    String child = parts[0];
                    String father = parts[1];

                    if (father.equals(parent)) {
                        nextGen.add(child);
                        count++;
                    }
                }
            }

            if (nextGen.isEmpty()) {
                break;
            }
            currentGen = nextGen;
        }

        System.out.println(count);
    }
}

/*
The program must accept the first and last names of N persons in a family. The last name of each person indicates the name of his/her father. The program must print the number of persons(descendants) belonging to the given person's family.

Boundary Condition(s):

1 <= N <= 50

2 <= Length of each name <= 20

Input Format:

The first line contains N.

The next N lines contain the first and last names of N persons in a family.

The N+2nd line contains a person name.

Output Format:

The first line contains the number of persons(descendants) belonging to the given person's family. A

Example Input/Output 1:

Input:

6

Arun Babloo

Gavin Babloo

Rajesh Arun

Hector Arun

Oliver Hector

Kavin Gavin

Arun

Output: 4
*/
