package com.codingdojod.daikichipathvariables;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class PathVariables {
@RequestMapping("/")
public String test() {
	return "TEST";
}
@RequestMapping("/daikichi/travel/{location}")
public String location(@PathVariable("location") String location)
{return "Congratulations! You will soon travel to " + location;}

@RequestMapping("/daikichi/lotto/{number}")
public String lotto(@PathVariable("number") Integer number) {
	if(number % 2 == 0) {
		return "You will take a grand journey in the near future, but be wary of tempting offers";
	}
	else {
		return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends";
	}
}
}
