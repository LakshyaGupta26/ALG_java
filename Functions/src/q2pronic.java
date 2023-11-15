import java.util.Scanner;

public class q2pronic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPronic(number)) {
            System.out.println(number + " is a Pronic number.");
        } else {
            System.out.println(number + " is not a Pronic number.");
        }
        scanner.close();
    }
    static boolean isPronic(int n) {
        int i = 0;
        while (i * (i + 1) <= n) {
            if (i * (i + 1) == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
