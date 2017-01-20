/**
 * Tester for the ShoppingCart class 
 * 
 * @author Kathleen O'Brien
 */
public class ShoppingCartTester
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        cart.add(10.25);
        cart.add(1.75);
        cart.add(5.50);
        System.out.println(cart.getSubtotal());
        System.out.println("Expected: 17.5");
        cart.remove(5.50);
        cart.add(3);
        System.out.println(cart.getSubtotal());
        System.out.println("Expected: 15.0");
    }
}