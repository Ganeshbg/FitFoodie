
public interface Searchable {
	public Restaurant[] searchMealByLocation(Location address);
	public Restaurant[] searchMealByCuisine(Cuisine cuisine);
	public Restaurant[] searchMealByRadius(int radius);
	public Restaurant[] searchMealByDietType(DietType dietType);
	public Restaurant[] searchMealByRestaurantName(String name);
	public Restaurant[] searchMealByNutrientQuantity(Nutrient nutrient);
}
