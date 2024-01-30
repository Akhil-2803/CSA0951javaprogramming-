import java.util.Scanner;
class median
{
    public static void main(String[] args)
    {
        int i;
        float sum=0,avg;
        int arr[]={1,2,3,4,5,6};
        if(arr.length%2==0) {
            for (i = 2; i < (arr.length - 2); i++) {
                sum = sum + arr[i];
            }
            avg = sum / 2;
            System.out.println("median is" + avg);
        }
        else{
            sum=arr[2];
            System.out.println("median is"+sum);
 }
}
}