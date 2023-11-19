import java.util.Scanner;

public class overload_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        double h = n;
        System.out.println("\nSeries of Integers:");
        Print(n);
        Print(h);
    }
    public static void Print(int n) {
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term * 10 + 1;
        }
    }
    public static void Print(double n) {
        double sum = 0;
        double factorial = 1;

        for (double i = 1; i <= n; i++) {
            factorial *= i;
            sum += (factorial / (Sum(i)));
        }
        System.out.println("\nSum of the series: " + sum);
    }
    public static double Sum(double n) {
        return (n * (n + 1)) / 2;
    }
}
