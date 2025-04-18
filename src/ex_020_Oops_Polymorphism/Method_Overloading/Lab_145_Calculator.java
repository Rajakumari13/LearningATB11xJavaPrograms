package ex_020_Oops_Polymorphism.Method_Overloading;

public class Lab_145_Calculator {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(4,5,8));
        System.out.println(c1.add(3.56,8.45));
//Method overloading- Same function name- ADD but diff behavior sum of int and double
    }
}
class Calculator {
    //PC
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;

    }
}