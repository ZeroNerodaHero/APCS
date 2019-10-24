// TODO add comments
/**
 * 
 * this is the profile for a college studdent it include a lot of data that is 
 * called from super person class
 *
 *  @author  NomNom150
 *  @version Oct 19, 2019
 *  @author  Period: TODO
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: me only me and other guy who wrote the things cool
 */
public class CollegeStudent extends Student
{
    private int myYear;

    private String myMajor;


    /**
     * So this is the constructor and it callls siper and then defines its own
     * fields
     * 
     * @param n
     *            name of studnet
     * @param a
     *            the age
     * @param g
     *            the gender as a string F or T
     * @param id
     *            the student id as a string
     * @param g1
     *            the gpa of the student
     * @param y
     *            is the current year of the college studnet
     * @param m
     *            is the major he or she is taking
     */
    public CollegeStudent(
        String n,
        int a,
        String g,
        String id,
        double g1,
        int y,
        String m )
    {
        super( n, a, g, id, g1 );
        this.myYear = y;
        this.myMajor = m;
    }


    /**
     * void function that returns the year
     * 
     * @return the current year of the student
     */
    public int getYear()
    {
        return myYear;
    }


    /**
     * this returns the major the student has
     * 
     * @return the major
     */
    public String getMajor()
    {
        return myMajor;
    }


    /**
     * edits the year field in this class
     * 
     * @param my
     *            the year is replaced with this
     */
    public void setYear( int my )
    {
        this.myYear = my;
    }


    /**
     * this sets the major
     * 
     * @param my
     *            resets the major
     */
    public void setMajor( String my )
    {
        this.myMajor = my;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}
