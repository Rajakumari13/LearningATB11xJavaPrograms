package ex_027_Static;

public class Lab_164_Static_IIB {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        A a3=new A();
        A a4=new A();
//Static block -1
        //IIB1,2,33 times, DC-3 times
    }
}

class A{
    A(){
        System.out.println("DC"); //Called post Static and IIB
    }
    static{ //executes 1st
        System.out.println("Static");
        System.out.println("Once class created, static will be executed when the class called during obj creation");
    }
    {
        System.out.println("IIB1");
    }
    {
        System.out.println("IIB2");
    }
    {
        System.out.println("IIB3");
    }
}