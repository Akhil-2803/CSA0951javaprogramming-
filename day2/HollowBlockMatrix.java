public class HollowBlockMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // Print the original matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Create a hollow block matrix
        int[][] hollowMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix[0].length - 1) {
                    hollowMatrix[i][j] = matrix[i][j];
                } else {
                    hollowMatrix[i][j] = 0;
                }
            }
        }

        // Print the hollow block matrix
        System.out.println("Hollow block matrix:");
        for (int i = 0; i < hollowMatrix.length; i++) {
            for (int j = 0; j < hollowMatrix[i].length; j++) {
                System.out.print(hollowMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}