import sys

for line in sys.stdin:
    sum1 = 0
    for i in line.strip().split():
        try:
            sum1 += int(i)
        except ValueError:
            break
    print(sum1)

# Please convert the following Java code to Python so that the Python program executes successfully passing the test cases.

# import java.util.*;

# public class Hello {

# public static void main(String[] args) {

# Scanner sc = new Scanner(System.in);

# Scanner strSc = null;

# String currLine;

# int sum = 0;

# while (sc.hasNextLine()) {

# currLine = sc.nextLine();

# strSc = new Scanner(currLine);

# while (strSc.hasNextInt()) {

# sum += strSc.nextInt();

# }

# System.out.println(sum);
#   sum=0;
# }
# }
