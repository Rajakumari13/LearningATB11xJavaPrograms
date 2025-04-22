package ex_030_Exception;

public class Lab_194_Throw {
    public static void main(String[] args) {

    }
    static void divideByZero(int a){
        if(a==0)
        {
           throw new ArithmeticException();
        }
    }
}
