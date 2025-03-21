package ex_004_Operators;

public class Lab_017_Assign_logical_oper {
    public static void main(String[] args) {
       int a=7;
       int b=8;

        System.out.println(a>15 && b<10); //false AND true --> False
        System.out.println(a>5 && b<10);
        System.out.println(a>15 || b<10); //false OR true --> true
        System.out.println(a>5 || b<10);
        System.out.println(!(a<b));
//AND provide output as True onlyt all conditions are true
//Output always Boolean
        a +=7;
        System.out.println(a); //a=14
        System.out.println(!(a<b));
    }
}
