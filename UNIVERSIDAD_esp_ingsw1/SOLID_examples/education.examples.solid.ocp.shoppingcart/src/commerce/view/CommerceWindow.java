package commerce.view;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import commerce.model.Commerce;
import commerce.model.Product;
import commerce.model.Item;
import commerce.util.CommerceData;
import swing2swt.layout.BorderLayout;

public class CommerceWindow {

	protected Shell shell;
	private NewItemComposite newItemComposite;
	private CartComposite cartComposite;
	private Commerce commerce;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CommerceWindow window = new CommerceWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public CommerceWindow() {
		commerce = new Commerce();
	}
	
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Commerce Application");
		shell.setLayout(new BorderLayout(0, 0));
		
		newItemComposite = new NewItemComposite(this, shell, SWT.NONE);
		newItemComposite.setLayoutData(BorderLayout.NORTH);
		
		cartComposite = new CartComposite(shell, SWT.NONE);
		cartComposite.setLayoutData(BorderLayout.CENTER);
		
		loadProducts();

	}
	
	public void loadProducts() {
		newItemComposite.loadProduct(CommerceData.PRODUCTS);
	}
	
	public void addItemToCart() {
		try {
			Product product = newItemComposite.getProduct();
			int quantity = newItemComposite.getQuantity();			
			commerce.addItemToCart(product, quantity);
			cartComposite.refreshCart(commerce.getCart());
		} catch (QuantityFormatException e) {
			MessageDialog.openError(shell, "Error", e.getMessage());
		}
	}
	
	public void removeItemFromCart() {
		Item item = cartComposite.getSelectedItem();
		if(item == null) {
			MessageDialog.openWarning(shell, "Warning", "You must select an item first");
		} else {
			commerce.removeItemFromCart(item);
			cartComposite.refreshCart(commerce.getCart());
		}
	}
	
	public void buyProductsFromCart() {
		commerce.buyProductsFromCart();
		cartComposite.refreshCart(commerce.getCart());
		MessageDialog.openInformation(shell, "Info", "Succesfull purchase!");
	}
	
	public void viewCommerceTotalMoney() {
		double totalMoney = commerce.getTotalMoney();
		MessageDialog.openInformation(shell, "Info", "Commerce total money: " + totalMoney);
	}
}
