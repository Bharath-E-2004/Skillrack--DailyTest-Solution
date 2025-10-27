import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); // number of rows
        int c = sc.nextInt(); // number of columns
        int k = sc.nextInt(); // integrand alpha

        List<String> alphaList = new ArrayList<>();
        List<String> numericList = new ArrayList<>();

        int total = r * c;

        // Read matrix values
        for (int i = 0; i < total; i++) {
            String val = sc.next();
            if (Character.isAlphabetic(val.charAt(0))) {
                alphaList.add(val);
            } else {
                numericList.add(val);
            }
        }

        int indAlpha = 0, indNum = 0;

        // Print matrix with condition based on integrand alpha
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((r - k - i) & (c - k - j) != 0) {
                    System.out.print(alphaList.get(indAlpha++) + " ");
                } else {
                    System.out.print(numericList.get(indNum++) + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
The program must accept a matrix of size R°C and an integer K as the input. The matrix contains KK alphabets and the rest are integers. The program must rearrange the matrix so that all K*K alphabets must be present at the bottom-right K*K submatrix. The integers and alphabets must be arranged in the order of their occurrence. Then the program must print the revised matrix as the output.

Note: The value of K is always less than or equal to both R and C.

Boundary Condition(s):

2<=R, C <= 50

1 <= Value of each integer in the matrix <= 10^5

Input Format:

The first line contains R, C and K separated by a space.

The next R lines contain the matrix.

Output Format:

The first R lines contain the revised matrix.

Example Input/Output 1:

Input:

553

90 b 86 76 1

a 14 c 99 12

91 d 64 54 e

82 78 51 f 67

h 43 g 56 65

Output:

90 86 76 14 99

12 91 64 54 82

78 51 bia

67 43 cde

56 65 thg
*/
