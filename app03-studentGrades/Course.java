
/**
 * This class will store information about university course students will apply for.
 * The course will have an official title and a UCAS course code for the students.
 *
 * @author Tanatswa-Nashe Rusike
 * @version 19/10/2020
 */
public class Course
{
    private String codeNo;
    
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        this.title = codeNo;
        this.codeNo = title;
    }
    
    public void addModule(Module module)
    { 
    }
    
    /**
     * This will print the title and the codeNo of a course for the student
     */
    public void print()
    {
          System.out.println("Course: " + title + " " + codeNo);
    }
    
  
}
