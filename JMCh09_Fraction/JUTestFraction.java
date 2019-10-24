import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

public class JUTestFraction extends junit.framework.TestCase
{
    public void testConstructorDefault()
    {
        Fraction f1 = new Fraction();
        assertEquals( "0/1", f1.toString() );
        System.out.println( "f1 = " + f1 );
    }

    @Test
    public void testConstructor1Param()
    {
        Fraction f2 = new Fraction( 10 );
        assertEquals( "10/1", f2.toString() );
        System.out.println( "f2 = " + f2 );
    }

    @Test
    public void testConstructor2Param()
    {
        Fraction f3 = new Fraction( 5, -30 );
        assertEquals( "-1/6", f3.toString() );
        System.out.println( "f3 = " + f3 );
    }

    @Test
    public void testConstructorCopy()
    {
        Fraction f3 = new Fraction( 5, -30 );

        Fraction f4 = new Fraction( f3 );
        assertEquals( "-1/6", f4.toString() );
        System.out.println( "f4 = " + f4 );
    }

    @Test
    public void testAdd()
    {
        Fraction f1 = new Fraction( 1, 2 );
        Fraction f2 = new Fraction( 1, 3 );

        Fraction sum = f1.add( f2 );
        assertEquals( "5/6", sum.toString() );
        System.out.println( f1 + " + " + f2 + " = " + sum );
    }

    @Test
    public void testMultiply()
    {
        Fraction f1 = new Fraction( 1, 2 );
        Fraction f2 = new Fraction( 1, 3 );

        Fraction product = f1.multiply( f2 );
        assertEquals( "1/6", product.toString() );
        System.out.println( f1 + " * " + f2 + " = " + product );
    }

    @Test
    public void testgetValue()
    {
        Fraction f = new Fraction( 2, 3 );
        assertEquals( 2.0 / 3.0, f.getValue() );
        System.out.println( f + " = " + f.getValue() );
    }

    @Test
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( JUTestFraction.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "JUTestFraction" );
    }
}
