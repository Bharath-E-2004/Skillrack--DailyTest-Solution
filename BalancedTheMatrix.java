/*
import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        String[][] matrix = new String[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.next();
            }
        }

        // Step 1: Collect integers from right to left columns
        List<String> numbers = new ArrayList<>();

        for(int j = col - 1; j >= 0; j--) {
            for(int i = 0; i < row; i++) {
                if(!matrix[i][j].equals("*")) {
                    numbers.add(matrix[i][j]);
                }
            }
        }

        // Step 2: Fill from left to right columns
        int index = 0;

        for(int j = 0; j < col; j++) {
            for(int i = 0; i < row; i++) {

                if(index < numbers.size()) {
                    matrix[i][j] = numbers.get(index++);
                } else {
                    matrix[i][j] = "*";
                }
            }
        }

        // Step 3: Print result
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/
