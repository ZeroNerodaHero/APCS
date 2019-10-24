/**
 * A class to solve various loop problems
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 *          Period - TODO Your Period Assignment - A12.1 - FunLoops
 * 
 *          Sources - TODO list collaborators
 */
public class FunLoops
{
    /**
     * feefw
     * 
     * @param n
     *            bnig off
     */
    public void magicsquare( int n )
    {
        System.out.println( "Magic Squares" );
        int cb = 1;
        for ( long i = 1; cb <= n; i++ )
        {
            double m = i * i;
            double root = Math.sqrt( 8 * m + 1 );
            if ( root - (long)root < 0.0001 && root % 2 == 1 )
            {
                // if(cb == 8) System.out.println(i+" "+m);
                System.out.println( cb++ + ": " + (long)m );
            }
        }
    }


    /**
     * 
     * uhhhhh chd
     * 
     * @param a
     *            fwefwf
     * @param b
     *            wfwefw
     * @return number
     */
    public int gcd( int a, int b )
    {
        if ( a == 0 )
        {
            return b;
        }
        return gcd( b % a, a );
    }


    /**
     * 
     * goodf
     * 
     * @param a
     *            nu,me
     * @param b
     *            number
     * @return afwef
     */
    public int lcm( int a, int b )
    {
        return ( a * b ) / gcd( a, b ); // Fix this
    }


    /**
     * 
     * does somtjing
     * 
     * @param args
     *            fefe
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }
}

/*
 * Magic Squares 1: 1 2: 36 3: 1225 4: 41616
 * 
 * LCM (15, 18) = 90 LCM (40, 12) = 120 LCM (2, 7) = 14 LCM (100, 5) = 100
 * 
 * Magic Squares 1: 1 2: 36 3: 1225 4: 41616 5: 1413721 6: 48024900 7:
 * 1631432881 8: 55420693056 9: 1882672131025 10: 63955431761796
 */
