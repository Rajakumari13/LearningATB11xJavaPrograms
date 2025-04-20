package ex_027_Static;

public class Lab_166_Static_MandV {
    public static void main(String[] args) {
        Static_ex166.common_to_all();//class name.static method name ->Static block and static method will be called once class ref is called
       // System.out.println(Static_ex166.a); -> Not static variable
        System.out.println("-----------------------------");

        Static_ex166 s1=new Static_ex166();
        s1.display();
        System.out.println(s1.a);
    }
}
class Static_ex166{
    static{
        System.out.println("SIB-Static Initialization Block");
        System.out.println("SIB called 1st when the class is loaded");
    }
    int a=10;
    static int b=20; //static variable

    void display(){
        System.out.println(b);
        System.out.println("Non static Method");
    }
    static void common_to_all(){
     //   System.out.println(a); error: variable a should be static
        System.out.println("static method");
    }

    static class A{
        {
            System.out.println("IIB");
        }
    }
}