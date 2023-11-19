import java.util.Scanner;

public class q5magic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (Magic(word)) {
            System.out.println("It is a Magic String");
        } else {
            System.out.println("It is not a Magic String");
        }
    }

    public static boolean Magic(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char curChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);

            if (Character.isLetter(curChar) && Character.isLetter(nextChar)) {
                return true;
            }
        }
        return false;
    }
}