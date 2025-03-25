package ex_009_Switch_statement;

public class Lab_060_JDKabove13_feature {
    public static void main(String[] args) {
        int item_code=001;
        switch (item_code) //variable name
        {
            //JDK above 18 applicable. Case value check
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("002");
            default -> System.out.println("End");
        }
//Note: There is no break required
    }
}
