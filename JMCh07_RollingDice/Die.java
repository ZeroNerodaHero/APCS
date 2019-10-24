/**
 * Simulates a six-sided die.
 *
 * @author TODO your Name
 * @version TODO date
 * @author Period: TODO your period
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: TODO collaborators
 */
public class Die
{
    private int numDots;


    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        numDots = (int)( 6 * Math.random() ) + 1;
    }


    /**
     * Returns the value of the most recent roll.
     * 
     * @return numDots
     */
    public int getNumDots()
    {
        return numDots; // Fix this !!!
    }


    /**
     * 
     * test stuff
     * 
     * @param args
     *            does somthing
     */
    public static void main( String[] args )
    {
        Die die = new Die();
        die.roll();
        System.out.println( die.getNumDots() );
    }
}
