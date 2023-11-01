import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
//        scanner.close();
        System.out.println("Sample Output:");
        q2(numbers);
    }
    public static void q2(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                System.out.print(number + " ");
            }
            else if(number >=0){
                System.out.println(number + " ");
            }
        }
        System.out.println();
    }
}