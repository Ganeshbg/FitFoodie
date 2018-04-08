package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	private List<Meal> foodlist = new ArrayList<>(Arrays.asList(
			new Meal("Jamoon", "Kathmandu", 4.5, 410, 3.52,
					new ArrayList<>(Arrays.asList(new Protein(1), new Carbohydrates(2), new Fat(3)))),
			new Meal("Jamoon1", "Taj", 4.6, 410, 3.52,
					new ArrayList<>(Arrays.asList(new Protein(2), new Carbohydrates(3), new Fat(4)))),
			new Meal("Jamoon2", "Masalas", 4.7, 410, 3.52,
					new ArrayList<>(Arrays.asList(new Protein(3), new Carbohydrates(4), new Fat(5)))),
			new Meal("Jamoon2", "Masalas", 4.7, 410, 3.52,
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
