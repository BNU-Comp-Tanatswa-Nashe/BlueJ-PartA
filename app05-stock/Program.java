
/**
 * The class Program will create a Stock App include methods
 * print out a heading of the application.
 * @author (Tanatswa-Nashe Rusike)
 * @version (29/11/2020)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void runmain()
    {
        app = new StockApp();
        app.run();
    }
}
