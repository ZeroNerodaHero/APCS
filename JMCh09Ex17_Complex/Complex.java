/**
 * Represents a complex number of the form a + bi. Provides methods for adding,
 * multiplying and calculating the absolute value.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period: TODO Your Period
 * @author Assignment: JMCh09Ex17_Complex
 *
 * @author Sources: TODO List collaborators
 */
public class Complex
{
    private double a;

    private double b;


    /**
     * creates a obj with both a and b
     * 
     * @param a
     *            the real part
     * @param b
     *            tjhe imaginary pary
     */
    public Complex( double a, double b )
    {
        this.a = a;
        this.b = b;
    }


    /**
     * creates a complex with only real
     * 
     * @param a
     *            the real part
     */
    public Complex( double a )
    {
        this.a = a;
        this.b = 0.0;
    }


    // TODO Methods
    /**
     * calculates the absoulte distance form origin
     * 
     * @return double of distance
     */
    public double abs()
    {
        return Math.sqrt( this.a * this.a + this.b * this.b );
    }


    /**
     * 
     * this adds two comples things
     * 
     * @param other comple number
     * @return a complex sum of the two
     */
    public Complex add( Complex other )
    {
        return new Complex( this.a + other.a, this.b + other.b );
    }


    /**
     * changes obj to a sting
     * @return the string from of imaginary
     */
    public String toString()
    {
        return a + " + " + b + "i";
    }


    /**
     * multiply by complex
     * 
     * @param o
     *            the other complex
     * @return returns the product 
     */
    public Complex multiply( Complex o )
    {
        double r = ( this.a * o.a ) - ( this.b * o.b );
        double i = ( this.a * o.b + o.a * this.b );
        return new Complex( r, i );
    }


    /**
     * 
     * adds a double to real
     * 
     * @param m
     *            the double real
     * @return the sum in complex
     */
    public Complex add( double m )
    {
        return new Complex( this.a + m, this.b );
    }


    /**
     * multiply by complex with constant
     * 
     * @param m
     *            the constant
     * @return the complex of constant
     */
    public Complex multiply( double m )
    {
        return new Complex( this.a * m, this.b * m );
    }
}
