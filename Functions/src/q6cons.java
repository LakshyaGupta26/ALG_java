import java.util.Scanner;

public class q6cons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        Display(str);
    }

    public static void Display(String s) {
        System.out.print("Consonants: ");
        for (int i = 0; i < s.length(); i++) {
            char currentChar = Character.toLowerCase(s.charAt(i));
            if (currentChar >= 'a' && currentChar <= 'z' && "aeiou".indexOf(currentChar) == -1) {
                System.out.print(currentChar + " ");
            }
        }
    }
}
