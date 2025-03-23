package ex_007_Increment_dec_operators;

import java.util.Scanner;

public class Lab_042_14Mar25Task1_UserInput {
    public static void main(String[] args) {
      /*  String Name=args[0];
        int Age=Integer.parseInt(args[1]);
        int Salary=Integer.parseInt(args[2]);
        System.out.println("Entered Name is "+Name+ "\n" + "Entered Age is "+Age+ "\n" + "Entered Salary is "+Salary );

       */
        Scanner scanner= new Scanner(System.in); //Scanner obj
        System.out.println("Enter your name");
        String Name=scanner.next();
        System.out.println("Enter your Age");
        int Age= scanner.nextInt();
        System.out.println("Enter your Salary");
        int Salary= scanner.nextInt();
        System.out.println("Entered Name is "+Name+ "\n" + "Entered Age is "+Age+ "\n" + "Entered Salary is "+Salary);
    }
}

//CLI Options
//
//Take a user input - Name, Age and Salary and print them in the end.
//
//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
