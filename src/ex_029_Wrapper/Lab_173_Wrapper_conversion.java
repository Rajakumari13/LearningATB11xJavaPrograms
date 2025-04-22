package ex_029_Wrapper;

public class Lab_173_Wrapper_conversion {
    public static void main(String[] args) {
        int a=15;
      //  int c=1;
        Integer b=a; //This is Boxing-> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing
        System.out.println(b.MIN_VALUE);
      //  System.out.println(c.MIN_VALUE); //java: int cannot be dereferenced
        System.out.println(b.intValue());

        Integer a2=45;
        int b2=a2; // // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(b2);
    }
}
