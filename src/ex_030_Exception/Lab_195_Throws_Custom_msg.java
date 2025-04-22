package ex_030_Exception;

import java.util.Scanner;

public class Lab_195_Throws_Custom_msg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try{
            ValidateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void ValidateAge(int age) throws ArithmeticException,NullPointerException,Exception {
            if (age < 18)
            {
                throw new ArithmeticException("You are not allowed to go outside"); //like a strict father
                // throw new NotValidAgeException("Not a Valid age");
            }
    }
}