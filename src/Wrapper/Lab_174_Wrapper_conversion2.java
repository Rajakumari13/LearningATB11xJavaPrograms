package Wrapper;

public class Lab_174_Wrapper_conversion2 {
    public static void main(String[] args) {
        String num="112";
        int aaa=10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
       Integer a=Integer.parseInt(num);
        Integer b=Integer.valueOf(num);
        System.out.println(a.intValue()); //112

        // String to Primitive
        int aa = Integer.parseInt(num); //unboxing
      //  System.out.println(aa.intValue()); java: int cannot be dereferenced

        //wrapper to string
        System.out.println(a.toString()); //112

        //Primitive to STring
        int age=18;
        Integer age_wrapper=age; //boxing
        System.out.println(age_wrapper.intValue()); //18
        System.out.println(age_wrapper.toString()); //18
    }
    }

