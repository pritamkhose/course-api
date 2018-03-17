package io.javbrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "Bye!";
	}
	
	@RequestMapping("/ok")
	public String sayok() {
		return "ok!";
	}
	
}
