import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        sort(num);
        int[] result = RemoveDuplicate(num);
        System.out.println("Sorted array without duplicates:");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static int[] RemoveDuplicate(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        int[] result = new int[count + 1];
        result[0] = arr[0];
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}