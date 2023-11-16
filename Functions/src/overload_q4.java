import java.util.Scanner;

public class overload_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter you choice:\n1. Convert Decimal to Binary :\n2. Convert Binary to Decimal \n3.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    System.out.println("Binary equivalent: " + convert(decimalNumber));
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    String binaryNumber = scanner.next();
                    System.out.println("Decimal equivalent: " + convert(binaryNumber));
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
    static String convert(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    static int convert(String binary) {
        return Integer.parseInt(binary, 2);
    }
}
