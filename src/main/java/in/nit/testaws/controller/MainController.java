package in.nit.testaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("welcome")
	public String welcome() {
		return "Welcome to AWS";
	}
	
}
