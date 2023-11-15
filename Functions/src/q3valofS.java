import java.util.Scanner;

public class q3valofS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        long result = calculateCombination(n, m);
        System.out.println("The value of S is: " + result);
    }
    static long calculateCombination(int n, int m) {
        long numerator = fact(n);
        long denominator = fact(m) * fact(n - m);
        return numerator / denominator;
    }
    static long fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
