package ex_012_Do_while;

public class Lab_087_simple_do_while {
    public static void main(String[] args) {
        //Do while runs at least 1 times even when condition is not satisfied
        int a=15; //Initialization
        do{
            System.out.println("This body executes atleast 1 time");
            System.out.println(a);
            a++;
        }
        while (a<10);
       // while (a>=10 && a<20);
        //System.out.println("Condition satisfies"+ a);

    }

}
