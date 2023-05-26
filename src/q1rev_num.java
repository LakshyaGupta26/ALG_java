import java.util.Scanner;
public class q1rev_num {
    public static void main(String[] args) {
        int num,digit, new_num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        while(num>0){
            new_num = new_num*10 + num%10;
            System.out.print(num%10+", ");
            num= num/10;
        }
        System.out.println("\nReversed number: "+new_num);
    }
}