package ex_017_Oops_Class;

public class Lab_131_Dog {
    public static void main(String[] args) {
        Dog d1 = new Dog(); //Ob 1
        Dog d2; //ob ref
        new Dog(); //ob 2

        d1.run();
        new Dog().run(); //ob 3
        System.out.println(new Dog().name); //ob 4. As we donot have value it is updated as null
        //No of objects
    }
}

    class Dog
    {
        String name;
        int age;
        int weight;

        void run()
        {
            System.out.println("running");
        }
    }

