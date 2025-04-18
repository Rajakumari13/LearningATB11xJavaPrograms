package ex_024_Abstraction_Interface;

public class Lab_157_Interface_ex {
    public static void main(String[] args) {
        Square s1=new Square();
        s1.getArea(5,4);

        Rectangle r1=new Rectangle();
        r1.getArea(5,4);

    }
}

class Square implements Area{

    @Override
    public void getArea(int area, int breath) {
        System.out.println(area*area);
    }
}
class Rectangle implements Area{
    @Override
    public void getArea(int area, int breath) {
        System.out.println(2*area*breath);
    }
}

interface Area{
 void getArea(int area,int breath);
}
