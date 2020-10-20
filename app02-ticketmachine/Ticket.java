import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Tanatswa-Nashe Rusike
 * @version (a version number or a date)
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    // this is the ticket price in pence
    private int price;
    
    // The date and time the ticket was issued
    private Date timeStamp;
    
    /**
     * Constructor for objects of class Ticket setting the
     * desitnation and price.  The date will contain
     * the current system date and time
     */
    public Ticket(String destination, int price)
    {
        timeStamp = new Date();
        this.destination = destination;
        this.price = price;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Ticket " + destination + 
            " Price : " + price + 
            " Issued " + timeStamp);
    }
    // The ticket can be printed without returning
    
    /**
     * 
     */public void Print()
    {
        System.out.println(
    }
    
}
