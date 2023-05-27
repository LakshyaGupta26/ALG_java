import java.util.Scanner;
import java.io.*;

public class q10palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (from 10-1000): ");
        int num = sc.nextInt();
        int temp = num, digit = 0, sum = 0, con = 0;
        if (num >= 10 && num <= 1000) {
            for (int i = 1; i <= temp / 2; i++) {
                if (temp % i == 0) {
                    con++;
                }
            }
            while (num > 0) {
                digit = num % 10;
                sum = sum * 10 + digit;
                num = num / 10;
            }
            if (temp == sum && con == 1) {
                System.out.println(temp + " is a Prime Palindrome.");
            } else {
                System.out.println(temp + " is not a Prime Palindrome.");
            }
        } else{
            System.out.println("Enter a number between (10:1000).");
        }
    }
}