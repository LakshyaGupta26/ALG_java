import java.util.Scanner;
public class q6armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong: ");
        int num = sc.nextInt();
        int sum = 0, num1 = num, digit;
        for (int i = 0; i <= num1; i++) {
            digit = num%10;
            sum = sum + (digit*digit*digit);
            num = num / 10;
        }
        System.out.println("Sum of cubes of digits are: " + sum);
        if (num1 % sum == 0) {
            System.out.println("The number is an armstrong number.");
        } else {
            System.out.println("The number is not an armstrong number.");
        }
    }
}