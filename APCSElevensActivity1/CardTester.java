/**
 * This is a class that tests the Card class.
 *
 * @author Billy Zhang
 * @version 8/29
 * @author Period: 1
 * @author Assignment: APCSElevensActivity1
 *
 */
public class CardTester
{
	/**
	 * The main method in this class checks the Card operations for
	 * consistency.
	 * @param args is not used.
	 */
    public static void main( String[] args )
    {
        Card aceClubs1 = new Card("ace", "clubs", 1);
        Card a2 = new Card("ace", "clubs", 1);
        Card h = new Card("6", "hearts", 6);
        
        System.out.println("**** ace of clubs #1 Tests ****");
        System.out.println("  rank: " + aceClubs1.rank());
        System.out.println("  suit: " + aceClubs1.suit());
        System.out.println("  pointValue: " + aceClubs1.pointValue());
        System.out.println("  toString: " + aceClubs1.toString());
        System.out.println();
        
        System.out.println("**** ace of clubs #2 Tests ****");
        System.out.println("  rank: " + a2.rank());
        System.out.println("  suit: " + a2.suit());
        System.out.println("  pointValue: " + a2.pointValue());
        System.out.println("  toString: " + a2.toString());
        System.out.println();
        
        System.out.println("**** six of hearts Tests ****");
        System.out.println("  rank: " + h.rank());
        System.out.println("  suit: " + h.suit());
        System.out.println("  pointValue: " + h.pointValue());
        System.out.println("  toString: " + h.toString());
        System.out.println();
        
        System.out.println("**** matches Tests ****");
        System.out.println("  matching: " + aceClubs1.matches(a2));
        System.out.println("  not matching: " + aceClubs1.matches(h));
    }
}
