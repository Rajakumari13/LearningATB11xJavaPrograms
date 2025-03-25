package ex_009_Switch_statement;

import java.util.Scanner;

public class lab_055_realtime_switch_usage {
    public static void main(String[] args) {
        //ask the usre to choose the browsre user wants to open
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch (browser) {
            case ("Chrome"): //string names are case sensitive
                System.out.println("Selected browser is chrome");
                break;
            case ("Firefox"):
                System.out.println("Selected browser is Firefox");
                break;
            case ("Edge"):
                System.out.println("Selected browser is Edge");
                break;
            default:
                System.out.println("Kindly select any of the mentioned browser- Chrome, firefox, edge");
                break;
        }

    }
}
