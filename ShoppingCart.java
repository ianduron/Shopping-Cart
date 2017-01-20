/**
 *Model an online shopping cart
 *@author Ian Duron
 */
public class ShoppingCart
{
    private double subtotal;
    /**
     *Constructs the subtotal value
     */
    public ShoppingCart()
    {
        subtotal = 0;
    }

    /**
     * @param cost adds this cost to the subtotal value for this ShoppingCart
     */
    public void add(double cost)
    {
        double addCost = subtotal + cost;
        subtotal = addCost;
    }

    /**
     * @param cost subtracts this cost from the subtotal for this ShoppingCart
     */
    public void remove(double cost)
    {
        double removeCost = subtotal - cost;
        subtotal = removeCost;
    }

    /**
     *  gets the subtotal for this ShoppingCart
     *  @return subtotal
     */
    public double getSubtotal()
    {
        return subtotal;
    }

}
