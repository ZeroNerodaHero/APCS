import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

/**
 *  TODO Write a one-sentence summary of your class here.
 *
 *  @author  TODO your name
 *  @version TODO date
 *  @author  Period: TODO your period
 *  @author  Assignment: JMCh06_10PieChart
 *
 *  @author  Sources: TODO list collaborators
 */
public class PollTest
{
    /**
     * does make graph or m
     * 
     * @param args
     *            useless
     */
    public static void main(String[] args) {
        PollDisplayPanel vm = new PollDisplayPanel("Tami","Brian","Liz");
        vm.vote1();
        vm.vote2();
        vm.vote2();
        System.out.println(vm);
    }
}
