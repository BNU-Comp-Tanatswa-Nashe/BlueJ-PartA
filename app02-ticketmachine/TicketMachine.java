/**
 * update the comment here. 
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Tanatswa-Nashe Rusike
 */
public class TicketMachine
{
   
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private Ticket highwycombeTicket;
    private Ticket amershamTicket;
    private Ticket aylesburyTicket;
    private Ticket userTicket;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int price)
    {
       
        balance = 0;
        total = 0; 
        
        highwycombeTicket = new Ticket("HighWycombe", 300);
        amershamTicket = new Ticket("Amersham", 330);
        aylesburyTicket = new Ticket("Aylesbury", 220);
        userTicket = null;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    public void selectAmershamTicket()
    {
        userTicket = amershamTicket;
    }
    
    public void selectAylesburyTicket()
    {
        userTicket = aylesburyTicket;
    }
    
    public void selectHighWycombeTicket()
    {
        userTicket = highwycombeTicket;
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int price = userTicket.getPrice();
        
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            userTicket.print ();
            System.out.println("# " + price + " pence.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    public void insert10pence()
    {
        balance = balance + 10;
    }
    
    
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
