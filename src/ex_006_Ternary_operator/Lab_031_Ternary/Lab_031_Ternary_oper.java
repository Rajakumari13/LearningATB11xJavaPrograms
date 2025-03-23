package ex_006_Ternary_operator.Lab_031_Ternary;

public class Lab_031_Ternary_oper {
    //if else statement updated in single line
    //expression ? result 1: result 2;
    public static void main(String[] args) {
        int a=15;
        String compare=a<10 && a<100 ? "A is in single digit" : "A is in double digit";
        System.out.println(compare);
    }
}
