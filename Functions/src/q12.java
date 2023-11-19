import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int number = sc.nextInt();
        factor(number);
    }
    public static void factor(int n) {
        if (n >= 10 && n <= 99) {
            int fFactor = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    fFactor = i;
                    break;
                }
            }
            if (fFactor != 0) {
                System.out.println("The first factor of " + n + " is " + fFactor);
                int sFactor = n / fFactor;
                System.out.println("Factors are: " + fFactor + "," + sFactor);
            } else {
                System.out.println("No factors found.");
            }
        } else {
            System.out.println("Please enter a valid 2-digit number.");
        }
    }
}
