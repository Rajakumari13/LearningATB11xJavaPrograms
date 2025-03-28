package ex_014_Strings;

public class Lab_103_Equals {
    public static void main(String[] args) {
        //checks equal operator. =assign the value
        String s1="Hello";
        String s4="Hello";
        String s7="hello";

        String s2=new String("Hello");
        String s3=new String("hello");
        String s5=new String("Hello");
        String s6=new String("Hello");

        System.out.println(s1==s4); //same location -> T
        System.out.println(s1==s5); // diff location -> F
        System.out.println(s2==s6); //diff location -> F
        System.out.println(s4==s7); //diff location -> T

        System.out.println(s1.equals(s4)); //same location -> T
        System.out.println(s4.equals(s5)); // diff location -> Checked the content only -> T
        System.out.println(s2.equals(s3)); //diff location -> Checked the content only -> F
        System.out.println(s2.equalsIgnoreCase(s3)); //diff location -> Ignored cases -> T
    }
}


// == -> Comparsion -> String -> this check the locations ref.
// equals ( content) -> value
//  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
//  == - check for the ref
// = assignment the value
