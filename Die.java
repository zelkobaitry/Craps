/**
 * This program keeps track of a die's roll
 *
 * @author Ziko Elkobaitry
 * @version 2022-01-11
 */
public class Die
{
    private int roll;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        this.roll = rollDie();
    }

    /**
     * roll this program rolls the die
     */
    public int rollDie()
    {
        int die1 = (int) (Math.random() * 6 + 1);
        int die2 = (int) (Math.random() * 6 + 1);
        roll = die1 + die2;
        return roll;
    }
    
    /**
     * roll this program rolls the die
     *
     * @return the roll value
     */
    public int getRoll()
    {
        return roll;
    }
}
