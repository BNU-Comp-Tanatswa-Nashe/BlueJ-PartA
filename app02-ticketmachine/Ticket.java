import java.util.Date;

/**
 * The ticket will show the amount inserted and purchased from the class.
 *
 * @author Tanatswa-Nashe Rusike
 * @version (27/10/2020)
 */
public class Ticket
{
    // Journey Destination
    private String destination;
    
    // This is the ticket price in pence
    private int price;
    
    // The date and time the ticket was issued
    private Date dateStamp;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        dateStamp = new Date();
        this.destination = destination;
        this.price = price;
    } 
    /**
     * Return the string for the ticket's destination
     */
    public String getDestination()
    {
        return destination;
    }
   
    /**
     * The print method will print out the ticket 
     */
    public void print()
    { 
        System.out.print(" Ticket to " + destination);
        System.out.println(" cost " + price + "p" );
        System.out.println(" Issued: " + dateStamp);
    }
}
