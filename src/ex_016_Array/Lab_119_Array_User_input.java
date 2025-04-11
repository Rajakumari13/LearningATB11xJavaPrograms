package ex_016_Array;

import java.util.Scanner;


public class Lab_119_Array_User_input {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks to display");
        int marks= scanner.nextInt();

         int[] numbers_marks =  new int[marks];
        // float[] numbers_marks =  new float[size];
        //String[] numbers_marks =  new String[size];

        for(int i=0;i<numbers_marks.length;i++)
        {
            System.out.println("Enter the numbers");
            numbers_marks[i]=scanner.nextInt(); //IMPORTANT
            // numbers_marks[i] = sc.next(); //String
        }
        System.out.println("-------------");
        for(int i=0;i<numbers_marks.length;i++)
        {
            System.out.println("The mark is "+numbers_marks[i]); //Print the values inside the array
        }
        scanner.close();
    }
}
