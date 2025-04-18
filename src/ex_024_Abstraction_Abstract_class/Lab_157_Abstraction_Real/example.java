package ex_024_Abstraction_Abstract_class.Lab_157_Abstraction_Real;

public class example {
    public static void main(String[] args) {
Person p1=new Person();
p1.mailing();
        System.out.println(p1.Name);
Employee e1=new Employee("Raji", "abc", 96556) {
    @Override
    double compute_pay() {
        return 0;
    }
};
        System.out.println(e1.Name);
    }
}
abstract class Employee
{
    public String Name;
    private String address;
    private int Mobile_num;


    //DC
    Employee()
    {
        System.out.println("DC_Employee Logged in");
    }
    //PC
    Employee(String Name, String address, int mobile_num)
    {
        System.out.println("PC-Employee entered the details");
        this.Name=Name;
        this.address=address;
        this.Mobile_num=mobile_num;
    }
    abstract double compute_pay();
    void mailing(){
        System.out.println("The person "+Name+" from our company XYZ"+address+ "is mailing");
}
}

class Person extends Employee
{
    @Override
    double compute_pay() {
        return 0;
    }
}

