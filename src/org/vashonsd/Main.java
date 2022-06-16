package org.vashonsd;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //This will create the symbols of the game, the strings,  and label them as they are seen here.
    public static final String ROCK = "R";
    public static final String PAPER = "P";
    public static final String SCISSORS = "S";

    //Initializing your move and the computers move and returning what happens when both are combined.
    public static void getResult(String usersMove, String computersMove) {
        System.out.println("The computer chooses: " + computersMove);
// When you tie the message in the print statement will appear.
        if (usersMove.equals(computersMove))
            System.out.println("That means we've tied!");
        else if (usersMove.equals(ROCK))
        {
          //Depending upon your choice and what the computer randomly picks you will either win or lose here.
            if (computersMove.equals(SCISSORS))
                System.out.println("You win!");
            else if (computersMove.equals(PAPER))
                System.out.println("You lose!");
        }
        else if (usersMove.equals(PAPER))
        {
            if (computersMove.equals(ROCK))
                System.out.println("You win!");
            else if (computersMove.equals(SCISSORS))
                System.out.println("You lose!");
        }
        else if (usersMove.equals(SCISSORS))
        {
            if (computersMove.equals(PAPER))
                System.out.println("You win!");
            else if (computersMove.equals(ROCK))
                System.out.println("You lose!");
        }
        else
          //This statement will appear when the user input is invalid and the game doesn't work.
            System.out.println("That doesn't work for this game, ");
    }

    // Below is the build for the computers randomizing system that makes it possible for the user to play with the computer.
    public static String getComputersMove(){
        int computersNum;
        String computersMove="";
        Random random = new Random();
        computersNum = random.nextInt(3) + 1;
        if (computersNum == 1)
            computersMove = ROCK;
        else if (computersNum == 2)
            computersMove = PAPER;
        else if (computersNum == 3)
            computersMove = SCISSORS;
        return computersMove;
    }
// creates the option for the user to enter an option, and also prints out the print statement before your option.
    public static String getUsersMove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your play: ");
        String input = scanner.next().toUpperCase();
        return input;
    }
// print statements to tell the user what's happening.
    public static void main(String[] args) {
        System.out.println( " Welcome to the game Rock, Paper, Scissors! "
                + "Please enter your choice: "
                +"Rock = R, Paper= P, and Scissors = S ");
       //gets the users option from the symbols listed below.
        String userInput = getUsersMove();
        if (userInput.equals(PAPER) || userInput.equals(ROCK) || userInput.equals(SCISSORS))
            getResult(userInput, getComputersMove());
        else
            System.out.println("This doesn't work, " + userInput);
    }
}









