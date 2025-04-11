package ex_018_Oops_Constructor;

public class Lab_136_Dc_RealEx_car {
    public static void main(String[] args) {
Car c1=new Car();
Car c2=new Car();
        System.out.println(c1.Name);
        System.out.println(c2.Name);
        Car c3=new Car("Mahindra", 1998, "XUV 400");
        System.out.println(c3.Name);
    }
}
class Car
{
    String Name;
    int year;
    String model;
Car() //default constructor
{
    Name="Unknown";
    year=1998;
    model="unknown_model";

}
//Para Constructor
    Car(String Name_oc_arg, int year_oc_arg, String model_oc_arg)
    {
this.Name=Name_oc_arg;
this.year=year_oc_arg;
this.model=model_oc_arg;
    }
}

//this keyword basically refers to the current object & used to use the variables from class