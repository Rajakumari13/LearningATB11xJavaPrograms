package ex_007_Increment_dec_operators;

public class Lab_039_AdvID1_Oper {
    public static void main(String[] args) {
        int a = 15;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 15 , a ->  16
        // +
        // ++a -> B -> ExpB -> 16 , a -> 17
        // A+B -> ExpA+ExpB -> 15+17 -> 32 , a -> 17


    }
}
