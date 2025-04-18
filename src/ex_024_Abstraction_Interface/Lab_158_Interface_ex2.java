package ex_024_Abstraction_Interface;

public class Lab_158_Interface_ex2 {
    public static void main(String[] args) {
Car c1=new Car();
c1.StartEngine();
c1.applyBreak();
c1.StopEngine();
c1.test();
    }
}

class Car implements Engine,Break{


    @Override
    public void StartEngine() {
        System.out.println("Start the engine");
    }
    @Override
    public void applyBreak() {
        System.out.println("Apply break");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop the engine");
    }

}

interface Engine
{
    void StartEngine();
    void StopEngine();
}

interface Break
{
    void applyBreak();
    default void test(){
        System.out.println("Testdrive the car");
    }
}