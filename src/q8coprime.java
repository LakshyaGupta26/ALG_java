import java.util.Scanner;
public class q8coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to check co-prime: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf=0;
        for(int i=1; i<=Math.min(num1,num2); i++){
            if(num1%i==0 && num2%i==0) {
                hcf = i;
            }
        }
        if(hcf==1){ System.out.println("numbers "+num1+" and "+num2+" are co-prime.");}
        else{System.out.println("numbers are not co-prime");}
    }
}