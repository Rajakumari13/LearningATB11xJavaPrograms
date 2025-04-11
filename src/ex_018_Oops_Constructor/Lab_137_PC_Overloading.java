package ex_018_Oops_Constructor;

public class Lab_137_PC_Overloading {
    public static void main(String[] args) {
        Person p1 = new Person("Raji", 9854564, "abc");
        System.out.println(p1.name);
        Person p2= new Person("Selva", 9655516, "xyz");
        System.out.println(p2.name);
        Person p3=new Person("Rudra","abc");
        Person p4=new Person("Adhi","abc");
        System.out.println(p3.name);
        System.out.println(p4.name);

        p1.eat();
        p3.eat();

    }

   static class Person {
        String name;
        long phone;
        String address;

        Person(String name_arg, long phone_num_arg, String address_arg) {
            this.name = name_arg;
            this.phone = phone_num_arg;
            this.address = address_arg;
        }
        Person(String name_arg, String add_arg)
        {
            this.name=name_arg;
            this.address=add_arg;
        }
        void eat() //method
        {
            System.out.println(this.name + " is eating!");
        }

    }
}