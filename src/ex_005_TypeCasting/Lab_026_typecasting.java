package ex_005_TypeCasting;

import org.w3c.dom.ls.LSOutput;

public class Lab_026_typecasting {
 //converting 1 data type to another data type
        public static void main(String[] args) {
            byte b=5;
            int a= b; //datatype converted into byte to int. No loss in this which is called implicit type casting
            byte b1=3;
            int a1=(int)b1; //explicit typecasting
            System.out.println(a);
            System.out.println(a1);
        }
  }
