package ex_030_Exception;

public class Lab_176_Exception_explanation {
    public static void main(String[] args) {
        System.out.println("Start of program");
        String user_name=args[0]; //ArrayIndexOutOfBoundsException
        int age=Integer.parseInt(user_name);  // java.lang.NumberFormatException: For input string
        int output=age/0; // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of program");
    }
}
// divide by zero -> ?

// java.lang.ArithmeticException: / by zero when args -> 0
// java.lang.NumberFormatException: For input string: "pramod"
// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds