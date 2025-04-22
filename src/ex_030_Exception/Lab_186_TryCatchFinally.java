package ex_030_Exception;

public class Lab_186_TryCatchFinally {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            int b1=10/2;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will be always executed!");

        }
    }
}
