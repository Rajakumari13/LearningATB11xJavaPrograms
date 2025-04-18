package ex_023_Super_Keyword;

public class Lab_154_Superkeyword_ex2 {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound(); //from super class  Animal sound,  God
        System.out.println(a.color); //white
        System.out.println("------------------------");

        Dog d=new Dog();
        d.display(); //Gray, white, Animal sound, God

    }
}
class God
{
    void sound()
    {
        System.out.println("God");
    }
}
class Animal extends God{
    protected String color="white";

    @Override
    void sound() {
        System.out.println("Animal sound");
        super.sound();//Provide the current class output then base class input
    }
}
class Dog extends Animal {
    private String color = "Gray";

    Dog() {

    }

    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}