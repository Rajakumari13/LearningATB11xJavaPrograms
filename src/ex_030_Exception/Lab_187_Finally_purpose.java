package ex_030_Exception;

import java.util.Scanner;

public class Lab_187_Finally_purpose {
    public static void main(String[] args) {
        Scanner sc=null;
        sc=new Scanner(System.in);
        int v=sc.nextInt();
        try{
            int a=10/v;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("End of program. Sc is closed");
        }
    }
}
