import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


/**
 * A <code>Jumper</code> is an actor that will jump over Rocks and Flowers and
 * turn. A jumper can remove another jumper by jumping on them.
 * 
 * @author TODO Your Name(s)
 * @version TODO Date
 * @author Period: TODO
 * @author Assignment: GridWorld_Part3_Jumper
 * 
 * @author Sources: TODO
 */
public class Jumper extends Bug implements Edible
{
    /**
     * check if can move
     */
    @Override
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if ( gr == null )
        {
            return false;
        }
        Location c = getLocation();
        Location next = c.getAdjacentLocation( getDirection() );
        if ( !gr.isValid( next ) )
        {
            return false;
        }
        //////// second
        next = next.getAdjacentLocation( getDirection() );
        if ( !gr.isValid( next ) )
        {
            return false;
        }
        Actor neighbor = gr.get( next );
        return ( neighbor == null ) || ( neighbor instanceof Edible );
    }

    /**
     * moves the bug
     */
    @Override
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if ( gr == null )
        {
            return;
        }
        Location c = getLocation();
        Location next = c.getAdjacentLocation( getDirection() );
        next = next.getAdjacentLocation( getDirection() );
        if ( gr.isValid( next ) )
        {
            moveTo( next );
        }
        else
        {
            removeSelfFromGrid();
        }
    }

    /**
     * acts calls super
     */
    @Override
    public void act()
    {
        super.act();
    }

    /**
     * calls super
     */
    @Override
    public int getDirection()
    {
        return super.getDirection();
    }

    /**
     * calls super
     */
    @Override
    public Location getLocation()
    {
        return super.getLocation();
    }

}