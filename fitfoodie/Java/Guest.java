public class Guest extends User {

	private ShoppingCart cart;

	public Guest(){}

	public ShoppingCart getShoppingCart()

	{

		return cart;

	}

	public void setShoppingCart(ShoppingCart cart)

	{

		this.cart=cart;

	}

}
