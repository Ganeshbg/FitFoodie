
public abstract class Profile {

	
	
	private DietType diet;
	private Nutrient nutrients [];
	public DietType getDiet() {
		return diet;
	}
	public void setDiet(DietType diet) {
		this.diet = diet;
	}
	public Nutrient[] getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrient[] nutrients) {
		this.nutrients = nutrients;
	}
	
	
	
	
	
	public boolean deleteProfile(){
		
		return true;
	}
}
