package ex_009_Switch_statement;

import javax.swing.*;

public class Lab_057_IQ2 {
    public static void main(String[] args) {
        char a1='A';
        switch (a1)  //Always variable name a1
        {
            case 65:
                System.out.println("Match with ASCII");
                break;
            default:
            System.out.println("No match");
            break;
        }
    }
}
