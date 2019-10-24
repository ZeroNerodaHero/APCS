import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *  Test for the complex number class.
 *  
 *  testConstructor1Param - test the 1 parameter constructor
 *  testConstructor2Param - test the 2 parameter constructor
 *  testAddRealAndComplexNum - addition of a complex number 
 *     with a real number
 *  testAdd2ComplexNums - addition of two complex numbers
 *  testMultiply2ComplexNums - multiplication of two complex numbers
 *  testMultiplyRealAndComplexNum - multiplication of a complex number
 *     with a real number
 *  testAbsoluteValue - absolute value of a complex number
 *
 *  @author  TODO Your Name
 *  @version TODO Date
 *  @author  Period: TODO Your Period
 *  @author  Assignment: JMCh09Ex17_Complex 
 *
 *  @author  Sources: TODO List collaborators
 */
public class ComplexJUTest extends junit.framework.TestCase
{
    private static final double p1 = 1;
    private static final double p2 = 2;
    private static final double p3 = 2;
    private static final double p4 = 3;
    private static final double p5 = 3;
    private Complex c1;
    private Complex c2;
    public void setUp() {
        c1 = new Complex(p1);
        c2 = new Complex(p2,p3);
    }
    
    @Test
    public void testConstructor1Param()
    {
        assertEquals(p1+" + "+0.0+"i",c1.toString());
    }

    @Test
    public void testConstructor2Param()
    {
        assertEquals(p2+" + "+p3+"i",c2.toString());
    }

    @Test
    public void testAddRealAndComplexNum()
    {
        Complex c3 = c2.add(p1);
        assertEquals((p1+p2)+" + "+p3+"i",c3.toString());
    }
    
    @Test
    public void testAdd2ComplexNums()
    {
        Complex c3 = new Complex(p4,p5);
        Complex c4 = c3.add(c2);
        assertEquals((p2+p4)+" + "+(p3+p5)+"i",c4.toString());
    }

    @Test
    public void testMultiply2ComplexNums()
    {
        Complex c3 = new Complex(p4,p5);
        Complex c4 = c3.multiply(c2);
        assertEquals((p2*p4-p3*p5)+" + "+(p2*p5+p3*p4)+"i",c4.toString());
    }

    @Test
    public void testMultiplyRealAndComplexNum()
    {
        int k = 5;
        Complex c3 = c2.multiply(k);
        assertEquals((p2*k)+" + "+(p3*k)+"i",c3.toString());
    }

    @Test
    public void testAbsoluteValue()
    {
        Complex c3 = new Complex(3,4);
        assertEquals(0.0,c3.abs(),5);
    }
    
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( ComplexJUTest.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    }
}
