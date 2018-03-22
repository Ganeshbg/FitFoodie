
public class Customer extends RegisteredUser{
	
	private CustomerProfile profile;
	private ShoppingCart cart;
	
	
	public CustomerProfile getProfile() {
		return profile;
	}
	public void setProfile(CustomerProfile profile) {
		this.profile = profile;
	}
	public ShoppingCart getCart() {
		return cart;
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

}
