
/**
 * coo stuff
 *
 * @author: Billy Zhang
 * @version: 8/22
 * @author Period: 1
 * @author Assignment: JMCh02_Hello - Greetings2.java
 *
 * @author Sources: me
 */

import java.util.*;
import java.*;


public class Greetings2
{
    public static void main (String[] args)
    {
        Scanner kboard = new Scanner( System.in );
        System.out.print( "Enter your first name: " );
        String firstName = kboard.nextLine();
        System.out.print( "Enter your last name: " );
        String lastName = kboard.nextLine();
        System.out.println( "Hello, " + firstName + " " + lastName );
        System.out.println( "Welcome to Java!" );
    }
}
