package ex_017_Oops_Class;

public class Lab_136_Class_with_4types {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.silence();
        System.out.println(p1.marriage_status());
        p1.person_details("Raji", 26, 45000, 9600098000l);
        int salary=p1.in_hand_salary(50000,5000);
        System.out.println(salary);
    }

    static class Person {
        String Name;
        int age;
        double salary;
        long mob_num;
        char initial;
        boolean is_married;

        //Without para & without return_type
        void silence() {
            System.out.println("The person is silent");
        }

        //Without para & with return type
        boolean marriage_status() {
            boolean is_married = true;
            return is_married;
        }
            //with para & without return type
            void person_details(String Name, int age, double salary, long mob_num)
            {
                System.out.println("Your name is "+Name +" age of "+age+" having salary of "+salary+" to be contact using mobile num "+mob_num);
            }
            //with para & with return type
         int in_hand_salary(int total_salary, int pf)
            {
                int remaining_salary;
                remaining_salary=total_salary-pf;
                return remaining_salary;
            }
        }

    }
