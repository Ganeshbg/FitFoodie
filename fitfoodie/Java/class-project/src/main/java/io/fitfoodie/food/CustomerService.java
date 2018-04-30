package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private List<Customer> customerlist=new ArrayList<>(Arrays.asList(
			new Customer("Abdul",new ArrayList<>(Arrays.asList(new Protein(55), new Carbohydrates(52), new Fat(35))),"Protein"),
			new Customer("Ganesh",new ArrayList<>(Arrays.asList(new Protein(55), new Carbohydrates(52), new Fat(35))),"Protein"),
			new Customer("Chirag",new ArrayList<>(Arrays.asList(new Protein(44), new Carbohydrates(42), new Fat(32))),"Fat")
			
			));
	
	
	public Customer getCustomer(String id) {
		return customerlist.stream().filter(t -> t.getName().equals(id)).findFirst().get();
	}
	
	public void updateCustomerProfile(String custId, String profileId, Profile p) {
		List<Profile> temp=new ArrayList<>(Arrays.asList());
		for(int i=0;i<customerlist.size();i++) {
			Customer c=customerlist.get(i);
			if(c.getName().equals(custId))
				temp=c.getProfile();
				for(int j=0;j<temp.size();j++) {
					if(temp.get(j).getId().equals(profileId))
						c.updateProfile(j,p);
						customerlist.set(i,c);
				}
			
		}
	}

	public List<Meal> searchByProfile(String id, String profile)
	{
		FoodService foodservice = new FoodService();
		//@SuppressWarnings("null")
		List<Meal> foodlist = foodservice.getAllMeal();
		List<Meal> return_meal = new ArrayList<>();
		for(@SuppressWarnings("unused") Customer customer: customerlist)
		{
			if(customer.getName().equals(id))
			{
				List<Profile> customerprofiles = customer.getProfile();
				for(Meal meal: foodlist)
				{
					List<Nutrients> nutrients = meal.getNutrients();
					int count = 0;
					for(Nutrients nutrient: nutrients)
					{
						for(Profile cprofile: customerprofiles)
						{
							if(cprofile.getId().equals(profile))
							{
								List<Nutrients> cnutrients = cprofile.getNutrients();
								for(Nutrients nut: cnutrients)
								{
									if(nut.getName().equals(nutrient.getName()))
									{
										if(nutrient.getQuantity()>nut.getQuantity())
										{
											count = count + 1;
											if(count == 3)
											{
												return_meal.add(meal);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return return_meal;
	}
	
	
}
