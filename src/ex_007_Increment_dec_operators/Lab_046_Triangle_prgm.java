package ex_007_Increment_dec_operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_046_Triangle_prgm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length 1");
        float l1=scanner.nextFloat();
        System.out.println("Enter the length 2");
        float l2=scanner.nextFloat();
        System.out.println("Enter the length 3");
        float l3=scanner.nextFloat();
        if (l1==l2 && l1==l3)
        {
            System.out.println("All sides are equal. This triangle is equilateral");
        }
        else if (l1==l2 || l1==l3)
        {
            System.out.println("Two sides are equal. This triangle is isosceles");
        }
        else
        {
            System.out.println("None of the sides are equal. This triangle is scalene");
        }
    }


}


/*Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.*/
