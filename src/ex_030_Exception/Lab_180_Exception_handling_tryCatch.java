package ex_030_Exception;

public class Lab_180_Exception_handling_tryCatch {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        //If you know which exception you re going to handle then no need of using exception inside bracket
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Correct the condition and try again");
        }
    }
}
