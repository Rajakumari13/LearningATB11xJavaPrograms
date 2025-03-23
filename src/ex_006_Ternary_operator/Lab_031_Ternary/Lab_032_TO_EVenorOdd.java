package ex_006_Ternary_operator.Lab_031_Ternary;

public class Lab_032_TO_EVenorOdd {
    public static void main(String[] args) {
     int Enter_Num= Integer.parseInt(args[0]);
String Findnum= (Enter_Num%2==0)?"Even":"Odd";
        System.out.println(Findnum);
    }
}

//Exception in thread "main" java.lang.NumberFormatException: For input string: "muthu"--> if iur input value is string