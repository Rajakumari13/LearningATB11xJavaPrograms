package ex_024_Abstraction_Interface;

public class Lab_161_Interface_Abstraction {
    public static void main(String[] args) {
        concrete_class c1=new concrete_class();
        c1.display1();
        c1.display2();
        c1.display3();
        c1.display5();

    }
}

class concrete_class extends incomplete_abstract implements incomplete_interface{

    @Override
    void display1() {
        System.out.println("Abstract incomplete class overridden");
    }

    @Override
    void display2() {
        super.display2();
    }

    @Override
    public void display3() {
        System.out.println("interface o/p3");
    }

    @Override
    public void display5() {
        incomplete_interface.super.display5();
        System.out.println("interface o/p5");

    }
}
interface incomplete_interface{
    int a=15;
    void display3();
    static void display4(){
        System.out.println("Static display allowed");
    }
    default void display5(){
        System.out.println("Default display allowed");
    }
}


abstract class incomplete_abstract{
    int a=10;
    abstract <a> void display1();
    void display2(){
        System.out.println("Display 2");
    }
}