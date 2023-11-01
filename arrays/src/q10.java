import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];
        int[] outputArray = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            inputArray[i] = scanner.nextInt();
            int number = inputArray[i];
            int reversed = 0;
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            outputArray[i] = reversed;
        }

        System.out.print(" Input Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(inputArray[i]);
            if (i < 9) {
                System.out.println("  -  " + outputArray[i]);
            }
        }
    }
}