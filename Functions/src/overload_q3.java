import java.util.Scanner;

public class overload_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(i) Enter an integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a character ('s' or 'l'): ");
        char option1 = sc.next().charAt(0);
        calculate(num1, option1);

        System.out.print("(ii) Enter the first integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num3 = sc.nextInt();
        System.out.print("Enter a character ('g' or 'l'): ");
        char option2 = sc.next().charAt(0);
        calculate(num2, num3, option2);
    }
    public static void calculate(int m, char ch) {
        if (ch == 's' && m % 7 == 0) {
            System.out.println(m + " is divisible by 7.");
        } else {
            int lastDigit = m % 10;
            System.out.println(m + " is not divisible by 7.");
            if (lastDigit == 7) {
                System.out.println(m + " has 7 as its last digit.");
            } else {
                System.out.println(m + " does not have 7 as its last digit.");
            }
        }
    }
    public static void calculate(int a, int b, char ch) {
        if (ch == 'g' && a>b) {
            System.out.println("Greater integer: " + a);
        } else {
            System.out.println("Greater integer: " + b);
            if (a < b) {
                System.out.println("Smaller integer: " + a);
            } else {
                System.out.println("Smaller integer: " + b);
            }
        }
    }
}
