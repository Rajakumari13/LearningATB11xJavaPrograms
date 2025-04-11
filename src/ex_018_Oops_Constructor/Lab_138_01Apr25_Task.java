package ex_018_Oops_Constructor;

public class Lab_138_01Apr25_Task {
    public static void main(String[] args) {
        Person p1_def=new Person();
      //  System.out.println(p1_def.name);

        Person p1_pc=new Person("Raji","xyz",25,96000000,false);
        p1_pc.print_details();
        p1_pc.home_work();
        Person p2_pc=new Person("Rudra", "abc", 6, 9800000, true );
        p2_pc.print_details();
        p2_pc.eat();
        p2_pc.sleep();
        p2_pc.walk();
        p2_pc.home_work();
    }
    static class Person {
        String name;
        String address;
        int age;
        long phone_num;
        boolean is_male;

        //name, age, address, phone, isMale.

        //DC-Default constructor
        Person() {
            name = "unknown";
            address = "Not found";
            age = 0;
            phone_num = 911111111;
            is_male = true;
        }

        //PC
        Person(String name_arg, String address_arg, int age_arg, long phone_num_arg, boolean is_male)
        {
        this.name = name_arg;
        this.address = address_arg;
        this.age = age_arg;
        this.phone_num = phone_num_arg;
        this.is_male = is_male;
    }
    void eat()
    {
        System.out.println(this.name+" is eating");
    }
    void sleep()
    {
        System.out.println(this.name+" is sleeping");
    }
    void walk()
    {
        System.out.println(this.name+ " is walking");
    }
    void home_work()
    {
        System.out.println(this.name+ " is doing homework");
    }
    void print_details()
    {
        System.out.println("Your name is "+this.name+" from "+this.address+" whose mobile number is "+this.phone_num+ " and age is "+this.age+ " and your gender status as male is "+this.is_male);
        System.out.println("-------------");

    }

}
        //eat, sleep, walk, doHome, printDetails()-print the details of the all the fields.
    }

