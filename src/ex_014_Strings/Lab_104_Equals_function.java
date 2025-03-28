package ex_014_Strings;

public class Lab_104_Equals_function {
    public static void main(String[] args) {
        String S1="Hello";
        String S2="Hello";
        String S3=new String ("Hello");
        System.out.println(S1==S2); //T
        System.out.println(S1==S3); //F
        System.out.println(S1.equals(S2)); //T
        System.out.println(S1.equals(S3)); //T
    }
}

//Equals compare the content and  ==checks location