import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String rword = replace(word);

        System.out.println("Sample output: " + rword);
    }
    static String replace(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char curChar = word.charAt(i);
            char repChar = (char) (curChar + 2);
            result.append(repChar);
        }
        return result.toString();
    }
}
