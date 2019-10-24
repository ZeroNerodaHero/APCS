/**
 *this is a teacher's profile
 * when u create it, it uses person as an inheritance 
 *  @author  NomNom150
 *  @version Oct 19, 2019
 *  @author  Period: TODO
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: me
 */
public class Teacher extends Person
{
    private String mySubject;

    private double mySalary;


    /**
     * this is the constructor that class; calls super
     * 
     * @param n
     *            name
     * @param a
     *            age
     * @param g
     *            gender
     * @param s
     *            subject
     * @param sal
     *            string
     */
    public Teacher( String n, int a, String g, String s, double sal )
    {
        super( n, a, g );
        this.mySubject = s;
        this.mySalary = sal;
    }


    /**
     * this gets the subject
     * 
     * @return the subject it is
     */
    public String getSubject()
    {
        return mySubject;
    }


    /**
     * this returns the salary
     * 
     * @return the salary it is
     */
    public double getSalary()
    {
        return mySalary;
    }


    /**
     * the subject is set with something else
     * 
     * @param s
     *            replaces the current subject
     */
    public void setSubject( String s )
    {
        this.mySubject = s;
    }


    /**
     * the salary is replaced
     * 
     * @param s
     *            relaces the current salary
     */
    public void setSalary( double s )
    {
        this.mySalary = s;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject + ", salary: "
            + mySalary;
    }
}
