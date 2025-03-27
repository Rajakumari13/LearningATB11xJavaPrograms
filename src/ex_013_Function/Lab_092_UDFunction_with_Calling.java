package ex_013_Function;

public class Lab_092_UDFunction_with_Calling {
    public static void main(String[] args) {
      //  Raji_f1(); --> Cannot call. WIll only print the below mentioned content
        int num=MN_2_call_int(); //This is called calling
        float fnum=MN_2_call_float();
        byte by=MN_2_call_byte();
        char letter=MN_2_call_char();
        String name=MN_2_call_String();
        System.out.println(num);
        System.out.println(by);
        System.out.println(fnum);
        System.out.println(letter);
        System.out.println(name);

    }
    //Declaration
    static void Raji_f1()
    {
        System.out.println("No calling");
    }
    static int MN_2_call_int()
    {
        return 150;
    }
    static float MN_2_call_float()
    {
        return 5.67f;
    }
    static byte MN_2_call_byte()
    {
        return 18;
    }
    static char MN_2_call_char()
    {
        return 'A';
    }
    static String MN_2_call_String()
    {
        return "Raji";
    }
}
