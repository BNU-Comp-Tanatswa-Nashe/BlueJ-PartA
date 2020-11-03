
/**
 * This class will store information about university course 
 * students will apply for.
 * The course will have an official title and a UCAS course code 
 * for the students.
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
    
    private int  finalMark;
        
    private Grades finalGrade;
        
    
  /**
  * Constructor for the  objects of class Course
  */
  public Course(String codeNo, String title)
  {
        // initialise instance variables 
        this.title = codeNo;
        this.codeNo = title;
        
       
        module1 = new Module( " Programming Concepts", "CO452");
        module2 = new Module( " Financial Decion Making", "BM414");
        module3 = new Module( " Data Insight for Business", "MG413");
        module4 = new Module( " Digital Technologies", "CO454");
        
  }
    
  public void addMark(int mark, int moduleNo)
  { 
        if(moduleNo == 1)
        {
           module1.awardMark(mark);
        }
  }
   
  /**
  * This will print the title and the codeNo
  * of a course for the student
  */
  public void print()
  {
          System.out.println("Course: " + title + " " + codeNo);
  }
    
  /**
  * Marks have been added to each module of the course.
  */
  public Grades convertToGrade(int mark)
  {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
  }
    
  /**
   * Marks added to a module of a course
   */ 
   public Grades convertToGrade(int mark)
  {
        if((mark >= 0) && (mark < 50))
        {
            return Grades.D;
        }
  }

  /**
   * Marks added to a module of a course
   */
  public Grades convertToGrade(int mark)
  {
        if((mark >= 0) && (mark < 60))
        {
            return Grades.C;
        }
  }

  /**
   * Marks added to a module of a course
   */
  public Grades convertToGrade(int mark)
  {
        if((mark >= 0) && (mark < 70))
        {
            return Grades.B;
        }
  }

  
  /**
   * Marks added to a module of a course
   */
  public Grades convertToGrade(int mark)
  {
        if((mark >= 100) && (mark < 0))
      {
            return Grades.A;
      }
      
      return Grades.X;
  } 
}