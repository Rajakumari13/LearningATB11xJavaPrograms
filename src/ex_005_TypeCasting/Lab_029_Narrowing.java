package ex_005_TypeCasting;

public class Lab_029_Narrowing {
    public static void main(String[] args) {
        //converting large data type to small data type
        long mobile_no=9655068316l;
       // byte b= mobile_no; Error: java: incompatible types: possible lossy conversion from long to byte. Thus implicit narrowing is not possible
        byte b= (byte)mobile_no; //explicit narrowing
        System.out.println(b);
char ch= (char)mobile_no;
        System.out.println(ch);
      //  String str=(String)mobile_no; //error-java: incompatible types: long cannot be converted to java.lang.String. integer data type cannot be converted to
       // System.out.println(str);

    }
}
