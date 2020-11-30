/**
 * The code demonstrates the class of Stock Manager and Product class.
 * The class will be functional as the coding for the class will be 
 * complete.
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Tanatswa-Nashe Rusike
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * A StockManager class with 10 products of stock.
     * 
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(132, "Nokia"));
        manager.addProduct(new Product(37,  "Blackberry"));
        manager.addProduct(new Product(23,  "Huawei"));
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(32,  "Iphone 11 Pro Max"));
        manager.addProduct(new Product(43,  "Iphone 6s"));
        manager.addProduct(new Product(56,  "Iphone 6s Max"));
        manager.addProduct(new Product(344, "Samsung Galazy S10")); 
        manager.addProduct(new Product(121, "Iphone 5"));
        manager.addProduct(new Product(890, "Iphone 10s Max"));
    }
    
    /**
     * Details of the product are shown and the products are restocked 
     * and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(132, 1);
        manager.delivery(37, 2);
        manager.delivery(23, 2);
        manager.delivery(101, 4);
        manager.delivery(32, 5);
        manager.delivery(43, 7);
        manager.delivery(56, 9);
        manager.delivery(344, 6);
        manager.delivery(121,3);
        manager.delivery(890, 5);
        
        manager.printAllProducts();
    }
    
    /**
     * Details of a given product will be shown here. When the product,
     * its name and stock quantity will be shown here.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demosellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne(id);
            showDetails(id);
        }
    }
    
    /**
     * A product with correct ID must be given from the manager
     * An error message is printed if there is no match with the ID.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
