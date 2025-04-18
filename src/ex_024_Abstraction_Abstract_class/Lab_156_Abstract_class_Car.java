package ex_024_Abstraction_Abstract_class;

public class Lab_156_Abstract_class_Car {
    public static void main(String[] args) {
        Tiago t1=new Tiago();
        t1.StartEngine();
        t1.StopEngine(); //Extends the abstract method
        t1.drive();
        t1.normal();
    }
}

abstract class Car{
    abstract void StartEngine();
    abstract void StopEngine();

    void normal()
    {
        System.out.println("Start and stop the engine are normal");
    }
}
class Tiago extends Car{
    @Override
    void StartEngine() {
        System.out.println("Start the engine");
    }

    @Override
    void StopEngine() {
        System.out.println("Stop the engine");
    }
    void drive()
    {
        System.out.println("Let's drive and go");
    }
}