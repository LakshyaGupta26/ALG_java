import java.util.Scanner;

public class q3str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();
        String[] words = inputSentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
    }
}
