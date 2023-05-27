import java.util.Scanner;

public class q11automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Automorphic: ");
        int num = sc.nextInt();
        int square = num * num;
        int a = 0;
        for (int i = 0; i < num; i++) {
            if (num % 10 != square % 10) {
                num = num / 10;
                square = square / 10;
                a = 1;
            } else {
                a = 2;
            }
        }
        if (a == 1) {
            System.out.println("Number is not Automorphic. ");
        } else if(a==2){
            System.out.println("Number is Automorphic.");
        }
    }
}