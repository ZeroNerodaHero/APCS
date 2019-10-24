import java.awt.*;
import javax.swing.*;


/**
 * This program draws an ornament of nested triangles
 * 
 * @author TODO Your Name
 * @version TODO Date
 * 
 * @author Period - TODO Your Period
 * @author Assignment - Ch04 Ex4-16 Ornament
 * 
 * @author Sources - TODO list collaborators
 */
public class Ornament extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background
        drawTriangles( g, 100, 80, 64 );
    }


    /**
     * 
     * TODO Write your method description here.
     * 
     * @param g
     *            grpah
     * @param x
     *            start x
     * @param y
     *            start y
     * @param r
     *            radius?
     */
    public void drawTriangles( Graphics g, int x, int y, int r )
    {
        if ( r == 2 )
            return;
        g.drawLine( x-r, y, x+r, y );
        //g.drawLine( x, y, x + r / 2, y - r / 2 );
        //g.drawLine( x + r, y, x + r / 2, y - r / 2 );
        g.drawLine( x-r, y, x, y - r);
        g.drawLine( x + r, y, x, y - r );
        
        drawTriangles( g, x-r/2, y, r / 2 );
        drawTriangles( g, x+r / 2, y, r/2 );
    }


    public static void main( String[] args )
    {
        JFrame w = new JFrame( "Triangles" );
        w.setBounds( 300, 300, 200, 120 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Ornament panel = new Ornament();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( false );
        w.setVisible( true );
    }
}
