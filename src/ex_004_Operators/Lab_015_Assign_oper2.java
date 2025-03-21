package ex_004_Operators;

public class Lab_015_Assign_oper2 {
    public static void main(String[] args) {
        //use art operators
        int a=6;
        System.out.println(a+=5);
        System.out.println(a-=5);
        System.out.println(a*=5);
        System.out.println(a/=5);
        System.out.println(a%=5);
        System.out.println(a);
        System.out.println(a&=5); //1&5->0001 AND 0101=1
    }
}
