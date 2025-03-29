package ex_015_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab_112_Palindrome_without_function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence to check palindrome");
        String user_input= scanner.nextLine();
        System.out.println("User entered input is "+user_input);

        String reverse="";
        for(int i=user_input.length()-1;i>=0;i--)
        {
            reverse=reverse+user_input.charAt(i);

        }
        System.out.println("Reverse string is "+reverse);
        if(user_input.equalsIgnoreCase(reverse)) //to check equal
        {
            System.out.println("Entered input is palindrome");
        }
        else
        {
            System.out.println("Entered input is not palindrome");
        }
    }
}

/*To check palindrom String and reverse of string should match
 Ex. Madam, 54345


 */
