import java.lang.reflect.Field;
import java.util.Scanner;


/**
 * Coins: This class accepts a certain amount of monetary change (in cents). The
 * output is a list of the number of quarters, dimes, nickels, and pennies that
 * will make that amount of change with the least number of coins possible.
 *
 * @author Bily Zhang
 * @version 9/1
 * @author Period: 1
 * 
 * @author Assignment: Lab Activity 3.2 - Coins
 * 
 */
public class Coins
{
    public  double first,second;
    
    public Coins(int a) {
        this.first = this.second = a;
    }
    public void print() {
        System.out.println(this.first + this.second);
    }
    
    public static void main(String[] args) {
        Coins a = new Coins(22);
        a.print();
    }
}
