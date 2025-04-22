package ex_031_Generics;

public class Lab_198_Generic_ex {
    public static void main(String[] args) {
        System.out.println(sum(8, 5));
        System.out.println(sum("Raja", "kumari"));
        System.out.println(sum(25.89, 45.189));
    }

    static <G> G sum(G a, G b)
    // G- can be anything.Common ref where we can choose our datatype
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}