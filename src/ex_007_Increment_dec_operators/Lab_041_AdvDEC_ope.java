package ex_007_Increment_dec_operators;

public class Lab_041_AdvDEC_ope {
    public static void main(String[] args) {
        int a = 13;
        System.out.println(--a - a--);
        System.out.println(a);
    }
}
//A-> --a_> 12
//B-> a-- -> 12
//Line 6-> 12-12=0
//Line 7 -> 11