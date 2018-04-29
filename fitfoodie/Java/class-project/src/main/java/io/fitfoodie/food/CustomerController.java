package io.fitfoodie.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customer/get/{id}")
	public Customer getCustomer(@PathVariable String id){
		return customerService.getCustomer(id);
		
	}

	@RequestMapping(method=RequestMethod.PUT, value="/customer/updateprofile/{id}/{profileId}")
	public void updateProfile(@PathVariable String id, @PathVariable String profileId, @RequestBody Profile p ) {
		
		customerService.updateCustomerProfile(id,profileId,p);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/profile")
	public void addNutrient(@RequestBody Nutrients nutrient)
	{
		//not implemented
		//customerService.addNutrient(nutrient);
	}

	
}
