package ex_031_Generics;

public class Lab_197_No_Generics {
    //If Generic not used
    public static void main(String[] args) {
        System.out.println(sum(8,5));
        System.out.println(sum("Raja","kumari"));
        System.out.println(sum(25.89,45.189));


    }
    static int sum(int a, int b){
        return  a+b;
    }
    static String sum(String a, String b){
        return  a+b;
    }
    static double sum(double a, double b){
        return  a+b;
    }
}
