package ex_025_Abstraction_Interface;

public class Lab_159_Interface_Multiple_Inheritance {
    public static void main(String[] args) {
Son s1=new Son();
s1.money();
    }
}
interface Father{
    void money();
}

interface Mother{
    void money();
}

class Son implements Father, Mother{
    @Override
    public void money() {
        System.out.println("Son inherits the money");
    }
}