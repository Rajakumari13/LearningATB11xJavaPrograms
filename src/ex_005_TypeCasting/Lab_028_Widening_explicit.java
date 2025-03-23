package ex_005_TypeCasting;

public class Lab_028_Widening_explicit {
    public static void main(String[] args) {
        //There is no need as compiler automatically converts
        int a=15;
        float f1= (float)a;
        long l1= (long)a;
        System.out.println("Float value "+f1);
        System.out.println("long value "+l1);

    }

}
