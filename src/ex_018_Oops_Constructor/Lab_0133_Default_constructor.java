package ex_018_Oops_Constructor;

public class Lab_0133_Default_constructor {
    public static void main(String[] args) {
        System.out.println("Hello");
        Baby b1 = new Baby(); //Obj 1
        new Baby(); //Obj 2


    }
}
    class Baby
    {
        //Attribute
        String name;
        int age;
        int eyes;

        //behavior or method
        void cry()
        {
            System.out.println("Baby is crying");
        }
        void sleep()
        {
            System.out.println("Baby is sleeping");
        }
        void drink() {
            System.out.println("Baby is drinking");
        }
        Baby()
        {
            System.out.println("Default constructor automatically calls by jvm when obj is created");
        }
    }




