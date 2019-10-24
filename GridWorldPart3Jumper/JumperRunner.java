import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;

/**
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  TODO Name(s)
 *  @version TODO DATE
 *  @author  Period: TODO
 *  @author  Assignment: GridWorld_Part3_Jumper
 *
 *  @author  Sources: TODO
 */
public class JumperRunner
{
    public static void main( String[] args )
    {
    	ActorWorld world = new ActorWorld();
        Jumper alice = new Jumper();
        Jumper a = new Jumper();
        Jumper al = new Jumper();
        alice.setColor( Color.ORANGE );
        world.add( new Location( 1, 3 ), alice );
        world.add( new Location( 3, 3 ), a );
        world.add( new Location( 5, 3 ), al );
        world.show();
            
        
    }
}