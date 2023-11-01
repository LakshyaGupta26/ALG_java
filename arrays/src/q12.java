import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 10; i < 20; i++) {
            for (int j = 10; j < 19 - (i - 10); j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Complete List of Integers: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
    }
}