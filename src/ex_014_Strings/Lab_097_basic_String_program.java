package ex_014_Strings;

public class Lab_097_basic_String_program {
    public static void main(String[] args) {
        //String-> Sequence of character. 2 ways of calling
        String name="Raji Jeyaram";  //Direct calling stored in SCP-STRING CONSTANT POOL
        String name1=new String("Raji Selva"); //using new methid stored in OBJECT AREA
        System.out.println(name);
        System.out.println(name1);
    }
}
