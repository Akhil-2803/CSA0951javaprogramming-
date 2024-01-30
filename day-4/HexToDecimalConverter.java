import java.util.Scanner;

public class HexToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine();

        try {
            long decimalNumber = hexToDecimal(hexNumber);
            System.out.println("Decimal equivalent: " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number. Please enter a valid hexadecimal number.");
        }
    }

    static long hexToDecimal(String hexNumber) {
        return Long.parseLong(hexNumber, 16);
    }
}
