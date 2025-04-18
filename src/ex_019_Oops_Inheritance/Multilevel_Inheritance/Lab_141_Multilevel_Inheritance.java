package ex_019_Oops_Inheritance.Multilevel_Inheritance;

public class Lab_141_Multilevel_Inheritance {
    public static void main(String[] args) {
      //inheritance attributes
       Grandfather gf1=new Grandfather();
     //  short gold= gf1.gf_gold_in_kg;
        System.out.println( gf1.gf_gold_in_kg);
        gf1.gf();
        gf1.home();
        System.out.println("------------------------");

        Father f1=new Father();
        System.out.println(f1.f_gold_in_kg);
        f1.f();//used attribute
        f1.home(); //used method
        f1.gf(); //used GF's method
        System.out.println("------------------------");


        Son s1=new Son();
        s1.s();
        s1.home(); //Son doesn't have home and inherits from father
        s1.gf();
        s1.f();
        System.out.println("------------------------");

    }
}
