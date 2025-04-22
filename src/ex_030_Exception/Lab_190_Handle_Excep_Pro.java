package ex_030_Exception;

public class Lab_190_Handle_Excep_Pro {
    public static void main(String[] args) {
        try{
            String name=args[0]; //java.lang.ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(name); // NumberFormatException
            int b=100/a;// ArithmeticException
            System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
