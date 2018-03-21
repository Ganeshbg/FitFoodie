
public class Meal {
	private String name;
	private DietType type;
	private int calories;
	private double price;
	private Nutrient[] nutrient;
	private String ingredients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DietType getType() {
		return type;
	}
	public void setType(DietType type) {
		this.type = type;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Nutrient[] getNutrient() {
		return nutrient;
	}
	public void setNutrient(Nutrient[] nutrient) {
		this.nutrient = nutrient;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
}
