package ex_007_Increment_dec_operators;

import java.util.Scanner;

public class Lab_044_14Mar25Task3useripOE {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        String result= (num%2==0)?"Even":"Odd";
        System.out.println("The entered number is "+result);
    }
}
