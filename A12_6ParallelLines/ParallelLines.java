import java.awt.*;
import javax.swing.*;


/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 *          Period - TODO Your Period Assignment - A12.6 - ParallelLines
 * 
 *          Sources - TODO list collaborators
 */
public class ParallelLines extends JPanel
{
    private static final int CURL = 25;
    // TODO Your Instance Variables Here


    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * TODO Write your method description here.
     * 
     * @param g
     * @param width
     * @param height
     * @param size
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        for ( int row = 0; row < 8; row++ )
        {
            // calculate the start of the row of squares
            // calculate and add a horizontal offset
            int vert = 0 + row * CURL;
            int hori = 0;

            if ( row % 4 == 1 || row % 4 == 3 )
                hori += CURL / 2;
            if ( row % 4 == 2 )
                hori += CURL;
            for ( int col = 0; col < 7; col++, hori += 2 * CURL )
            {
                //System.out.println( hori );
                g.fillRect( hori, vert, CURL, CURL );
            }
            vert += CURL;
            g.drawLine( 0, vert, 14 * CURL, vert );
        }
    }


    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
