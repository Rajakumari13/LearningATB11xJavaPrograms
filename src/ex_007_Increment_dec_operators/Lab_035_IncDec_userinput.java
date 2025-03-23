package ex_007_Increment_dec_operators;

public class Lab_035_IncDec_userinput {
    public static void main(String[] args) {
        String age_string = args[0];
       // String a4 = args[4]; // java.lang.ArrayIndexOutOfBoundsException
        int age = Integer.parseInt(age_string);
        System.out.println(age);    }
}
