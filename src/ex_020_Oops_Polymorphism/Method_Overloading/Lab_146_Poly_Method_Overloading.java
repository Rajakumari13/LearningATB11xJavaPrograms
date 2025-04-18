package ex_020_Oops_Polymorphism.Method_Overloading;

public class Lab_146_Poly_Method_Overloading {
    public static void main(String[] args) {
        MathOperation m1=new MathOperation();
        int r1= m1.add(5,7);
        System.out.println(r1);
        int r2= m1.add(9,3,48, 14);
        System.out.println(r2);

        float r3= m1.add(1.2f,3.5f,7.1f);
        System.out.println(r2);

        String r4= m1.add("Raja", "kumari", " J");
        System.out.println(r4);

        char r5= m1.add('A','B');
        System.out.println(r5);
    }
}

class MathOperation{
    //  // In the same class, When you have a method wit same name but different arguments and different return type.
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public float add(float a, float b, float c){
        return a+b+c;
    }
    public String add(String a, String b, String c){
        return a+b+c;
    }
    public char add(char a, char b){
        return (char) (a+b);
    }
}
