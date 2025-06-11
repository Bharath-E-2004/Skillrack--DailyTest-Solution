import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] matrix = new int[num][num];

        // Read input matrix
        for (int i = 0; i < num; i++)
            for (int j = 0; j < num; j++)
                matrix[i][j] = sc.nextInt();

        // Modify symmetric equal elements: only one kept, other set to 0
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (matrix[i][j]!=0 &&  matrix[j][i]!=0) {
                    if(matrix[i][j] matrix[j][i]) 
                       matrix[i][j]=0;
                    else
                      matrix[j][i]=0; 
                }
            }
        }

        // Print updated matrix
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}
/*
  There are N nodes in a directed graph. The program must accept the adjacency matrix of the directed graph as the input. If there are two edges between the two nodes, then the edges are called as parallel edges. The program must remove the parallel edges(i.e., remove the edge with maximum weight) in the graph. Then the program must print the revised adjacency matrix of the graph as the output.

Note:

-The value 0 in the matrix indicates that there is no edge between the two nodes.

- The weigths of the parallel edges are always not equal.
  */
