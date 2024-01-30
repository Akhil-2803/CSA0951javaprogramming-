import java.util.Scanner;

public class DigitFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDigitFactorial(number)) {
            System.out.println(number + " is a digit factorial number.");
        } else {
            System.out.println(number + " is not a digit factorial number.");
        }
    }

    static boolean isDigitFactorial(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
