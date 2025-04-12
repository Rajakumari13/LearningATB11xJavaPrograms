package ex_019_Inheritance.Multilevel_Inheritance;

public class Lab_142_Dynmaic_dispatch_Inheritance {
    public static void main(String[] args) {
        // Son s1=new Grandfather();
        // Son s1=new Father(); --> Both are not possible as method call is not made through a reference variable of a superclass.

        Grandfather gf=new Son();//Dynamic dispatch
        Grandfather gf1=new Father();
        Father f1=new Son();
        gf.home(); //father's home
        f1.gf();
        System.out.println(f1.gf_gold_in_kg);

    }
}

