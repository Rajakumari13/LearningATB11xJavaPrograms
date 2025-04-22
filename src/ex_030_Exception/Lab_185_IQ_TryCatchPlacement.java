package ex_030_Exception;

public class Lab_185_IQ_TryCatchPlacement {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            b = 10 / a; // Vulnerable Code that should be try and catch!
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
