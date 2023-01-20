package sdf2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberLoop {
    private GuessNumberLoop() {
    }


    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNumber = rand.nextInt(100);

        Integer myGuess = 0;

        Scanner input = new Scanner(System.in);


        while(myGuess != guessNumber) {
            System.out.printf("Please enter a guess: ");
            myGuess = input.nextInt();

            if (myGuess < guessNumber) {
                System.out.println("Guess higher!");
            } 
            else if (myGuess > guessNumber) {
                System.out.println("Guess lower!");
            } else {
                System.out.println("Your guess is correct! You win!");
                // remember to close the input
                input.close();
                System.exit(0);
            }

        }

    


    }
}
