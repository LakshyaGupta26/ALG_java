import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Sample Output:");
        for (int number : numbers) {
            if (number < 0) {
                System.out.print(number + " ");
            }
        }
        for (int number : numbers) {
            if (number >= 0) {
                System.out.print(number + " ");
            }
        }
    }
}
