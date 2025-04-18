package ex_019_Oops_Inheritance.Hierarchial_inheritance;

public class Lab_143_Hierarchial_inh_ex {
    public static void main(String[] args) {
        father f1=new father();
        f1.home();
       // System.out.println(f1.gold_son); -> Not possible as father cannot access son's property
        System.out.println("---------------");
        Manikandan mk=new Manikandan();
        mk.home(); //calls father's home as home method not found
        System.out.println("Manikandan access the property"+ mk.gold_in_grams);
        System.out.println("---------------");
        Muthuselvam MS=new Muthuselvam();
        MS.home();
        System.out.println("Muthuselvam access the property"+ MS.gold_in_grams);
        System.out.println("---------------");
        Suresh S=new Suresh();
        System.out.println("Suresh access the property"+ S.gold_in_grams);
        S.home();
    }
    static class father
    {
        int gold_in_grams=1000;
        void home(){
            System.out.println("Father has 3 bhk home");
        }
    }
    static class Manikandan extends father
    {
        int gold_son=2000;
       /* void home()
        {
            System.out.println("S1 has 2 bhk home");
        } */
    }
    static class Muthuselvam extends father
    {
        void home()
        {
            System.out.println("S2 has 2 bhk home");
        }
    }
    static  class Suresh extends father
    {
        void home()
        {
            System.out.println("S3 has 2 bhk home");
        }
    }

}
