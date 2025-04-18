package ex_019_Oops_Inheritance.Multiple_inheritance;

public class example_of_multiple_inh {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.tier);
        Tata t1=new Tata();
        t1.Drive();

    }
   static class Car
    {
        int tier=4;
        void Drive(){
            System.out.println("Drive a car");
        }
        void Clean(){}
    }
   static class Tata extends Car{}
    static class mahindra extends Car {}
    //class ToTravel extends Tata,Mahindra{} --> Not possible diamond problem
//Java does not support multiple inheritance of classes because it introduces complexity and ambiguity, particularly the "diamond problem".
}
