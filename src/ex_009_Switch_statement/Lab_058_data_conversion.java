package ex_009_Switch_statement;

public class Lab_058_data_conversion {
    public static void main(String[] args) {
        long l1=135l;
        switch ((int)l1)
        {
            case 135:
                System.out.println("Found the valid number");
                break;
            default:
                System.out.println("Not valid");
                break;
        }
    }

}
