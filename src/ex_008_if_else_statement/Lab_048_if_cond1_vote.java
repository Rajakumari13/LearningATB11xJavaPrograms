package ex_008_if_else_statement;

import java.util.Scanner;

public class Lab_048_if_cond1_vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        if(age>18)
        {
            System.out.println("You are eligible to vote");
        }
        else {
        System.out.println ("You are not eligible to vote");
    }}
}
