import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * @author Tanatswa-Nashe Rusike
 * @version (08/11/2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a given product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
{
    Product product = findProduct(id);
    if(product != null)
    {
        product.increaseQuantity(amount);
        System.out.println("Product Delivered : " + product);
    }
}
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * The method will print details of each product. If found, the
     * name and the stock quantity of the product will show.
     * @param id The ID of the product to look for. 
     */
    public void printProductDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            System.out.println(product.toString());
        }
    }
    
    /** 
     * The method will print out the product in the stock in the order
     * they are titled inside the stock list.
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Tanatswa's Stock List");
        System.out.println("======================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
            
        System.out.println();
    } 
    
    public void printHeading()
    {
        System.out.println("Tanatswa's Stock List");
        System.out.println("=======================");
        System.out.println();
    }
    /**
     * Method prints out all stock in the stock list with it's given ID.
     */
    public void PrintStock()
    {
        printHeading();
        
        for(Product product : stock)
        {
             System.out.println(product);
        }
    }
}