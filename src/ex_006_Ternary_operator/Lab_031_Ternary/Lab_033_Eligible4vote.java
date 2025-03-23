package ex_006_Ternary_operator.Lab_031_Ternary;

import java.util.Scanner;

public class Lab_033_Eligible4vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        String eligbility_check=age>18? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligbility_check);
        String catagory= (age<18)?"Minor": (age<65)?"Adult":"Senoir Citizen";
        System.out.println("Reason: "+ catagory);
    }
}
