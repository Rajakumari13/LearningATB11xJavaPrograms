package ex_011_While_Loop;


import java.util.Random;
import java.util.Scanner;

public class Lab_084_Guessing_game {
    public static void main(String[] args) {
        //Call class to provide random num
        Random random=new Random();

        //declare random and limit should be with in 100. So adding +1 at the end to get 100
        int number_to_guess= random.nextInt(100)+1;
        System.out.println("Enter the number you guessed");

        Scanner scanner=new Scanner(System.in); //user has to enter the i/p. Used scanner option
        int guess;
        int attempt=0;

        while(true) //Inti
        {
            guess= scanner.nextInt(); //user to enter the guessed num if cond fails
            attempt++; //attempt inc to 1
            if(guess>number_to_guess) //guess-15 num to guess-45
            {
                System.out.println("It is too high. Try again");
            }
            else if (guess<number_to_guess)
            {
                System.out.println("It is too low. Try again");
            }
            else
            {
                System.out.println("Correct guess with the attempts of "+attempt);
                break;
            }
        }
    }

}

//Guess the number from 1 to 100 and find the attempts