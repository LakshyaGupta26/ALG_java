import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int evenSum = 0;
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
