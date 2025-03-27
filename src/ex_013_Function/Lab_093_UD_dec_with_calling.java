package ex_013_Function;

public class Lab_093_UD_dec_with_calling {
    public static void main(String[] args) {
        //Calling
       int r1=sum_of_num(48,56); //using function for sepcific task
        int r2=mul_of_num(15, 6);
        System.out.println("Sum of 2 numbers returned are "+r1);
        System.out.println("Mul of 2 numbers returned are "+r2);
    }
    //declaration
    static int sum_of_num(int a, int b)
    {
        return a+b;
    }
    static int mul_of_num(int a, int b)
    {
        return a*b;
    }
}
