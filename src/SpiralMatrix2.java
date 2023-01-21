import java.util.*;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int a[][]=new int[0][0];
        int b = 1;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                a[i][j] = b;
                b++;
            }
        }
        System.out.println(spiralOrder(a));

    }public static List<Integer> spiralOrder(int[][] matrix){

        int m = matrix.length;
        if(m==0){
            return Collections.singletonList(0);
        }
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();
        int rowStart = 0, rowEnd = m - 1, colStart = 0, colEnd = n - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return result;
    }
}
