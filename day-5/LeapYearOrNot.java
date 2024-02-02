import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scanner.nextInt();
        if (year%4==0)
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
}
