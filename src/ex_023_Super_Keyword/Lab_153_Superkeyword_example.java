package ex_023_Super_Keyword;

public class Lab_153_Superkeyword_example {
    public static void main(String[] args) {
        Car c=new Car();
        c.message(10);

        System.out.println("----------------");
        Mahindra m=new Mahindra();
        m.display();
    }
}

class Car{
    public int max_speed=150;

    Car(){
        System.out.println("DC");
    }
    Car(int a){
        System.out.println("PC");
    }
    void message(){
        System.out.println("No return type in this method");
    }
    void message(int a){
        System.out.println("PC-Argument value "+a);
    }
    void display()
    {
        System.out.println("Car is a parent");
    }

}

class Mahindra extends Car{
    private int max_speed=180;
    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
Mahindra(){
        super(); //DC
}

Mahindra(int a){
        super(); //PC construction of parent
    }

    @Override
    void display(){
        System.out.println(this.max_speed); //180
        System.out.println("----------------------");

        //
        System.out.println(super.max_speed); //150
        super.message(); //No return type in this method
        super.message(10); //PC-Argument value 10
        System.out.println("Override"); //Override
    }

}