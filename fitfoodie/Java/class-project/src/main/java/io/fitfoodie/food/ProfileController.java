package io.fitfoodie.food;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Autowired
	private ProfileService profileservice;
	
	@RequestMapping("/profile")
	public List<Nutrients> getCustomerProfile(){
		return profileservice.getCustomerProfile();
		
	}

}
