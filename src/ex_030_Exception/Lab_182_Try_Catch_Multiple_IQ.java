package ex_030_Exception;

public class Lab_182_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;
        }

        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("1st Catch");
        }
        //  // Not possible as Big Exception is used before
    /*    catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("2nd Catch");

        } */
        System.out.println("2");
    }
}


