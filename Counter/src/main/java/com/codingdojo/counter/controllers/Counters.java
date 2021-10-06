package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counters {
@RequestMapping("/")	
public String welcome() {
	return "index.jsp";
}

@RequestMapping("/count")
public String counter(HttpSession session) {
// If the count is not already in session
if (session.getAttribute("count") == null) {
	session.setAttribute("count", 0);
}
else {int increment = (int)session.getAttribute("count");
increment++;
session.setAttribute("count", increment);
}

return "show.jsp";}
//...

//...


}
