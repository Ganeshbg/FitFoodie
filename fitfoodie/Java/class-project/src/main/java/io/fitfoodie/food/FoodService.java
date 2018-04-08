package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	private List<Food> foodlist = new ArrayList<>(Arrays.asList(
			new Food("Jamoon", "Kathmandu", 4.5,
					new ArrayList<>(Arrays.asList(new Protein(1), new Carbohydrates(2), new Fat(3)))),
			new Food("Jamoon1", "Taj", 4.6,
					new ArrayList<>(Arrays.asList(new Protein(2), new Carbohydrates(3), new Fat(4)))),
			new Food("Jamoon2", "Masalas", 4.7,
					new ArrayList<>(Arrays.asList(new Protein(3), new Carbohydrates(4), new Fat(5)))),
			new Food("Jamoon2", "Masalas", 4.7,
					new ArrayList<>(Arrays.asList(new Protein(10), new Carbohydrates(3), new Fat(2))))));

	public List<Food> getAllFood() {
		return foodlist;
	}

	public Food getFood(String id) {
		return foodlist.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addFood(Food food) {
		foodlist.add(food);

	}

	public void updateFood(Food food, String id) {
		for (int i = 0; i < foodlist.size(); i++) {
			Food f = foodlist.get(i);
			if (f.getId().equals(id)) {
				foodlist.set(i, food);
				return;
			}
		}

	}

	public void deleteFood(String id) {
		foodlist.removeIf(t -> t.getId().equals(id));
	}

	public List<Food> getFoodByNutrient(String nutrient, String quantity) {
		int quant = Integer.parseInt(quantity);
		List<Food> foodbynutrient = new ArrayList<>();
		// Nutrients nutrient_type;
//		for (int i = 0; i < foodlist.size(); i++) {
//			Food f = foodlist.get(i);
//			if (nutrient.equals("protein")) {
//				for (int j = 0; j < f.nutrients.size(); j++) {
//					if (f.nutrients.get(j) instanceof Protein) {
//						Protein p = (Protein) f.nutrients.get(j);
//						if (p.getQuantity() >= quant) {
//							
//						
//						
//					
//
//		
//
//			if (nutrient.equals("carbohydrates")) {
//				for (int j = 0; j < f.nutrients.size(); j++) {
//					if (f.nutrients.get(j) instanceof Carbohydrates) {
//						Carbohydrates p = (Carbohydrates) f.nutrients.get(j);
//						if (p.getQuantity() >= quant) {
//							foodbynutrient.add(f);
//							continue;
//						}
//					}
//				}
//			}
//
//			if (nutrient.equals("fat")) {
//				for (int j = 0; j < f.nutrients.size(); j++) {
//					if (f.nutrients.get(j) instanceof Fat) {
//						Fat p = (Fat) f.nutrients.get(j);
//						if (p.getQuantity() >= quant) {
//							foodbynutrient.add(f);
//							continue;
//						}
//					}
//				}
//			}
//
//		}
		
		for(Food food : foodlist) {
			for (Nutrients n : food.getNutrients()) {
				if (nutrient.equals(n.getName()) && n.getQuantity() >= quant ) {
					foodbynutrient.add(food);
					break;
				}
			}
		}
		return foodbynutrient;
	}
}
