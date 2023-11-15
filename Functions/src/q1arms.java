import java.util.Scanner;

public class q1arms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    static boolean isArmstrong(int n) {
        int result = 0, nDigits = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            ++nDigits;
        }
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, nDigits);
            temp /= 10;
        }
        return result == n;
    }
}
