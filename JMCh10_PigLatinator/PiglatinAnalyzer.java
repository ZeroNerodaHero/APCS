import java.util.Scanner;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - TODO Assignment Name
 * 
 * @author Sources - TODO list collaborators
 */
public class PiglatinAnalyzer
{
    private String text;


    // Constructor: saves the text string
    public PiglatinAnalyzer( String text )
    {
        System.out.println( "ran?" );
        this.text = text;
        System.out.println( "????" + text );
    }


    /**
     * Converts a string to it piglatin form according to the following rules:
     * a. If there are no vowels in englishWord, then pigLatinWord is just
     * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u',
     * and their uppercase counterparts.) b. Else, if englishWord begins with a
     * vowel, then pigLatinWord is just englishWord + "yay". c. Otherwise (if
     * englishWord has a vowel in it and yet doesn't start with a vowel), then
     * pigLatinWord is end + start + "ay", where end and start are defined as
     * follows: 1. Let start be all of englishWord up to (but not including) its
     * first vowel. 2. Let end be all of englishWord from its first vowel on. 3.
     * But, if englishWord is capitalized, then capitalize end and
     * "uncapitalize" start.
     *
     * @return piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {

        String ToT = text;
        String translation = "";

        for ( int i = 0; i < ToT.length(); i++ )
        {
            if ( isPun( i ) )
            {
                translation += ToT.charAt( i );
            }
            else
            {
                int j = i;
                while ( j < ToT.length() && !isPun( j ) )
                {
                    j++;
                }
                ;
                // System.out.println("wtf " + i+ " " + j);
                // System.out.println("\t"+ToT.substring(i,j));
                translation += wordToPigLatin( ToT.substring( i, j ) );
                i = j-1;

            }
        }
        return translation;
    }


    /**
     * Converts an "english" word to its piglatin form
     *
     * @param englishWord
     *            a string representing an english word
     * @return piglatin form of the english word
     */
    public String wordToPigLatin( String englishWord )
    {
        if ( englishWord.length() < 1 )
        {
            // System.out.println(englishWord);
            return englishWord;
        }
        String pigLatinWord = "";
        boolean isCap = false;
        if ( englishWord.charAt( 0 ) >= 'A' && englishWord.charAt( 0 ) <= 'Z' )
        {
            isCap = true;
        }
        // find first vowel

        String check = "aeiouAEIOU";
        int i;
        boolean flag = false;

        for ( i = 0; i < englishWord.length(); i++ )
        {
            for ( int j = 0; j < check.length(); j++ )
            {
                if ( englishWord.charAt( i ) == check.charAt( j ) )
                {
                    flag = true;
                    break;
                }
            }
            if ( flag )
                break;
        }
        if ( i == englishWord.length() )
        {
            return englishWord + "ay";
        }
        if ( i == 0 )
        {
            return englishWord + "yay";
        }
        if ( isCap )
        {
            englishWord = (char)( englishWord.charAt( 0 ) - 'A' + 'a' )
                + englishWord.substring( 1 );
        }
        pigLatinWord = englishWord.substring( i )
            + englishWord.substring( 0, i );
        pigLatinWord += "ay";
        if ( isCap )
        {
            pigLatinWord = (char)( pigLatinWord.charAt( 0 ) - 'a' + 'A' )
                + pigLatinWord.substring( 1 );
        }
        return pigLatinWord;
    }


    // TODO add additional helper methods
    private boolean isPun( int i )
    {
        char k = text.charAt( i );
        if ( ( k >= 'A' && k <= 'Z' ) || ( k >= 'a' && k <= 'z' ) )
        {
            return false;
        }
        return true;
    }
}