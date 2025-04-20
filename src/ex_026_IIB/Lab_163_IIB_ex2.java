package ex_026_IIB;

public class Lab_163_IIB_ex2 {
    public static void main(String[] args) {
        A1 a1=new A1();

    }
}

class A1{
    A1(){
        System.out.println("Dc"); //post IIB4 DC will be printed once obj is created
    }
    {
        System.out.println("Execute IIB1");
    }
    {
        System.out.println("Execute IIB2");
    }
    {
        System.out.println("Execute IIB3");
    }
    {
        System.out.println("Execute IIB4");
    }
}
