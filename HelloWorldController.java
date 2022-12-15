package mvcSpringSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public String helloWorld()
	{
		return "hello - world";
	}
	

}
