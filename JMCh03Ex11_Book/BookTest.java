/**
 *  does mthingngg ag
 *
 *  @author  Billy
 *  @version 8-26
 *  @author  Period: 1
 *  @author  Assignment: JMCh03Ex11_Book
 */
public class BookTest
{
    /**
     * The main method in this class checks the Book operations for
     * consistency.
     * @param args is not used.
     */
    public static void main( String[] args )
    {
        Book obj = new Book(3);
        System.out.println(obj.getNumPages());
        System.out.println(obj.getCurrentPage());
        obj.nextPage();
        System.out.println(obj.getCurrentPage());
        obj.nextPage();
        System.out.println(obj.getCurrentPage());
        obj.nextPage();
        System.out.println(obj.getCurrentPage());
    }
}