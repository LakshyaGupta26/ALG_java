import java.util.Scanner;

public class q4str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputSentence.length(); i++) {
            char currentChar = inputSentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    currentChar = Character.toLowerCase(currentChar);
                }
                if ("aeiou".indexOf(currentChar) != -1) {
                    result.append((currentChar == 'u') ? 'a' : (char) (currentChar + 1));
                } else {
                    result.append((char) (currentChar - 1));
                }
            } else {
                result.append(currentChar);
            }
        }
        System.out.println("Result Sentence: " + result.toString());
    }
}
