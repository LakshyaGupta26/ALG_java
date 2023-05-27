import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nth number: ");
        int n = sc.nextInt();
        int sumA = 0, sumB =0, sumC=0, term =0;
        double termB, termC, numC =1, fac = 0;
        for(int i = 1; i<=n; i++){
            //series a
            term += i;
            sumA += term;

            //series b
            termB = (2 * i) - 1;
            fac *= i;
            sumB += termB / fac;

            //series c
            termC = Math.pow(-1, i + 1) * numC / fac;
            sumC += termC;
            numC *= i;

        }
        System.out.println("Sum of series A is: "+sumA);
        System.out.println("Sum of series B is: "+sumB);
        System.out.println("Sum of series C is: "+sumC);
    }
}