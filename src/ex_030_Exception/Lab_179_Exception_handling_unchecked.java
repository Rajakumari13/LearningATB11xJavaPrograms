package ex_030_Exception;

public class Lab_179_Exception_handling_unchecked {
    public static void main(String[] args) {
        int a=0;
        try {
            int b = 10 / a; //ArithmeticException
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}

//OUTPUT--> / by zero
//0