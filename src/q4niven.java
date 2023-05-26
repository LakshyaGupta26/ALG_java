import java.util.Scanner;
public class q4niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Niven: ");
        int num = sc.nextInt();
        int sum=0, num1=num;
        for(int i=0;i<=num1;i++){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits are: "+sum);
        if(num1%sum==0){
            System.out.println("The number is a niven number.");
        }
        else{
            System.out.println("The number is not a niven number.");
        }
    }
}
