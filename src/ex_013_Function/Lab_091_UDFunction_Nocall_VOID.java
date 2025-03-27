package ex_013_Function;

public class Lab_091_UDFunction_Nocall_VOID {
    public static void main(String[] args) {
        //Step 2-> calling
        f1();
        name_of_function();
    }    //step 1-> Declaration
            static void f1()  //void cannot retur anything
        {
            System.out.println("Hi");
        }

static void name_of_function()
    {
        System.out.println("Print this");
        System.out.println("Print this too");
    }
}
