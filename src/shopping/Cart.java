package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<CartItem> items = new ArrayList<CartItem>();

	public void addItem(CartItem toAdd) {
		items.add(toAdd);
	}

	@Override
	public String toString() {
		return "Cart with items: " + items;
	}

	public double totalPrice() {
		double cartTotal = 0; // local variables are not automatically given a
								// default value, you must initialize
		for (CartItem currentItem : items) {
			cartTotal = cartTotal + currentItem.totalPrice();
		}
		return cartTotal;
	}
}
