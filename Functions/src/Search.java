import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        accept();
    }
    public static void accept() {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the search value: ");
        int n = sc.nextInt();
        Lin_search(a, n);
    }
    public static void Lin_search(int a[], int sv) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == sv) {
                found = true;
                System.out.println("Search value found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Search value not found in the array.");
        }
    }
}
