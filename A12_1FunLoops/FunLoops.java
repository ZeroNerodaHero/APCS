/**
   A class to solve various loop problems
  
   @author  TODO Your Name
   @version TODO Date

   Period - TODO Your Period
   Assignment - A12.1 - FunLoops

   Sources - TODO list collaborators
 */
public class FunLoops
{
  public void magicsquare( int n )
  {
    System.out.println("Magic Squares");
    long run = 1;
    int c =2,cb = 1;
    for(int i = 0; cb <= n;i++) {
        long m = i * i;
        for(; run < m;) {
            long diff = m - run;
            if(diff < run) {
                ren += c;
            }
            run += c;
            System.out.println(c+" "+run);
        }
        //System.out.println("m "+m);
        if(run == m) {
            System.out.println(cb+": "+run);
            cb++;
        }
        //System.out.println();
    }
    System.out.println("t "+run);
  }

  
  public int gcd(int a, int b) {
      if(a == 0) return b;
      return gcd(b%a,a);
  }
  
  public int lcm( int a, int b )
  {
      return (a*b)/gcd(a,b);  // Fix this
  }

  public static void main(String[] args)
  {
    FunLoops fun = new FunLoops();

    fun.magicsquare(4);
    System.out.println();
    
    System.out.println("LCM (15, 18) = " + fun.lcm(15,18));
    System.out.println("LCM (40, 12) = " + fun.lcm(40,12));
    System.out.println("LCM (2, 7) = " + fun.lcm(2,7));
    System.out.println("LCM (100, 5) = " + fun.lcm(100,5));
    System.out.println();

    fun.magicsquare(10);
  }
}

/*
 * 2000968034
 * 2001936537545396595 
 * 1600000001
 * 1280000002400000001
 * 720000001800000001
 * 1583407981
 * 2507180834294496361
 * 
 * 
 */
