package ex_011_While_Loop;

import java.util.Scanner;

public class Lab_086_20Mar25_Task_Feb_series
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //class to get i/p
        System.out.println("Enter the number to show the fibonacci sequence");
        int input= scanner.nextInt(); //enter the input
        int number1=0, number2=1;
        int next;
        System.out.print("Fibonacci sequence for the entered number is: "+ number1 + ", "+ number2);
for(int i=2;i<input;i++){
    next=number1+number2;
    System.out.print(", "+next);
    number1=number2;
    number2=next;
}

scanner.close();
    }
}


/*
The Fibonacci Sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.

Formula:

F(n)=F(n−1)+F(n−2)F(n) = F(n-1) + F(n-2)F(n)=F(n−1)+F(n−2)

where:

F(0)=0F(0) = 0F(0)=0

F(1)=1F(1) = 1F(1)=1

Example of the Sequence:

0,1,1,2,3,5,8,13,21,34,55,89,…0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, \dots0,1,1,2,3,5,8,13,21,34,55,89,…
 */
