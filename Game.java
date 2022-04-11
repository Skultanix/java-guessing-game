/*

A number-guessing game.

*/
//import the scanner package
import java.util.Scanner;

//import the Input Mismatch Exception package
import java.util.InputMismatchException;

public class Game {
    public static void main(String[] args) {
        //Ask for name and get name
        System.out.println("Hello, what is your name?");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        //set up of guess counter
        int guessCounter = 0;
        //random number generation for the computer to store
        int randoNumber = (int) (Math.random() * (100 - 1) + 1);

        //initial prompt
        System.out.println(user + " here's the deal, I'm thinking of a number between 1 and 100; guess what it is.");

        while (true) {
            //Declare variable for the user input
            int guessedNum;
            try {
                //using the scanner method declare the input variable to be of type integer
                guessedNum = input.nextInt();

                //Test of user input
//                System.out.println("Your guess is: " + guessedNum + ".");
//                System.out.println("The guess is of type: " + ((Object) guessedNum).getClass().getSimpleName() + ".");

            }
            //Set up a catch in the event that the input is the wrong variable type
            catch (InputMismatchException e)
            {
                //If the type is wrong continue to print the message
                String bad_input = input.next();
                System.out.println("Please enter and integer (whole number).");
                continue;
            }

            //Verify that the user is keeping their guess within the range
            if(guessedNum < 1 || guessedNum > 100) {
                System.out.println("The number "+guessedNum+", falls outside of the prescribed range. Please guess again.");
                continue;
            }

            guessCounter = guessCounter + 1;

            //lets the user know if their guess is too low.
            if (guessedNum < randoNumber) {
                System.out.println("Too low, guess again.");

            //lets the user know if their guess is too high.
            } else if (guessedNum > randoNumber) {
                System.out.println("Too high, guess again.");
            } else {
                // Notifications if the user guesses correctly.
                System.out.println("Well, well, well; it would seem, "+user+", that you've guessed correctly.");
                System.out.println("It took you "+guessCounter+" guesses.");
                break;
            }
        }

        //if block to compare the user guess to the generated number
        //First verify the correct input type

    }
}