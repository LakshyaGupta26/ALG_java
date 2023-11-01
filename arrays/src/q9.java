import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 100;
        int numSubjects = 6;

        int[] rollNumbers = new int[numStudents];
        String[] names = new String[numStudents];
        double[][] marks = new double[numStudents][numSubjects];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll number: ");
            rollNumbers[i] = scanner.nextInt();
            System.out.print("Name: ");
            names[i] = scanner.next();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Marks in subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < numStudents; i++) {
            double totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            double percentage = (totalMarks / (numSubjects * 100)) * 100;
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 60) {
                grades[i] = 'B';
            } else if (percentage >= 40) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grades[i]);
        }
    }
}