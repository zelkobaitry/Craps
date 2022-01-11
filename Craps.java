
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
        String name = getName();
    }
    public String getName()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        while (name.equals(""))
        {
            System.out.println("Please enter your name here: ");
            name = in.nextLine();
        }
        return name;
    }
    public void instructions(String name)
    {
        System.out.println("Would you like to see the rules for craps? Y/n: ")
        String instructions = in.nextLine();
        if (
        System.out.println("The basic rules for playing craps are relatively simple:");
        System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
        System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
        System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the 'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
        System.out.println("Playing craps can include a number of variations on this game, and also typically involves betting on various outcomes; those aspects of the game are not included in this simulation");
    }
}
