package naumenko.com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.setModel("MINI Cooper CountryMan");
        System.out.println( "I'm gonna buy ... " + car.getModel() );
    }
}
