import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        int[] joiningYears = new int[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the year of joining for employee " + (i + 1) + ": ");
            joiningYears[i] = scanner.nextInt();
        }

        for (int i = 0; i < numEmployees - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numEmployees; j++) {
                if (joiningYears[j] < joiningYears[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = joiningYears[i];
                joiningYears[i] = joiningYears[minIndex];
                joiningYears[minIndex] = temp;
            }
        }
        System.out.print("Sorted List of Joining Years: ");
        for (int i = 0; i < numEmployees; i++) {
            System.out.print(joiningYears[i] + ", ");
        }
    }
}