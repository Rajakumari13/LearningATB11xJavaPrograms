package ex_019_Inheritance.single_inheritance;

public class Lab_139_Single_Inheritance {
    public static void main(String[] args) {
        Father f1=new Father();
        short gold= f1.gold_kg;
        System.out.println(gold);
      f1.bhk2();
      //f1.bhk3(); -> Will show error as cannot find the method as bhk3 is son's one
        System.out.println("---------------------");

        Son s1=new Son();
        // s1.gold_kg; error without extends and used parent attribute--> Cannot find declaration to go to

        System.out.println(s1.gold_kg);
        s1.bhk3();
        s1.bhk2(); //son can inherit father's property

    }
   static class Father{
        short gold_kg=1; //Attribute | Data variables |  Property | Instance Variables
        void bhk2(){ //  Behaviour |  Method | Function | Data members
            System.out.println("Father has 2bhk");
        }

    }
   static class Son extends Father{
        void bhk3()
        {
            System.out.println("Son has 3bhk");
        }
    }
}
