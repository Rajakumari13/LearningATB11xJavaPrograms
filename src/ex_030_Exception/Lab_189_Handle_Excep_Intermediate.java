package ex_030_Exception;

public class Lab_189_Handle_Excep_Intermediate {
    public static void main(String[] args) {
        try {
            String name=args[0]; //java.lang.ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(name); // NumberFormatException
            int b=100/a;// ArithmeticException
            System.out.println(b);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
