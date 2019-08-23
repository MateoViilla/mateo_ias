package commerce.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Item> items;

	public Cart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		item.setNumber(items.size() + 1);
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public double calculateTotal() {
		double total = 0d;
		for (Item item : items) {
			total += item.calculateTotal();
		}
		return total;
	}
	
	public void clear() {
		items.clear();
	}
	
	
}
