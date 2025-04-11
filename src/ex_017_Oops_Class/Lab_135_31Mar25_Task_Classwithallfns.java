package ex_017_Oops_Class;

public class Lab_135_31Mar25_Task_Classwithallfns {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Raji";
        //wop_wr(); or
        String greetings=wop_wr();
        System.out.println(greetings);

        int return_wpwr=wp_wr(15,2);
        System.out.println(return_wpwr);

        //wp_wor
        wp_wor("Raji",26);


    }
    static class Person {
        String name;
    }

    void wop_wor(){
        System.out.println("No parameter and no return type");
    }

    static String wop_wr(){
        String greetings="Hi";
        System.out.println("Without Parameter and with return type");
        return greetings;
    }

    static int wp_wr(int a, int b)
    {

        return(a*b);

    }

    static void wp_wor(String name,int age)
    {
        System.out.println("Your name is "+name+" and age is "+age);
    }

}
