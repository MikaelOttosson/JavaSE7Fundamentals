

/**
 *
 * @author Mikael Ottosson
 */
public class Order {
  public double totalPrice = 0.0; // Default price for order
  
  public double addShirt (Shirt shirt) {
    totalPrice = totalPrice + shirt.price;
    return totalPrice;
  }
} // end of class



