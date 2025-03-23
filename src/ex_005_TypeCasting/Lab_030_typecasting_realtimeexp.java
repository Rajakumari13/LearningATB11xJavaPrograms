package ex_005_TypeCasting;

public class Lab_030_typecasting_realtimeexp {
    public static void main(String[] args) {
        short course_amount=9999;
        float GST=100.56f;
        float total_amount=course_amount +GST; //implicit widening
        System.out.println(total_amount);
        float total_amount1=(float)course_amount +GST; //Explicit widening
        System.out.println(total_amount1);
        /*short total_amount2=GST +course_amount;
        System.out.println(total_amount2);
       Error: java: incompatible types: possible lossy conversion from int to short--->: Implicit narrowing not possible
*/
//short total_amount2=(short)GST + course_amount; // java: incompatible types: possible lossy conversion from int to short as course amount is too long
        short total_amount2=(short)GST ;
        System.out.println(total_amount2+ course_amount);
    }
}

