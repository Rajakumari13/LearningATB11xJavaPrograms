package ex_030_Exception;

public class Lab_196_CustomMessageException {
    public static void main(String[] args) {
        Bank SBI=new Bank("INR", 15000);
        Bank HDFC=new Bank("INR", 3000);
        Bank jp_chase=new Bank("USD", 1520);
        //int total=SBI.add(HDFC);
       // System.out.println(total);
        int total= SBI.add(jp_chase);
        System.out.println(total);
    }


}
