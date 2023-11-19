import java.util.Scanner;

public class q3valofS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        long result = calc(n, m);
        System.out.println("The value of S is: " + result);
    }
    static long calc(int n, int m) {
        long numer = fact(n);
        long deno = fact(m) * fact(n - m);
        return numer / deno;
    }
    static long fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
