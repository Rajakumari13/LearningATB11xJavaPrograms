package ex_030_Exception;

public class Lab_178_String_Nullpoint {
    public static void main(String[] args) {
        String name=null;
        name.trim(); //.NullPointerException.Cannot invoke "String.trim()" because "name" is null
    }
}
