package ex_028_Enum;

public class Lab_169_enum_ex1 {
    public static void main(String[] args) {
        //  A day=new A();
        //  System.out.println(day.days[2]); -->Op: Wed
        System.out.println(Days.WEDNESDAY);
        System.out.println(Project_URLs.VWO);
    }
}
/*class A{

    String days[]={"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
}

 */

enum Days //enum used to store/use the constant the values
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Project_URLs{
    Google, Quiklyz, VWO

    }

