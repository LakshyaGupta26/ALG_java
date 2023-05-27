import java.util.Scanner;
public class q5neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Neon: ");
        int num = sc.nextInt();
        num = num*num;
        int sum=0, num1=num;
        for(int i=0;i<=num1;i++){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits are: "+sum);
        if(num1%sum==0){
            System.out.println("The number is a neon number.");
        }
        else{
            System.out.println("The number is not a neon number.");
        }
    }
}
