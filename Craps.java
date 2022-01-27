
/**
 * This program simulates playing the game Craps
 *
 * @author Ziko Elkobaitry
 * @version 2022-01-11
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Player player = new Player(); // constructs player to save statistics
        player.setName(); // sends user to the setName() method within the player class to get their name
        instructions(player); // sends user to the instructions() method to check if they want instructions

        boolean playing = true; // user is playing the game
        Die die = new Die(); // constructs die
        while (playing)
        {
            System.out.println("Press <Enter> to roll your first roll..."); // first roll
            String rolling = in.nextLine();
            int point = die.rollDie(); // rolls the dice
            player.rolls(); // increases number of times dice was rolled
            System.out.println("You rolled a " + point + ("!"));
            if (point == 7) // player won the game
            {
                System.out.println("Congratulations! Since you rolled a 7 on your first roll, you automatically win!");
                player.gameWon(); // updates statistics
            }
            else if (point == 11) // player won the game
            {
                System.out.println("Congratulations! Since you rolled an 11 on your first roll, you automatically win!");
                player.gameWon(); // updates statistics
            }
            else if (point == 2) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 2 on your first roll, you automatically lose!");
                player.gameLost(); // updates statistics
            }
            else if (point == 3) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 3 on your first roll, you automatically lose!");
                player.gameLost(); // updates statistics
            }
            else if (point == 12) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 12 on your first roll, you automatically lose!");
                player.gameLost(); // updates statistics
            }
            else // keep playing
            {
                System.out.println("Since your first roll was not a 2, 3, 7, 11, or 12, you will now roll a second time");
                System.out.println("Press <Enter> to roll your second roll...");
                rolling = in.nextLine();
                int roll2 = die.rollDie(); // rolls dice
                player.rolls(); // increases number of times dice was rolled
                System.out.println("You rolled a " + roll2 + ("!"));
                while(roll2 != point)
                {
                    if (roll2 == 7) // game lost
                    {
                        System.out.println("Uh-oh! Since you rolled a 7 on your second roll, you automatically lose!");
                        player.gameLost();
                        break;
                    }
                    else // game continues possibly forever
                    {
                        System.out.println("Since your second roll, " + roll2 + ", is not the same as the point, " + point + ", and you didn't roll a 7, you are still playing.");
                        System.out.println("Press <Enter> to roll your next roll...");
                        rolling = in.nextLine();
                        roll2 = die.rollDie();
                        System.out.println("You rolled a " + roll2 + ("!"));
                        player.rolls();
                    }
                }
                if (roll2 == point)
                {
                    System.out.println("Congrats! Since you rolled a " + roll2 + ", and the point is " + point + ", you win!");
                    player.gameWon();
                }
            }
            System.out.print("Would you like to keep playing? (Y/n)");
            String stillplaying = in.nextLine();
            if (stillplaying.toLowerCase().equals("n"))
            {
                break;
            }
        }        

        stats(player); // sends user to the stats() method to check if they want their statistics
        System.out.println("Have a good rest of your day!");
    }

    public static void instructions(Player player)
    {
        Scanner in = new Scanner(System.in);
        boolean ready = false;
        while (!ready)
        {
            System.out.print("Would you like to see the rules for craps? Y/n: ");
            String instructions = in.nextLine();
            if (instructions.toUpperCase().equals("Y"))
            {
                System.out.println();
                System.out.println("Well great news, " + player.getName() + "! Fortunately for you, the basic rules for playing craps are relatively simple.");
                System.out.println();
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the 'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
                System.out.println();
                System.out.println("Playing craps can include a number of variations on this game, and also typically involves betting on various outcomes; those aspects of the game are not included in this simulation");
                System.out.println();
            }
            System.out.print("Are you ready to play? Y/n: ");
            String ask = in.nextLine();
            if (ask.toUpperCase().equals("Y"))
            {
                System.out.println();
                System.out.println("Alright! LET'S PLAY CRAPS!");
                System.out.println();
                ready = true;
            }
        }
    }

    public static void stats(Player player)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to see some statistics? Y/n: ");
        String stats = in.nextLine();
        if (stats.toUpperCase().equals("Y"))
        {
            System.out.println();
            System.out.println("That was some nice Crap gameplay " + player.getName() + "! Here are some statistics from your playing:");
            System.out.println();
            System.out.println("Number of games played: " + player.getgamesPlayed());
            System.out.println("Number of games won: " + player.getgamesWon());
            System.out.println("Number of games lost: " + player.getgamesLost());
            System.out.println("Number of times the dice were rolled: " + player.getRolls());
            System.out.println();
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is outstanding, Ziko. Just a wonderful tour de force of so many things, 
including your inclusion of statistics to track a player's games over time.
And you've got a Player class? You just threw that in there for kicks?!

SO GOOD!

One bit of advice I'll throw in here. Although we've practiced writing some
static methods in our classes, especially at the beginning of the year when
we were breaking up our code, we'll be doing that less as we get into true
object-oriented programming. Static methods (aside from the main()) aren't 
commonly used.

What does that mean for you? In this program, rather than have a static
method `stats` in the main(), you could have a `getStats` method in the
Player class that return a summary of the player's games. Easy!

Such good work here, Ziko. Looking forward to seeing what else you come
up with this semester!

SCORE: 55/50

*/

