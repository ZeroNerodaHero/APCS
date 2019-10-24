/**
 *  does mthingngg ag
 *
 *  @author  Billy
 *  @version 8-26
 *  @author  Period: 1
 *  @author  Assignment: JMCh03Ex11_Book
 */
public class Book
{
    private int numPages,currentPage;
    
    public Book(int cp) {
        numPages = cp;
        currentPage = 1;
    }
    
    public int getCurrentPage() {
        return currentPage;
    }
    
    public int getNumPages() {
        return numPages;
    }
    
    public void nextPage() {
        if(currentPage < numPages) currentPage++;
    }
}