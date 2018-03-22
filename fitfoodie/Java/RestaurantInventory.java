
public class RestaurantInventory implements Searchable, SearchableByProfile {
	private Restaurant[] restaurants;
	public int addRestaurant(String name, String street, int zip,String city, String state, double rating){
			return -1; // Return some integer for now
	}
	
	public boolean deleteRestaurant(int restaurantId){
		return false; //Stub - needs to be implemented
	}
	
	public int lookupRestaurantId(String name){
		return -1; // Return some integer for now
	}
	
	public boolean addMealToRestaurant(int id, Meal meal){
		return false; //Stub
	}
	
	public long generateUniqueId(){
		return 1234; //Random
	}
	
}
