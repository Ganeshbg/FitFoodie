package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	private List<Nutrient> profile = new ArrayList<>(Arrays.asList(
			new Protein(5),
			new Fat(2)
			));
	
	public List<Nutrient> getCustomerProfile(){
		return profile;
	}

}
