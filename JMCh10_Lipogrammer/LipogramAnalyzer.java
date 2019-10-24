/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - JMCh10 Lipogrammer
 * 
 * @author Sources - TODO list collaborators
 */
public class LipogramAnalyzer
{
    private String text;


    /**
     * Constructor: Saves the text string
     * 
     * @param text
     *            String to analyze
     */
    public LipogramAnalyzer( String text )
    {
        this.text = text;
    }


    /**
     * Returns the text string with all characters equal to letter replaced with
     * '#'.
     * 
     * @param letter
     *            character to replace
     * @return text string with all characters equal to letter replaced with '#'
     */
    public String mark( char letter )
    {
        String wow = "";
        for ( int i = 0; i < text.length(); i++ )
        {
            if ( text.charAt( i ) == letter )
            {
                wow += '#';
            }
            else
            {
                wow += text.charAt( i );
            }
        }
        return wow; // !!!Fix this
    }


    /**
     * Returns a String that concatenates all "offending" words from text that
     * contain letter; the words are separated by '\n' characters; the returned
     * string does not contain duplicate words: each word occurs only once;
     * there are no punctuation or whitespace characters in the returned string.
     * 
     * @param letter
     *            character to find in text
     * @return String containing all words with letter
     */
    public String allWordsWith( char letter )
    {
        String k = text + " ";
        String result = "";
        for ( int i = 0; i < k.length(); i++ )
        {
            if ( k.charAt( i ) == letter )
            {
                String res = extractWord( i );
                boolean flag = false;
                for ( int j = 0; j < result.length(); j++ )
                {
                    int s = 0;
                    while ( s < res.length()
                        && result.charAt( j ) == res.charAt( s ) )
                    {
                        j++;
                        s++;
                    }
                    if ( s == res.length() && result.charAt( j ) == '\n' )
                    {
                        flag = true;
                        break;
                    }
                    else
                    {
                        while ( result.charAt( j ) != '\n' )
                        {
                            j++;
                        }
                    }
                }
                if ( flag )
                {
                    continue;
                }
                result += res + '\n';
                while ( i < k.length()
                    && ( ( k.charAt( i ) >= 'A' && k.charAt( i ) <= 'Z' )
                        || ( k.charAt( i ) >= 'a' && k.charAt( i ) <= 'z' ) ) )
                {
                    i++;
                }
            }
        }

        return result;
    }


    /**
     * Returns the word that contains character at pos excluding any punctuation
     * or whitespace.
     * 
     * @param pos
     *            location of character
     * 
     * @return word that contains character at pos
     */
    public String extractWord( int pos )
    {
        int l = pos;
        int r = pos;
        // System.out.println(pos + " " + text.charAt(pos));
        while ( l > 0 && ( ( text.charAt( l ) >= 'A' )
            && ( text.charAt( l ) <= 'Z' )
            || ( text.charAt( l ) >= 'a' ) && ( text.charAt( l ) <= 'z' ) ) )
        {
            // System.out.println("errror");
            l--;
        }
        while ( r < text.length() && ( ( text.charAt( r ) >= 'A' )
            && ( text.charAt( r ) <= 'Z' )
            || ( text.charAt( r ) >= 'a' ) && ( text.charAt( r ) <= 'z' ) ) )
        {
            r++;
        }
        // System.out.println("weeedo dfdfd " + l + ' ' + r + " " +
        // text.substring(l,r));
        // System.out.println();
        if ( ( text.charAt( l ) >= 'A' ) && ( text.charAt( l ) <= 'Z' )
            || ( text.charAt( l ) >= 'a' ) && ( text.charAt( l ) <= 'z' ) )
        {
            return text.substring( l, r );
        }
        else
        {
            return text.substring( l + 1, r );
        }
    }

}
