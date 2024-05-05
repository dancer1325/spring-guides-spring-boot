package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//	Ready for Spring MVC to handle web requests
//		@Controller 	+  @ResponseBody		-> web requests return data
@RestController
public class HelloController {

	//		/	-- is mapped to -- ìndex()
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
