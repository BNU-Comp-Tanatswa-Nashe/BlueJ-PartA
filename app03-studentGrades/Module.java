
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

    public void print ()
    {
        System.out.println("Module: " + codeNo +
        " " + title + " Mark = " + mark); 
    
    }
}
