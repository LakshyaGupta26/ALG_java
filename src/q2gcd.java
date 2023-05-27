import java.util.Scanner;
public class q2gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd=0;
        for(int i=1; i<=Math.min(num1,num2); i++){
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is: "+gcd);
    }
}