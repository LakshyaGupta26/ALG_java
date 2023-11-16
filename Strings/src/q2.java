import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (Character.isLetter(currentChar)) {
                if ("AEIOU".indexOf(currentChar) != -1) {
                    result.append(Character.isLowerCase(currentChar) ? Character.toUpperCase(currentChar) : Character.toLowerCase(currentChar));
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            } else {
                result.append(currentChar);
            }
        }
        System.out.println("Result String: " + result);
    }
}
