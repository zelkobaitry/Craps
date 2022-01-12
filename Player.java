
/**
 * this class keeps track of a player's stats in the game craps
 *
 * @author Ziko Elkobaitry
 * @version 2022-01-11
 */

import java.util.Scanner;
public class Player
{
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int rolls;

    public Player()
    {
        this.name = null;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.rolls = 0;
    }

    /**
     * this method sets the player's name
     * 
     */
    public void setName()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        this.name = in.nextLine();
        while (name.equals(""))
        {
            System.out.print("Please enter your name here: ");
            this.name = in.nextLine();
        }
    }
    
    /**
     * this method returns the player's name
     * 
     * @return the player's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * this method is called when the player wins a game
     */
    public void gameWon()
    {
        gamesWon++;
        gamesPlayed++;
    }
    
    /**
     * this method is called when the player looses a game
     */
    public void gameLost()
    {
        gamesLost++;
        gamesPlayed++;
    }
    
    /**
     * this method is called when the player rolls the dice
     */
    public void rolls()
    {
        rolls++;
    }
    
    /**
     * this method returns the player's games played count
     * 
     * @return the player's games played count
     */
    public int getgamesPlayed()
    {
        return gamesPlayed;
    }
    
    /**
     * this method returns the player's games won count
     * 
     * @return the player's games won count
     */
    public int getgamesWon()
    {
        return gamesPlayed;
    }
    
    /**
     * this method returns the player's games lost count
     * 
     * @return the player's games lost count
     */
    public int getgamesLost()
    {
        return gamesPlayed;
    }
    
    /**
     * this method returns the number of times the player rolled the dice
     * 
     * @return the number of times the player rolled the dice
     */
    public int getRolls()
    {
        return rolls;
    }
}
