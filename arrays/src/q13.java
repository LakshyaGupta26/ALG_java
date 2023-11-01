import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 20 integers:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                even[evenCount] = numbers[i];
                evenCount++;
            } else {
                odd[oddCount] = numbers[i];
                oddCount++;
            }
        }

        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i]);
            if (i < evenCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i]);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
