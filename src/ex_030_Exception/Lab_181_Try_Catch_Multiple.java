package ex_030_Exception;

public class Lab_181_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("1st Catch");

        }
        //Once above is run this won't run.But multi.catches are available to write only if we place Exception e at the end
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("2nd Catch");
        }
        System.out.println("2");
    }
}

/*
1
 / by zero
1st Catch
2

 */