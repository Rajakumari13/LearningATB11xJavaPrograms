package Wrapper;

public class Lab_171_Primitive_Wrapper {
    public static void main(String[] args) {
        int a=5; //Primitive dt
        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float
        Integer age=15;  //2147483647
        Integer age1=18;
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.valueOf(age));
        System.out.println(Integer.toString(age));
        System.out.println(Integer.compare(age,age1));
        System.out.println(Integer.min(age,age1));
        System.out.println(Integer.max(age,age1));

    }

}
