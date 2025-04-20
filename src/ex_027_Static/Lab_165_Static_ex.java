package ex_027_Static;

public class Lab_165_Static_ex {
    public static void main(String[] args) {
        S ref1=new S(10);
        ref1.displayValue();

        System.out.println(ref1.b);
        System.out.println(S.b);
        S.b=45;
        System.out.println("----------------");

        S ref2=new S(20);
        ref2.displayValue();
        // System.out.println(ref2.b);
        System.out.println(S.b); //Static value changes to 45 only if we changes. Otherwise it is in static
        System.out.println("----------------");


        S ref3=new S(30);
        ref3.displayValue(); //30
       // System.out.println(ref3.a); //same 30
        System.out.println(S.b); //45
    }
}

class S{
    int a; // non static -> instance variable / properties/ attribute / fields
    static int b=20;

    S(int a)
    {
        this.a=a;
    }
    void displayValue()
    {
        System.out.println(this.a);
    }
}
