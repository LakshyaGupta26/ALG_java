import java.util.Scanner;

public class overload_q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:\n1. Convert Decimal to Binary \n2. Convert Binary to Decimal \n3. Exit\n");
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.print("Enter a decimal number: ");
            int decNum = scanner.nextInt();
            System.out.println("Binary equivalent: " + number(decNum));
        }
        else if(choice==2) {
            System.out.print("Enter a binary number: ");
            String binNum = scanner.next();
            System.out.println("Decimal equivalent: " + number(binNum));
        }
        else {
            System.out.println("Exiting program...");
        }
    }

    static String number(int decNum) {
        if (decNum == 0) {
            return "0";
        } else {
            return number(decNum / 2) + decNum % 2;
        }
    }
    static int number(String binNum) {
        int decNum = 0;
        int pow = 0;
        for (int i = binNum.length() - 1; i >= 0; i--) {
            char digit = binNum.charAt(i);
            if (digit == '1') {
                decNum += Math.pow(2, pow);
            } else if (digit != '0') {
                System.out.println("Enter valid digit");
            }
            pow++;
        }
        return decNum;
    }
}