package provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import provider.ProviderService;

@RestController
public class TestController {
	
	private static final Logger logger =LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private ProviderService providerService;

	@GetMapping("/test")
	public String test(){
		return providerService.providerTest();
	}
}
