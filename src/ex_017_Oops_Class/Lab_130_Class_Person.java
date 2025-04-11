package ex_017_Oops_Class;

public class Lab_130_Class_Person {
    public static void main(String[] args) {

        //Calling methods to create objects
        Person p1=new Person();
        /*
        Person- Class
        p1- Object reference
        new person()-> Object creation/object
         */
        p1.name="Raji";
        System.out.println("The entered name is"+p1);

        //Object creation without reference
       new Person().name="Rudra";

    }
}
   class Person{
        //attributes
        String name;
        short age;
        double mobile_number;
        float weight;
        int height;
        boolean is_male;
        float tax;

//behavior/function/method
       void speak(){
           System.out.println("I'm speaking to team");
       }
       String greet(String name){
           return  "hello"+name;
       }
       void sleep(){
           System.out.println("I'm sleeping");
       }
       int inhand_salary(int salary, int tax)
       {
           return salary-tax;
       }

   }


