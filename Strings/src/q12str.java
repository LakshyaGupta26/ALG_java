import java.util.Scanner;

public class q12str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] movies = new String[20];

        System.out.println("Enter 20 movie names:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Movie " + (i + 1) + ": ");
            movies[i] = scanner.nextLine();
        }
        System.out.println("\nEnter a movie to search:");
        String movieToSearch = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < 20; i++) {
            if (movies[i].equalsIgnoreCase(movieToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Movie found in database.");
        } else {
            System.out.println("Movie not found in the database.");
        }
    }
}