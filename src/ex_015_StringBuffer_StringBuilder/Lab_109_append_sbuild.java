package ex_015_StringBuffer_StringBuilder;

public class Lab_109_append_sbuild {
    public static void main(String[] args) {
        StringBuilder message=new StringBuilder("Hello");
        message.append(" world");
       // StringBuilder add= message.append(" World"); //add variable name conversion is not neccessary
       // System.out.println(add); -->O/P- Hello world
        System.out.println(message);
    }
}
