package ex_030_Exception;

public class Lab_184_Multi_exception_IQ {
    public static void main(String[] args) {
        try {
            String name = args[0]; //ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(name); // // java.lang.NumberFormatException: For input string
            int output = 100 / a;
        } catch (ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException  e) {
            System.out.println(e.getMessage());
        }
    }
}
