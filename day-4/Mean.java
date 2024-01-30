public class Mean {
    public static void main(String[] args){
        int a[] = {66, 79, 84, 53, 28, 17, 91, 35};
        double b[] = new double[8];
        double sum = 0;
        double average;
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        average = sum/(a.length);
        System.out.println(average);
        for (int i = 0; i < a.length; i++){
            double c = (a[i] - average);
            b[i] = c;
            System.out.println(c);
        }
        for (int i = 0; i < b.length; i++){
            double sqr = Math.sqrt(b[i] * b[i]);
            System.out.println(sqr);
        }
    }
}