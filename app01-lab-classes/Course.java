
/**
 * This class will store information about university course students will apply for.
 * The course will have an official title and a UCAS course code for the students.
 *
 * @author Tanatswa-Nashe Rusike
 * @version 19/10/2020
 */
public class Course
{
    private String title;
    
    private String codeNo;
    
    /**
     * 
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }
    
}
