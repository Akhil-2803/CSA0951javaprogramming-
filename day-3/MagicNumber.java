import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("The number is a magic number.");
        } else {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == 1) {
                System.out.println("The number is a magic number.");
            } else {
                System.out.println("The number is not a magic number.");
            }
        }
    }
}