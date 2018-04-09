package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	private List<Meal> foodlist = new ArrayList<>(Arrays.asList(
			new Meal("Jamoon", new Restaurant(1,"Kathmandu",new Address("001","Colorado Ave", new Area("80303","Boulder","CO","USA")),4.6), 410, 3.52,
					new ArrayList<>(Arrays.asList(new Protein(1), new Carbohydrates(2), new Fat(3)))),
			new Meal("Masala Dosa", new Restaurant(1,"Masalas",new Address("002","Arapahoe Ave", new Area("80304","Boulder","CO","USA")),4.7), 420, 4.2,
					new ArrayList<>(Arrays.asList(new Protein(2), new Carbohydrates(3), new Fat(4)))),
			new Meal("Samosa", new Restaurant(1,"Taj",new Address("003","Arapahoe Ave", new Area("80305","Boulder","CO","USA")),4.5), 445, 6.2,
					new ArrayList<>(Arrays.asList(new Protein(3), new Carbohydrates(4), new Fat(5)))),
			new Meal("Biryani", new Restaurant(1,"Bawarchi",new Address("004","Arapahoe Ave", new Area("80305","Boulder","CO","USA")),4.2), 310, 7.2,
					new ArrayList<>(Arrays.asList(new Protein(10), new Carbohydrates(3), new Fat(2))))));

	public List<Meal> getAllMeal() {
		return foodlist;
	}

	public Meal getMeal(String id) {
		return foodlist.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addMeal(Meal food) {
		foodlist.add(food);

	}

	public void updateMeal(Meal meal, String id) {
		for (int i = 0; i < foodlist.size(); i++) {
			Meal f = foodlist.get(i);
			if (f.getId().equals(id)) {
				foodlist.set(i, meal);
				return;
			}
		}

	}

	public void deleteMeal(String id) {
		foodlist.removeIf(t -> t.getId().equals(id));
	}

	public List<Meal> getMealByNutrient(String nutrient, String quantity) {
		int quant = Integer.parseInt(quantity);
		List<Meal> foodbynutrient = new ArrayList<>();
		
		for(Meal meal : foodlist) {
			for (Nutrients n : meal.getNutrients()) {
				if (nutrient.equals(n.getName()) && n.getQuantity() >= quant ) {
					foodbynutrient.add(meal);
					break;
				}
			}
		}
		return foodbynutrient;
	}
}
