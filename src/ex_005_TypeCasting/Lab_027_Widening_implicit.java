package ex_005_TypeCasting;

public class Lab_027_Widening_implicit {
    public static void main(String[] args) {
        /*
        Widening- converting small data type to larger
        This type of casting is performed automatically by the Java compiler and is considered safe because there's no risk of data loss. •	This type of casting is performed automatically by the Java compiler and is considered safe because there's no risk of data loss.
         No need of explicit widening as per the above point
         */
int age=15;
long agel= age;
double d1=age;
float ageinpoint=age;
        System.out.println("Long value "+agel);
        System.out.println("Double value "+agel);
        System.out.println("Float value "+ageinpoint);
    }
}
