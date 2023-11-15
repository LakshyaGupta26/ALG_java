import java.util.Scanner;

public class q4binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Binary equivalent of " + number + " is " + toBinary(number));
    }
    static String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
}
