package ex_030_Exception;

public class Lab_191_FinalvSFinally {
    public static void main(String[] args) {
        final double pi=3.14;
        int a=0;
        try{
        int b=110/a;
        System.out.println(b);
    }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("ANyhow this will print at the end ");
        }
    }
}
