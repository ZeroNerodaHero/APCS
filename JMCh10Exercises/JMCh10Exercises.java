import java.util.*;


/**
 * Java Methods Chapter 10 Exercises 2, 6 - 11, 14 - 15, 20 & 22
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch10Exercises
 * 
 * @author Sources - TODO list collaborators
 */
public class JMCh10Exercises
{
    Scanner scan;


    /**
     * Constructs a Scanner for input from the console.
     */
    public JMCh10Exercises()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str
     *            input for the various methods
     */
    public JMCh10Exercises( String str )
    {
        scan = new Scanner( str );
    }


    // 10-2(a)
    public boolean endsWithStar( String s )
    {
        if ( s.length() == 0 )
        {
            return false;
        }
        if ( s.charAt( s.length() - 1 ) == '*' )
        {
            return true;
        }

        return false;
    }


    // 10-2(b)
    public boolean endsWith2Stars( String s )
    {
        if ( s.length() < 2 )
        {
            return false;
        }
        if ( s.charAt( s.length() - 1 ) == '*'
            && s.charAt( s.length() - 2 ) == '*' )
        {
            return true;
        }
        return false; // FIX THIS!!!
    }


    // 10-6
    public String scroll( String s )
    {
        String s1 = s.substring( 1 ) + s.charAt( 0 );

        return s1; // FIX THIS!!!
    }


    // 10-7
    public String convertName( String name )
    {
        int i = 0;
        for ( ; i < name.length(); i++ )
        {
            if ( name.charAt( i ) == ',' )
            {
                break;
            }
        }
        String na = name.substring( i + 2 ) + ' ' + name.substring( 0, i );
        return na; // FIX THIS!!!
    }


    // 10-8
    public String negate( String str )
    {
        String na = "";
        for ( int i = 0; i < str.length(); i++ )
        {
            if ( str.charAt( i ) == '1' )
            {
                na += '0';
            }
            else
            {
                na += '1';
            }
        }

        return na; // FIX THIS!!!
    }


    // 10-9
    public boolean isConstant( String s )
    {
        String why = scroll( s );
        return s.equals( why );
    }


    // 10-10
    public String removeComment( String str )
    {
        if ( str.contains( "/*" ) && str.contains( "*/" ) )
        {
            String ret = str;
            int s = ret.indexOf( "/*" );
            int r = ret.lastIndexOf( "*/", ret.length() );
            ret = ret.substring( 0, s ) + ret.substring( r + 2 );
            return ret;
        }

        return str;
    }


    // 10-11
    public String cutOut( String s, String s2 )
    {
        int i;
        boolean k = false;
        for ( i = 0; i < s.length(); i++ )
        {
            if ( s.charAt( i ) == s2.charAt( 0 ) )
            {
                int tj = 0;
                for ( int ti = i; ti < s.length()
                    && tj < s2.length(); ti++, tj++ )
                {
                    if ( s.charAt( ti ) != s2.charAt( tj ) )
                    {
                        break;
                    }
                }
                if ( tj == s2.length() )
                {
                    k = true;
                    break;
                }
            }
        }
        if ( k )
        {
            String f = s.substring( 0, i )
                + s.substring( i + s2.length() );
            return f;
        }
        return s; // FIX THIS!!!
    }


    // 10-14
    public String removeHtmlTags( String str )
    {
        String in = "";
        for ( int i = 0; i < str.length(); i++ )
        {
            if ( str.charAt( i ) == '<' )
            {
                in = "</";
                int j;
                for ( j = i + 1; j < str.length(); j++ )
                {
                    if ( str.charAt( j ) == '>' )
                        break;
                    in += str.charAt( j );
                }
                in += ">";
                int r = str.lastIndexOf( in, str.length() );
                return str.substring( 0, i ) + str.substring( j + 1, r )
                    + str.substring( r + in.length() );
            }
        }

        return str;
    }


    // 10-15
    public boolean onlyDigits( String s )
    {
        for ( int i = 0; i < s.length(); i++ )
        {
            if ( s.charAt( i ) < '0' || s.charAt( i ) > '9' )
            {
                return false;
            }
        }

        return true; // FIX THIS!!!
    }


    // 10-20
    public static boolean isValidISBN( String isbn )
    {
        int t = 0;
        for ( int i = 0; i < isbn.length() - 1; i++ )
        {
            t += ( 10 - i ) * ( isbn.charAt( i ) - '0' );
        }
        if ( isbn.charAt( isbn.length() - 1 ) == 'X' )
        {
            t += 10;
        }
        else
        {
            t += isbn.charAt( isbn.length() - 1 ) - '0';
        }

        return t % 11 == 0; // FIX THIS!!!
    }


    // 10-22
    public String shuffle( String s )
    {
        StringBuffer st = new StringBuffer( s );
        Random a12 = new Random();
        int n = s.length() - 1;
        for ( ; n > 0; n-- )
        {
            int r = a12.nextInt( n );
            char tmp = st.charAt( r );
            st.setCharAt( r, st.charAt( n ) );
            st.setCharAt( n, tmp );
        }

        return st.toString(); // FIX THIS!!!
    }


    /**
     * Testing method: instantiates a Ch18Ex1to5 object and then invokes each
     * method.
     * 
     * @param args
     *            command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        JMCh10Exercises exercise = new JMCh10Exercises();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) 10-2(a) endsWithStar( String s )" );
            System.out.println( "   (2) 10-2(b) endsWith2Stars( String s )" );
            System.out.println( "   (3) 10-6 scroll( String s )" );
            System.out.println( "   (4) 10-7 convertName( String name )" );
            System.out.println( "   (5) 10-8 negate( String str )" );
            System.out.println( "   (6) 10-9 isConstant( String s )" );
            System.out.println( "   (7) 10-10 removeComment( String str )" );
            System.out.println( "   (8) 10-11 cutOut( String s, String s2 )" );
            System.out.println( "   (9) 10-14 removeHtmlTags( String str )" );
            System.out.println( "   (A) 10-15 onlyDigits( String s )" );
            System.out.println( "   (B) 10-20 isValidISBN( String isbn )" );
            System.out.println( "   (C) 10-22 shuffle( String s )" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        String end1Star = "**endsWith**Star*";
                        System.out.println( "endsWithStar(" + end1Star + ") = "
                            + exercise.endsWithStar( end1Star ) );
                        String ends0Star = "**endsWith**Star*No";
                        System.out.println( "endsWithStar(" + ends0Star
                            + ") = " + exercise.endsWithStar( ends0Star ) );
                        break;
                    case '2':
                        String end2Str = "**endsWith**2Stars**";
                        System.out.println( "endsWith2Stars(" + end2Str
                            + ") = " + exercise.endsWith2Stars( end2Str ) );
                        String endsWith1Star = "**endsWith**2Stars*";
                        System.out.println(
                            "endsWith2Stars(" + endsWith1Star + ") = "
                                + exercise.endsWith2Stars( endsWith1Star ) );
                        break;
                    case '3':
                        String scrollStr = "bdfhjlnprtvxz";
                        System.out
                            .println( "scroll(\"" + scrollStr + "\") --> "
                                + "\"" + exercise.scroll( scrollStr ) + "\"" );
                        break;
                    case '4':
                        String convStr = "von Neumann, John";
                        System.out.println(
                            "convertName(\"" + convStr + "\") --> " + "\""
                                + exercise.convertName( convStr ) + "\"" );
                        break;
                    case '5':
                        String negStr = "1001110001010101110";
                        System.out.println( "negate(\"" + negStr + "\") --> "
                            + "\"" + exercise.negate( negStr ) + "\"" );
                        break;
                    case '6':
                        String constStr1 = "0000000000000000000";
                        String constStr2 = "1001110001010101110";
                        System.out.println( "isConstant(\"" + constStr1
                            + "\") = " + exercise.isConstant( constStr1 ) );
                        System.out.println( "isConstant(\"" + constStr2
                            + "\") = " + exercise.isConstant( constStr2 ) );
                        break;
                    case '7':
                        String comment = "/* this should be gone */ int a = 0;";
                        String notComment = "/* this should stay /* int a = 0;";
                        System.out.println(
                            "removeComment(\"" + comment + "\") --> " + "\""
                                + exercise.removeComment( comment ) + "\"" );
                        System.out.println( "removeComment(\"" + notComment
                            + "\") --> " + "\""
                            + exercise.removeComment( notComment ) + "\"" );
                        break;
                    case '8':
                        String cutstr = "Hi-ho, hi-ho";
                        String cutOutstr = "-ho";
                        System.out.println( "cutOut(\"" + cutstr + "\", \""
                            + cutOutstr + "\") --> " + "\""
                            + exercise.cutOut( cutstr, cutOutstr ) + "\"" );
                        break;
                    case '9':
                        String htmlStr = "Strings are <b>immutable</b>";
                        System.out.println(
                            "removeHtmlTags(\"" + htmlStr + "\") --> " + "\""
                                + exercise.removeHtmlTags( htmlStr ) + "\"" );
                        break;
                    case 'A':
                    case 'a':
                        String digitStr = "123456789";
                        String dStr = "1234V5678";
                        System.out.println( "onlyDigits(\"" + digitStr
                            + "\") = " + exercise.onlyDigits( digitStr ) );
                        System.out.println( "onlyDigits(\"" + dStr + "\") = "
                            + exercise.onlyDigits( dStr ) );
                        break;
                    case 'B':
                    case 'b':
                        String validISBN = "096548534X";
                        String invalidISBN = "1234567890";
                        System.out.println( "isValidISBN(\"" + validISBN
                            + "\") = " + exercise.isValidISBN( validISBN ) );
                        System.out.println( "isValidISBN(\"" + invalidISBN
                            + "\") = " + exercise.isValidISBN( invalidISBN ) );
                        break;
                    case 'C':
                    case 'c':
                        String str = "The quick brown fox";
                        System.out.println( "shuffle(\"" + str + "\") --> "
                            + "\"" + exercise.shuffle( str ) + "\"" );
                        System.out.println( "shuffle(\"" + str + "\") --> "
                            + "\"" + exercise.shuffle( str ) + "\"" );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
