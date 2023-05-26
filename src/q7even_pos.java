import java.util.Scanner;

public class q7even_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll print multiplication of successors of even digits: ");
        int num = sc.nextInt();
        int mul=1, num1=num, digit;
        for (int i = 0; i <= num1; i++) {
            digit = num%10;
            if(digit%2==0){
                mul = mul*(digit+1);
            }
            num = num / 10;
        }
        if(mul==1){System.out.println("no even digits exists in number");}
        else{System.out.println("multiplication of successors of even digits are: "+mul);}
    }
}