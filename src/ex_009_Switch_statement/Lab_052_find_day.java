package ex_009_Switch_statement;

public class Lab_052_find_day {
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
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
