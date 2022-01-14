
/**
 * This program simulates playin Craps
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
        Player player = new Player();
        player.setName();
        instructions(player);

        boolean playing = true;
        Die die = new Die();
        while (playing)
        {
            System.out.println("Press <Enter> to roll your first roll..."); // first roll
            String rolling = in.nextLine();
            int point = die.rollDie();
            System.out.println("You rolled a " + point + ("!"));
            if (point == 7) // player won the game
            {
                System.out.println("Congratulations! Since you rolled a 7 on your first roll, you automatically win!");
                player.gameWon();
            }
            else if (point == 11) // player won the game
            {
                System.out.println("Congratulations! Since you rolled an 11 on your first roll, you automatically win!");
                player.gameWon();
            }
            else if (point == 2) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 2 on your first roll, you automatically lose!");
                player.gameLost();
            }
            else if (point == 3) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 3 on your first roll, you automatically lose!");
                player.gameLost();
            }
            else if (point == 12) // player won the game
            {
                System.out.println("Uh-oh! Since you rolled a 12 on your first roll, you automatically lose!");
                player.gameLost();
            }
            else // keep playing
            {
                System.out.println("Since your first roll was not a 2, 3, 7, 11, or 12, you will now roll a second time");
                System.out.println("Press <Enter> to roll your second roll...");
                rolling = in.nextLine();
                int roll2 = die.rollDie();
                while(roll2 != point)
                {
                    if (roll2 == 7)
                    {
                        System.out.println("Uh-oh! Since you rolled a 7 on your second roll, you automatically lose!");
                        player.gameLost();
                        break;
                    }
                    else
                    {
                        System.out.println("Since your second roll, " + roll2 + ", is not the same as the point, " + point + ", and you didn't roll a 7, you are still playing.");
                        System.out.println("Press <Enter> to roll your next roll...");
                        rolling = in.nextLine();
                        roll2 = die.rollDie();
                    }
                }
                System.out.println("Congrats! Since you rolled a " + roll2 + ", and the point is " + point + ", you win!");
                player.gameWon();
            }
            System.out.println("Would you like to keep playing?");
            String stillplaying = in.nextLine();
            if (stillplaying.toLowerCase().equals("n"))
            {
                break;
            }
        }        

        stats(player);
        System.out.println("Ok. Have a good rest of your day!");
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
