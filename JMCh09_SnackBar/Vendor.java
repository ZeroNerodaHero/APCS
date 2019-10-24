import java.lang.reflect.*;


/**
 * This class implements a vendor that sells one kind of item. A vendor carries
 * out sales transactions.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - TODO list collaborators
 */
public class Vendor
{
    // Fields:
    private int p; 
    private int num;
    private int dep;
    private int change;

    private static double sale = 0.0;


    // Constructor
    // Parameters:
    // int price of a single item in cents
    // int number of items to place in stock
    /**
     * this creates a vendor class and sets everyhting up
     * 
     * @param p
     *            this is the price
     * @param num
     *            this is the numbner of items in stock
     */
    public Vendor( int p, int num )
    {
        this.p = p;
        this.num = num;
        this.dep = 0;
    }


    /**
     * this returns the total sales and resets it
     * 
     * @return the total sales
     */
    public static double getTotalSales()
    {
        double tmp = sale;
        sale = 0.0;
        return tmp;

    }


    // Sets the quantity of items in stock.
    // Parameters:
    // int number of items to place in stock
    // Return:
    // None
    /**
     * adds item in the stokc
     * 
     * @param n
     *            the amount that the stock will have
     */
    public void setStock( int n )
    {
        this.num = n;
    }


    // Returns the number of items currently in stock.
    // Parameters:
    // None
    // Return:
    // int number of items currently in stock
    /**
     * gets the stock left
     * 
     * @return the stock left
     */
    public int getStock()
    {
        return num;
    }


    // Adds a specified amount (in cents) to the deposited amount.
    // Parameters:
    // int number of cents to add to the deposit
    // Return:
    // None
    /**
     * adds money to tthe total depoisit
     * 
     * @param c
     *            the money being added(cents)
     */
    public void addMoney( int c )
    {
        if ( num <= 0 ) {
            return;
        }
        this.dep += c;
    }


    // Returns the currently deposited amount (in cents).
    // Parameters:
    // None
    // Return:
    // int number of cents in the current deposit
    /**
     * returns teh deposit
     * 
     * @return the deposut
     */
    public int getDeposit()
    {
        return dep;
    }


    // Implements a sale. If there are items in stock and
    // the deposited amount is greater than or equal to
    // the single item price, then adjusts the stock
    // and calculates and sets change and returns true;
    // otherwise refunds the whole deposit (moves it into change)
    // and returns false.
    // Parameters:
    // None
    // Return:
    // boolean successful sale (true) or failure (false)
    /**
     * Implements a sale. If there are items in stock and // the deposited
     * amount is greater than or equal to // the single item price, then adjusts
     * the stock // and calculates and sets change and returns true; //
     * otherwise refunds the whole deposit (moves it into change) // and returns
     * false.
     * 
     * @return boolean if it is possible
     */
    public boolean makeSale()
    {
        if ( this.num == 0 || dep < p )
        {
            change = dep;
            dep = 0;
            return false;
        }
        num--;
        sale += p * 0.01;
        change = dep - p;
        dep = 0;
        return true;
    }


    // Returns and zeroes out the amount of change (from the last
    // sale or refund).
    // Parameters:
    // None
    // Return:
    // int number of cents in the current change
    /**
     * returns change
     * 
     * @return the cahnge
     */
    public int getChange()
    {
        return change;
    }


    /**
     * Intended only for debugging.
     * 
     * <p>
     * A generic toString implementation that uses reflection to print names and
     * values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     * </p>
     * 
     * @return a string representation of this Vendor.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }
}
