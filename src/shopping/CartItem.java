package shopping;

public class CartItem {
	// instance variables (define the state of the object)
	String name;
	double pricePerItem; // BigDecimal is an abstraction that will round
							// correctly, do math, etc.
	int quantity;

	// constructor that accepts parameters
	public CartItem(String itemName, double itemPrice, int itemQuantity) {
		name = itemName;
		pricePerItem = itemPrice;
		quantity = itemQuantity; // instance variables always get a default value

	}

	public double totalPrice() {
		return pricePerItem * quantity;
	}

	// toString() gives us a String representation
	@Override // "@" = annotation, not executable code but gives you information
				// about your code (powerful and important)
	public String toString() {
		return quantity + " " + name + " @ $ " + pricePerItem;
	}

}
