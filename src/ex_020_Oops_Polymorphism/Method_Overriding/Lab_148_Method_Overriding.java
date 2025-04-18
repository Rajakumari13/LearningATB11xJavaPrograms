package ex_020_Oops_Polymorphism.Method_Overriding;

public class Lab_148_Method_Overriding {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();

        dog d1=new dog();
      d1.sound();

    }
}

class Animal {
    void sound() {
        System.out.println("Capture animal sound");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
//same method name and doff behavior