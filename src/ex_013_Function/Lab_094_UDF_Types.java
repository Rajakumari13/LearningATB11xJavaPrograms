package ex_013_Function;

public class Lab_094_UDF_Types {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type PARAMETERS-> INPUT TO THE FUNCTION
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        wop_wor();
        //  2. Without Parameters but With Return Type
        String Greetings=wop_wr();
        System.out.println(Greetings);

        //  3. With Parameters and Without Return Type ( 90%) //just using and printing. No return or opertaion
        wp_wor("Raji",26);
        wp_wor("Selva",27);

        //  4. With Parameters and With Return Type
        int result=wp_wr(2,5);
        System.out.println(result);

    }

    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wop_wor()
    {
        System.out.println("Hi, there is no return");
    }

    //  2. Without Parameters but With Return Type
        static String wop_wr() //No input
        {
            System.out.println("Hi");
                    return("Welcome to AT Blueprint batch 11x");
        }

    //  3. With Parameters and Without Return Type ( 90%)
    static void wp_wor(String Name, int Age)
    {
        System.out.println("Your name is "+ Name+ "\n and your age is "+ Age);
    }

    //  4. With Parameters and With Return Type
    static int wp_wr(int a, int b)
    {
       return a+b;
    }

}
