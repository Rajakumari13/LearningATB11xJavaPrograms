package ex_004_Operators;

public class Lab_021_Concatination2 {
    public static void main(String[] args) {
int a=10;
int b=5;
boolean c=true;
String name1="Selva";
String name2="Raji";
        //Note: Cannot concatinate diff two type of data. But based on the 1st type data will be executed
        System.out.println(a+b+name1+name2);
        System.out.println(name1+name2+a+b);
        System.out.println(c+name1+name2);
       /* System.out.println(c+a+b);
  O/P--> java: bad operand types for binary operator '+'
  first type:  boolean
  second type: int

        */
    }
}
