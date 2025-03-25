package ex_009_Switch_statement;

public class Lab_054_Switch_cond_notavailable {
    public static void main(String[] args) {
        System.out.println("Enter the numbers from 1 to 7 to find  day");
        int day=Integer.parseInt(args[0]);
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }

    }
}
