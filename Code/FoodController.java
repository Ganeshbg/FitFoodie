package io.fitfoodie.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

	@Autowired
	private FoodService foodservice;
	
	@RequestMapping("/food")
	public List<Food> getAllFood()
	{
		return foodservice.getAllFood();
	}
	
	@RequestMapping("/food/{id}")
	public Food getFood(@PathVariable String id)
	{
		return foodservice.getFood(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/food")
	public void addFood(@RequestBody Food food)
	{
		foodservice.addFood(food);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/food/{id}")
	public void updateFood(@RequestBody Food food, @PathVariable String id)
	{
		foodservice.updateFood(food, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/food/{id}")
	public void deleteFood(@PathVariable String id)
	{
		foodservice.deleteFood(id);
	}
}


