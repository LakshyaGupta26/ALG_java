import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int prime = Prime(num);
        int palindrome = Palindrome(num);

        if (prime == 1 && palindrome == 0) {
            System.out.println("Prime but not Palindrome");
        } else if (prime == 0 && palindrome == 1) {
            System.out.println("Palindrome but not Prime");
        } else if (prime == 1 && palindrome == 1) {
            System.out.println("It is a Prime Palindrome number");
        } else {
            System.out.println("Neither a prime number nor a Palindrome");
        }
    }
    public static int Prime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static int Palindrome(int n) {
        int orgiNum = n;
        int revNum = 0;

        while (n > 0) {
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n /= 10;
        }
        if (orgiNum == orgiNum) {
            return 1;
        } else {
            return 0;
        }
    }
}