package ex_007_Increment_dec_operators;

public class Lab_040_Preandpostdec_oper {
    public static void main(String[] args) {
        int a=15;
        int b=--a;
        int c=b--;
        System.out.println(a); //14
        System.out.println(b); //13
        System.out.println(c);//14
    }
}
