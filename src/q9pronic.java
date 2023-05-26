import java.util.Scanner;

public class q9pronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for pronic.");
        int num = sc.nextInt();
        int a=0, p1=0, p2=0;
        for(int i=1; i<num; i++){
            if(num%i==0 && num==i*(i+1)){
                a = 1;
                p1=i;
                p2=i+1;
            }
        }
        if(a==1){System.out.println("Number "+num+" is a pronic number with "+p1+","+p2);}
        else{System.out.println("number is not pronic.");}
    }
}