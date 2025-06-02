import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        char[][] city = new char[row][col];
        
        // Input matrix
        for (int i = 0; i < row; i++) {
            String line = sc.next();
            for (int j = 0; j < col; j++) {
                city[i][j] = line.charAt(j);
            }
        }

        // Create a new matrix to avoid overwriting original during update
        char[][] updatedCity = new char[row][col];
        for (int i = 0; i < row; i++) {
            System.arraycopy(city[i], 0, updatedCity[i], 0, col);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (city[i][j] == 'A') {
                    // 3x3 block
                    int i1 = i - 1, j1 = j - 1;
                    for (int k = 0; k < 9; k++) {
                        int ni = i1 + k / 3;
                        int nj = j1 + k % 3;
                        if (valid(ni, nj, row, col)) {
                            updatedCity[ni][nj] = '#';
                        }
                    }
                } else if (city[i][j] == 'B') {
                    // 5x5 block
                    int i1 = i - 2, j1 = j - 2;
                    for (int k = 0; k < 25; k++) {
                        int ni = i1 + k / 5;
                        int nj = j1 + k % 5;
                        if (valid(ni, nj, row, col)) {
                            updatedCity[ni][nj] = '#';
                        }
                    }
                }
            }
        }

        // Count and print the number of '#' characters
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (updatedCity[i][j] == '#') {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean valid(int i, int j, int row, int col) {
        return i >= 0 && i < row && j >= 0 && j < col;
    }
}
/*  The program must accept a matrix of size R°C representing R°C cities. Each city may or may not have a cell phone tower. The presence of a small tower is indicated by the letter S, the presence of a large tower is indicated by the letter L and the absence of a tower is indicated by

0. The two types of the towers give the signal to the cities as given below.

- A small tower will give the signal to the cities around the tower (only the nearest layer) and the city where the tower is installed.

- A large tower will give the signal to the cities in the two nearest layers around the tower and the city where the tower is installed.

The program must print the number of cities that receive the signal as the output.

Boundary Condition(s):

2<=RC <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C characters separated by a space.

Output Format:

The first line contains an integer representing the number of cities that receive the signal
  */
