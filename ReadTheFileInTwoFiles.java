import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file1 = sc.nextLine(); // empNames.txt
        String file2 = sc.nextLine(); // empDesignation.txt

        // TreeMap keeps keys sorted
        Map<Integer, String> nameMap = new TreeMap<>();
        Map<Integer, String> desigMap = new HashMap<>();

        // Read File 1: id name
        try (Scanner fs1 = new Scanner(new File(file1))) {
            while (fs1.hasNext()) {
                int id = fs1.nextInt();
                String name = fs1.next();
                nameMap.put(id, name);
            }
        } catch (Exception e) {
            return;
        }

        // Read File 2: id designation
        try (Scanner fs2 = new Scanner(new File(file2))) {
            while (fs2.hasNext()) {
                int id = fs2.nextInt();
                String desig = fs2.next();
                desigMap.put(id, desig);
            }
        } catch (Exception e) {
            return;
        }

        // Print sorted output
        for (int id : nameMap.keySet()) {
            System.out.println(id + " " + nameMap.get(id) + " " + desigMap.get(id));
        }
    }
}

/*
The program must accept two string values F1 and F2 representing the names of two text files as the input. The file F1 contains the id and name of N employees and the file F2 contains the id and designation of the N employees. The program must print the id, name and designation of the N employees from the given two files as the output. The ids of the employees must be printed in sorted order.

Note:

- Both files are always in the same folder where the program executes. Both the files have the same number of lines/records.

Boundary Condition(s):

5 <=F1, F2 <= 30

1 <= N <= 50

1 <= Each employee's id <= 100

1 <= Length of each employee's name and designation <= 30

Input Format:

The first line contains F1. The second line contains F2.

Output Format:

The first N lines contain the id, name and designation of the N employees separated by a

space.

Example Input/Output 1:

Input:

empNames.txt

empDesignation.txt

Output 10 Catherine Trainee 20 Anitha HR 30 Pravin SDE

40 Hector Manager
*/
