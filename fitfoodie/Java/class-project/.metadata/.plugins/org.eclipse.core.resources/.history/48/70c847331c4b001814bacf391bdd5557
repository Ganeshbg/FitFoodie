package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	private List<Nutrients> profile = new ArrayList<>(Arrays.asList(
			new Protein(5),
			new Carbohydrates(2),
			new Fat(2)
			));
	
	public List<Nutrients> getCustomerProfile(){
		return profile;
	}

}
