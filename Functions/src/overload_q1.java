import java.util.Scanner;

public class overload_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter choice: \n1. Check for BUZZ number \n2. Check for Composite number \n3. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter a number: ");
                int buzzNumber = scanner.nextInt();
                checkAndPrint(buzzNumber);
            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                int compositeNumber = scanner.nextInt();
                checkAndPrint(compositeNumber, true);
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
    static void checkAndPrint(int num) {
        boolean isBuzz = num % 10 == 7 || num % 7 == 0;
        System.out.println(num + (isBuzz ? " is a BUZZ number." : " is not a BUZZ number."));
    }
    static void checkAndPrint(int num, boolean isComposite) {
        boolean isComp = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isComp = true;
                break;
            }
        }
        System.out.println(num + (isComp ? " is a Composite number." : " is not a Composite number."));
    }
}
