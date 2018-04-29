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

	
	
}
