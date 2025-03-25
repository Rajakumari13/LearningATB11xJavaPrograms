package ex_011_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_083_Guessing_game {
    public static void main(String[] args) {
        Random random=new Random(); //To display random num used this class
        int numToGuess= random.nextInt(100)+1; //Num should be int and should displyas till 100.so +1
        Scanner scanner= new Scanner(System.in);
        System.out.println("Guess the number");

        int guess;
        int attempts=0;

        while(true)
        {
            guess=scanner.nextInt();
            attempts++;
            if (guess<numToGuess)
            {
                System.out.println("The guessed number is too low. Try again");
            }
            else  if(guess>numToGuess)
            {
                System.out.println("The guessed number is too high. Try again");
            }
            else
            {
                System.out.println("The guessed number is correct and your attempts are");
            break;
        }
    }
}
}

//Guess the number from 1 to 100 and find the attempts