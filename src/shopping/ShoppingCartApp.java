package shopping;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		CartItem mangoes = new CartItem("mango", 1.25, 4);
		System.out.println(mangoes);
		System.out.println(mangoes.totalPrice());
		
		cart.addItem(mangoes);
		
		CartItem avocados = new CartItem("avocado", 1.79, 3);
		System.out.println(avocados);
		System.out.println(avocados.totalPrice());

		cart.addItem(avocados);
		
		System.out.println(cart);
		System.out.println("Total price is " + cart.totalPrice());
		
	}

}
