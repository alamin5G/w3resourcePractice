package java_basic_1;

public class SumOfMatrixTopLeftToBottomRigh {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < 1) {
                    sum += matrix[i][j];
                }else if( i == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
