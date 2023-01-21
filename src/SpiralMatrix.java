import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int b = 1;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                a[i][j] = b;
                b++;
            }
        }
        System.out.println(spiralOrder(a));

    }public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> outputOrder = new ArrayList<>();
//        System.out.println(Arrays.deepToString(matrix));
        int totalRows = matrix.length;
//        System.out.println(totalRows);
        int totalColumns = matrix[0].length;
//        System.out.println(totalColumns);

        Set<Integer> set = new HashSet<>();

            for (int i = 0; i < totalColumns; i++) {
                outputOrder.add(matrix[0][i]); //1st col
                set.add(matrix[0][i]);
            }
            //            System.out.println(outputOrder);
            for (int i = 1; i < totalRows; i++) {
                outputOrder.add(matrix[i][totalColumns - 1]); //last row
                set.add(matrix[i][totalColumns - 1]);
            }
//            System.out.println(outputOrder);
            for (int i = totalColumns - 2; i >= 0; i--) {
                outputOrder.add(matrix[totalRows - 1][i]); //last col
                set.add(matrix[totalRows - 1][i]);
            }
            for (int i = totalRows - 2; i >= (int) Math.ceil(totalRows / 2); i--) {
                outputOrder.add(matrix[i][0]); // last row to mill row
                set.add(matrix[i][0]);
            }
            System.out.println(outputOrder);
            for (int i = 1; i <= totalColumns - 2; i++) {
                outputOrder.add(matrix[(int) Math.floor(totalRows / 2)][i]); // mid col
                set.add(matrix[(int) Math.floor(totalRows / 2)][i]);
            }

            System.out.println(set);


//        System.out.println(outputOrder);

        return outputOrder;
    }
}
