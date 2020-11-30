
/**
 * The Stock App will provide a user interface to the
 * stock manager. This will allow users to be in control to add, edit,
 * print and remove any stock products they choose. 
 *
 * @author Tanatswa-Nashe Rusike
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
    }

    /**
     * The run method prints out the heading and it will allow users to 
     * choose from the menu.
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * The menu includes user input of choices of products they choose and 
     * prints them.
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            finished = true;
        }
    }
    
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Student Name");
        System.out.println("******************************");
    }
}
