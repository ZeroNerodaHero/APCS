import info.gridworld.actor.*;
import info.gridworld.grid.*;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Jumper tests:.
 *  test01 - jumper next to edge of grid - should turn
 *  test02 - jumper 2 from edge of grid - should turn
 *  test03 - TODO Description
 *  test04 - TODO Description
 *  test05 - TODO Description
 *  test06 - TODO Description
 *  test07 - TODO Description
 *
 *  @author  TODO Your Name(s)
 *  @version TODO Date
 *
 *  @author  Period: TODO
 *  @author  Assignment - GridWorld Part 3 Jumper
 *
 *  @author  Sources: TODO
 */
public class JUJumperTest
{
    /*
     * Variables used by the test methods.
     */
    private Grid<Actor> grid;
    private ActorWorld world;
    private Jumper jumper1;

    /**
     * Invoked before each test to instantiate the objects
     * used for every test.
     */
    @Before public void initialize()
    {
        grid = new BoundedGrid<Actor>(8, 8);
        world = new ActorWorld(grid);
        jumper1 = new Jumper();
    }

    /**
     * test01 - jumper next to edge of grid - should turn
     */
    @Test
    public void jumperNextToEdgeOfGridShouldTurn()
    {
        Location loc = new Location(0, 3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testOccupied(loc, jumper1, Location.NORTHEAST));
    }

    /**
     * test02 - jumper 2 from edge of grid - should turn.
     */
    @Test
    public void jumper2FromEdgeOfGridShouldTurn()
    {
        Location loc = new Location(1, 3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testOccupied(loc, jumper1, Location.NORTHEAST));
    }

    /**
     * test03 - tests if it will eat another jumper
     */
    @Test
    public void test03()
    {
        Jumper jumper2 = new Jumper();
        Location loc = new Location(4,3);
        Location loc1= new Location(6,3);
        world.add(loc, jumper1);
        world.add(loc1, jumper2);
        jumper2.act();
        assertTrue(testOccupied(loc, jumper2, Location.NORTH));
    }

    /**
     * test04 - test if it will eat a flower
     */
    @Test
    public void test04()
    {
        Flower f = new Flower();
        Location loc = new Location(4,3);
        Location loc1= new Location(6,3);
        world.add(loc, f);
        world.add(loc1, jumper1);
        jumper1.act();
        assertTrue(testOccupied(loc1, jumper1, Location.NORTHEAST));
    }

    /**
     * test05 - normal move
     */
    @Test
    public void test05()
    {
        Location loc = new Location(6, 3);
        Location loc1 = new Location(4,3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testOccupied(loc1, jumper1, Location.NORTH));
    }

    /**
     * test06 - actor not eddible
     */
    @Test
    public void test06()
    {
        Bug b = new Bug();
        Location loc = new Location(4,3);
        Location loc1= new Location(6,3);
        world.add(loc1, jumper1);
        world.add(loc, b);
        jumper1.act();
        assertTrue(testOccupied(loc1, jumper1, Location.NORTHEAST));
    }

    /**
     * test07 - does not leaves flower
     */
    @Test
    public void test07()
    {
        Location loc = new Location(6, 3);
        //Location loc1 = new Location(4,3);
        world.add(loc, jumper1);
        jumper1.act();

        assertTrue(testEmpty(loc) ); 
    }

    /**
     * Test helper method to test for empty location.
     *
     * @param loc null location if empty
     * @return true if all assertions pass
     */
    private boolean testEmpty(Location loc)
    {
        Actor empty = grid.get( loc );
        assertNull( "<<<<< " + loc + " should be empty. >>>>>", empty );

        return true;
    }

    /**
     * Test helper method to test that object is in a location, and has
     * a consistent loc, and direction dir.
     *
     * @param loc location that should be occupied
     * @param a   actor that should be in location loc
     * @param dir direction this actor should be facing
     * @return true if all assertions pass
     */
    private boolean testOccupied(Location loc, Actor a, int dir)
    {
        Actor found = grid.get( loc );
        assertSame( "<<<<< " + loc + " should contain the actor. >>>>>",
            a, found );
        assertEquals( "<<<<< Loc should be " + loc + " >>>>>",
            loc, found.getLocation() );
        assertEquals( "<<<<< Dir should be " + dir + " >>>>>",
            dir, found.getDirection() );

        return true;
    }
}