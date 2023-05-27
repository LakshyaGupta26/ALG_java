import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int rows = 5, num = 1;
        do {
            System.out.println("Menu:");
            for (int p = 1; p <= 5; p++) {
                System.out.println(p + ". Display pattern " + p);
            }
            System.out.println("Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + " ");
                            num++;
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j % 2 == 0) {
                                System.out.print(" 0  ");
                            } else {
                                System.out.print("1 ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j % 2 == 0) {
                                System.out.print("# ");
                            } else {
                                System.out.print("$ ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + " ");
                            num--;
                        }
                        num = i + 1;
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
            System.out.println();
        } while (choice != 5);
    }
}