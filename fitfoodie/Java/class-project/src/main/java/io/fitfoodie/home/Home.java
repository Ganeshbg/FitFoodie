package io.fitfoodie.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello!";
	}
}
