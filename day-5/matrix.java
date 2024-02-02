public class matrix
{
    public static void main(String[] args) {
        char a[][] = {{'$', '*', '#'}, {'#', '$', '*'}, {'*', '#', '$'}};
        int i, j;
        char c[][] = new char[3][3];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                c[i][j] = a[i][j];
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {

                System.out.print(a[i][j]);

            }
            System.out.println();
        }
    }
}