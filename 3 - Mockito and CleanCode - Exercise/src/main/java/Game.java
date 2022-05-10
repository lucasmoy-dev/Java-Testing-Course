import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        //start game
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
        String choice = input.nextLine(); //prompt response
        choice = choice.toLowerCase(); //change to lowercase for consistency

        //initialize variables
        int tienum = 0;
        int winnum = 0;
        int lossnum = 0;

        while (!choice.equals("quit")) //do the following if the user does not put in "quit"
        {
            int choicenum = 0;
            if (choice.equals("rock")) //assign numbers to string
            {
                choicenum = 1;
            }
            else if (choice.equals("paper")) //assign numbers to string
            {
                choicenum = 2;
            }
            else if (choice.equals("scissors"))//assign numbers to string
            {
                choicenum = 3;
            }
            else //not valid responses
            {
                while(choicenum == 0) //continue while user input is still not valid
                {
                    System.out.println("Sorry, it looks like you didn't enter a correct input. Try again.");
                    choice = input.nextLine();
                    choice = choice.toLowerCase();
                    if (choice.equals("rock"))
                    {
                        choicenum = 1;
                    }
                    else if (choice.equals("paper"))
                    {
                        choicenum = 2;
                    }
                    else if (choice.equals("scissors"))
                    {
                        choicenum = 3;
                    }
                    else if (choice.equals("quit"))
                        System.exit(0); //quit program
                }
            }
            int compnum = (int) (random.nextInt(3)) + 1;//computer generate random num
            //print computer choice
            if (compnum == 1) System.out.println("Computer chose rock");
            if (compnum == 2) System.out.println("Computer chose paper");
            if (compnum == 3) System.out.println("Computer chose scissors");


            if(choicenum == compnum) //tie cases
            {
                System.out.println("It's a tie");
                tienum++;
            }
            else if (choicenum == 1 && compnum == 3) //user wins rock vs scissors
            {
                System.out.println("you win!");
                winnum++;
            }
            else if (choicenum == 3 && compnum == 2) //user wins scissors vs paper
            {
                System.out.println("you win!");
                winnum++;
            }
            else if (choicenum == 2 && compnum ==1) //user wins paper vs rock
            {
                System.out.println("you win!");
                winnum++;
            }
            else //otherwise computer wins
            {
                System.out.println("you lose.");
                lossnum++;
            }
            System.out.println("wins:" + winnum + "\nloses:" + lossnum + "\nties:" + tienum); //print out number of wins, ties, and loses
            System.out.println("Let's play again! \n \n"); //start game again
            System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
            choice = input.nextLine(); //prompt for new user input
            choice = choice.toLowerCase();
        }
        if(choice.equals("quit")) //if user prints "quit", then quit program
            return;
    }
}
