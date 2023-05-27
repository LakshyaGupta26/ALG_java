import java.util.Scanner;

public class q12special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's Special: ");
        int num = sc.nextInt();
        int sum = 0, digit, fac =1, temp = num;
            while(num!=0){
                digit = num%10;
                for(int i=1; i<=digit; i++){
                    fac *= i;
                }
                sum += fac;
                fac = 1;
                num = num/10;
            }
            if(temp==sum) {
                System.out.println("Number is a 'Special number'.");
            }
            else{
                System.out.println("Number is not a 'Special number'.");
            }
    }
}