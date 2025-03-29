package ex_015_StringBuffer_StringBuilder;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab_113_Palindrome_with_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        System.out.println("User input is"+ user_input);


        String reverse_input= reverseString(user_input); //called from method
        System.out.println("The input in reverse is "+reverse_input);
        if(reverse_input.equalsIgnoreCase(user_input))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    static String reverseString(String user_input) {
        String reverse = "";
        for (int i = user_input.length() - 1; i >= 0; i--) {
            reverse = reverse + user_input.charAt(i);
        }
        return reverse;

        /*
        private static String reverseStringSB(String userInput) {
        StringBuilder sb = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
         */
    }
}
