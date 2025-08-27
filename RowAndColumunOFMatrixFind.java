import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first line and determine initial column count
        String[] start = sc.nextLine().split(" ");
        int col = start.length;
        int row = 0;

        while (true) {
            try {
                String[] str = sc.nextLine().split(" ");
                row++;

                // Check if column count has changed
                if (col != str.length) {
                    col = str.length;
                    System.out.println(++row + " " + col);
                    row = 0;
                }
            } catch (Exception e) {
                System.out.println(++row + " " + col);
                break;
            }
        }
    }
}

/*
The program must accept the integer values representing vertically concatenated integer matrices(possibly one) as the input. For each matrix, the program must print the size as the output.

Input Format:

The lines, each contains the integer values separated by a space representing vertically concatenated integer matrices.

Output Format:

The lines, each contains two integer values representing the size of a matrix.

Example Input/Output 1:

Input:

1234

5678

9 10 11 12

10 20

30 40

50 60

70 80 90

12 45 78

Output:

34

32

23

Example Input/Output 2:

Input:

80

88

54

15

97

6 80

68 6

14

15

85

72

47

65

18

99

46

62

26

3 62 67

75

45

1 79

63

62

52

Output:

65

Example Input/Output 3:

Input

10

20

30

40

50

60

70

90

100

80

11 12

13 14

15

Output:

41

14

21

22

11
*/
