
/**
 * Write a description of class Module here.
 *
 * @author Tanatswa-Nashe Rusike
 * @version (25/20/2020)
 */
public class Module
{ 
    private String title;
    
    private String codeNo;
    
    private int mark;
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
   
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
    }

    /**
     * Marks have been added to the module for students.
     */
    public void awardMark( int mark)
    { 
        if((mark >= 0) && (mark <= 100))
        {
          this.mark = mark;
        }
        else
        {
            System.out.print("Invalid mark!!!");
    
        }
    }
    
    public void print ()
    {
        System.out.println("Module: " + codeNo +
        " " + title + " Mark = " + mark); 
    
    }
}
