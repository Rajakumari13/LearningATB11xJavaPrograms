package ex_020_Oops_Polymorphism.Method_Overloading;

public class Lab_147_Real_Method_Overloading {
    public static void main(String[] args) {
        home h1=new home();
      h1.task(3);
      h1.task(5,8,6);
      h1.task(7,5);
//Siblings diff tasks
    }

}
class home
{
    void task(int a)
    {
        System.out.println(a);
    }
    void task(int a, int b)
    {
        System.out.println(a+b);
    }
    void task(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
}
