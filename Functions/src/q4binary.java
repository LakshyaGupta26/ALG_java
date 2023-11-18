import java.util.Scanner;

public class q4binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Binary eq of " + num + " is " + Number(num));
    }
    static String Number(int num) {
        if (num == 0) {
            return "0";
        } else {
            return Number(num / 2) + num % 2;
        }
    }
}
