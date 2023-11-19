import java.util.Scanner;

public class q7tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name and annual income");
        String name = sc.next();
        double income = sc.nextInt();
        display(name,income);
    }
    static void display(String name, double income){
        double itax = Tax(income);
        System.out.println("Name: "+name+"\nIncome Tax to pay: "+itax);
    }
    static double Tax(double income){
        double s1 = 250000;
        double s2 = 500000;
        double s3 = 1000000;
        if(income<=s1){
            return 0;
        }
        else if(income>s1 && income<=s2 ) {
            return 0.1*income;
        }
        else if(income>s2 && income<=s3){
            return 25000 + 0.2*(income-s2);
        }
        else{
            return 25000 + 50000 +0.3*(income-s3);
        }
    }
}