
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
    
    private StockManager manager;
    
    private StockDemo demo;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * The run method prints out the heading and it will allow users to 
     * choose from the menu.
     */
    public void run()
    {
      boolean finished = false;
        
        while(!finished)
        {
            printMenuChoices();
           
            String choice = input.getString("Please enter your choice");
            choice = choice.toLowerCase();
            
            if(choice.equals("quit"))
               finished = true; 
            else 
                executeMenuChoice(choice);
        }
    }
    
    /**
     * The String choice will allow execution of choices from user input. The user can
     * select a product they want to add.
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
           addProduct();
        }
        else if (choice.equals("printall"))
        {
            manager.printAllProducts();
        }
    }
    
    public void addProduct()
    {
        int id = input.getInt("Please enter the product Id");
        String name = input.getString("Please enter the product name");
        
        Product product = new Product(id, "Name");
        manager. addProduct(product);
    }
    
     public void removeProduct()
    {
        int id = input.getInt("Please enter the product Id");
        
        
       
        // manager. removeProduct(id);
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
        System.out.println("    App05: by Tanatswa-Nashe Rusike");
        System.out.println("******************************");
    }
}
