package ex_027_Static;

public class Lab_168_Static_AT {
    public static void main(String[] args) {
        Testcase t1=new Testcase();
        System.out.println(t1.driver);

        Testcase t2=new Testcase();
        System.out.println(t2.driver);

        Testcase t3=new Testcase();
        System.out.println(t3.driver);
        System.out.println(Testcase.driver); //also possible

    }
}
class Testcase{
    static String driver="Chrome";
}