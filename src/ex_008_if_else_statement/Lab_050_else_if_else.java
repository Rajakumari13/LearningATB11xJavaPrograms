package ex_008_if_else_statement;

import java.util.Scanner;

public class Lab_050_else_if_else {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if (age>=23 && age<=50)
        {
            System.out.println("Eligible to marry");
        }
        else if (age>50)
        {
            System.out.println("Eligible to retire to stay happy and healthy");
        }
        else
        {
            System.out.println("Study well.Upgrade your knowledge");
        }
    }
    }

