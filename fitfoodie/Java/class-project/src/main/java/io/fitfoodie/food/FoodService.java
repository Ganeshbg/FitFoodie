package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	
	//@Autowired
	//private AddressService addressService;
	
	
	@Autowired
	private AreaService areaService;
	
	
	
	

private List<Meal> foodlist = new ArrayList<>(Arrays.asList(
			new Meal("Jamoon", new Restaurant(1,"Kathmandu",new Address("001","Colorado Ave", new Area("80303","Boulder","CO","USA")),4.6), 410, 3.52,
					new ArrayList<>(Arrays.asList(new Protein(60), new Carbohydrates(60), new Fat(60)))),
			new Meal("Masala Dosa", new Restaurant(1,"Masalas",new Address("002","Arapahoe Ave", new Area("80304","Boulder","CO","USA")),4.7), 420, 4.2,
					new ArrayList<>(Arrays.asList(new Protein(72), new Carbohydrates(75), new Fat(90)))),
			new Meal("Samosa", new Restaurant(1,"Taj",new Address("003","Arapahoe Ave", new Area("80305","Boulder","CO","USA")),4.5), 445, 6.2,
					new ArrayList<>(Arrays.asList(new Protein(3), new Carbohydrates(4), new Fat(5)))),
			new Meal("Biryani", new Restaurant(1,"Bawarchi",new Address("004","Arapahoe Ave", new Area("80305","Boulder","CO","USA")),4.2), 310, 7.2,
					new ArrayList<>(Arrays.asList(new Protein(10), new Carbohydrates(3), new Fat(2))))));
	
	
	//private List<Meal> foodlist = new ArrayList<Meal>();

	public List<Meal> getAllMeal() {
		return foodlist;
	}

	public Meal getMeal(String id) {
		
		
		return foodlist.stream().filter(meal -> meal.getId().equals(id)).findFirst().get();
	}

	public void addMeal(Meal food) {
		
		String zipCode = food.getRestaurant().getAddress().getArea().getZipCode();
		Area area = areaService.getArea(zipCode);
		if(area!=null) {
			System.out.println("Area exits!! Hurray!");
			String id = food.getId();
			Restaurant restaurant = food.getRestaurant();
			int calories = food.getCalories();
			double price = food.getPrice();
			List<Nutrients> nutrients = food.getNutrients();
			int restaurantId = restaurant.getId();
			String restaurantName = restaurant.getName();
			double restaurantRating = restaurant.getRating();
			Address address = restaurant.getAddress();
			address.setArea(area);
			String unitNumber = address.getUnitNumber();
			String street = address.getStreet();
			Address newAddress = new Address(unitNumber,street,area);
			Restaurant newRestaurant = new Restaurant(restaurantId,restaurantName,newAddress,restaurantRating);
			Meal meal = new Meal(id,newRestaurant,calories,price,nutrients);
			foodlist.add(meal);	
		}
		else {
			foodlist.add(food);
		}
		

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
