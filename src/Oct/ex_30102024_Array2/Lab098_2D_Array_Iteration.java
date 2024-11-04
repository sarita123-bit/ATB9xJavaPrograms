package Oct.ex_30102024_Array2;

public class Lab098_2D_Array_Iteration {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // R - 3
        // R -> C -> 3
        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]); // 123456789
            }
        }*/
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*int[][] m1 = {{1,2,3},{4,5},{7,8,9}};
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/
    }
}
