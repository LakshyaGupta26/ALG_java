import java.util.Scanner;
public class q3sod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit num: ");
        int num = sc.nextInt();
        int sum=0;
        if(num>=100 && num<=999){
            while(num>0){
                sum = sum + num % 10;
                num = num / 10;
            }
            System.out.println("Sum of digits are: "+sum);
        }
        else{
            System.out.println("please enter a 3 digit number only.");
        }
    }
}