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
	public List<Meal> getAllMeal()
	{
		return foodservice.getAllMeal();
	}
	
	@RequestMapping("/food/{id}")
	public Meal getMeal(@PathVariable String id)
	{
		return foodservice.getMeal(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/food")
	public void addMeal(@RequestBody Meal meal)
	{
		foodservice.addMeal(meal);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/food/{id}")
	public void updateMeal(@RequestBody Meal meal, @PathVariable String id)
	{
		foodservice.updateMeal(meal, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/food/{id}")
	public void deleteMeal(@PathVariable String id)
	{
		foodservice.deleteMeal(id);
	}
	
	@RequestMapping("/food/{nutrient}/{quantity}")
	public List<Meal> getMealByNutrient(@PathVariable String nutrient, @PathVariable String quantity)
	{
		return foodservice.getMealByNutrient(nutrient, quantity);
	}
	
	@RequestMapping("/ping")
	public String isAlive()
	{
		return "What's up";
	}
}

