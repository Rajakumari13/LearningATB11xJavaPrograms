package ex_009_Switch_statement;

public class Lab_061_JDKabove13_feature2 {
    public static void main(String[] args) {
        int item=2; //2 or 002 are same
        switch(item)
        {
            case 001,003,004,005:
                System.out.println("Mentioned items are electronic gadget");
                break;
            case 002,006:
                System.out.println("Mentioned items are toys");
                break;
            default:
                System.out.println("Unable to find the item category");
        }
    }
}
