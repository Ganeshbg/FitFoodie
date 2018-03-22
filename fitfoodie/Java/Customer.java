
public class Customer extends RegisteredUser implements SearchByProfileInterface{
	
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
	
	public Restaurant [] searchMealOnProfile(Profile p){
		
		return null;
	}

}
