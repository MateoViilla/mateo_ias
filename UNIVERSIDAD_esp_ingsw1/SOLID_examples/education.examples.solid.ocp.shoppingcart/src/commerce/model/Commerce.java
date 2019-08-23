package commerce.model;

public class Commerce {
	
	private Cart cart;
	private double totalMoney;
	
	public Commerce() {
		cart = new Cart();
	}
	
	public void addItemToCart(Product product, int quantity) {
		Item item = new Item(product, quantity);
		cart.addItem(item);
	}
	
	public void removeItemFromCart(Item item) {
		cart.removeItem(item);
	}
	
	public void buyProductsFromCart() {
		totalMoney += cart.calculateTotal();
		cart.clear();
	}
	
	public double getTotalMoney() {
		return totalMoney;
	}
	
	public Cart getCart() {
		return cart;
	}
	
}
