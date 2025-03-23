package ex_006_Ternary_operator.Lab_031_Ternary;

import java.util.Scanner;

public class Lab_034_13Mar25Task_Find_grade {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark=scanner.nextInt();
        String Grade= (mark>100 || mark<=0)?"None": (mark>=90) ? "A" : (mark>=80)?"B":(mark>=70)?"C":(mark>=60)?"D":"E";
        //(mark<100 && mark>=80)?'B':(mark<100 && mark>=70)?'C':(mark<100 && mark>=0)?'D':'F';
        System.out.println("Your Grade is "+ Grade);
    }

}

/*
Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

E: 0-59
 */