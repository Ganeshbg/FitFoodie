package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FoodService {

	private List<Food> foodlist = new ArrayList<>(Arrays.asList(
			new Food("Jamoon","Kathmandu",4.5),
			new Food("Jamoon1","Kathmandu1",4.6),
			new Food("Jamoon2","Kathmandu2",4.7)
			));
	
	public List<Food> getAllFood()
	{
		return foodlist;
	}
	
	public Food getFood(String id)
	{
		return foodlist.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addFood(Food food) {
		foodlist.add(food);
		
	}

	public void updateFood(Food food, String id) {
		for(int i=0; i<foodlist.size();i++)
		{
			Food f = foodlist.get(i);
			if(f.getId().equals(id))
			{
				foodlist.set(i, food);
				return;
			}
		}
		
	}

	public void deleteFood(String id) {
		foodlist.removeIf(t->t.getId().equals(id));
	}
}

