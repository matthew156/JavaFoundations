package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Omikujis {

@RequestMapping("/")	
public String index() {
	return "index.jsp";
}	

@RequestMapping(value="/result", method=RequestMethod.POST)
public String form(@RequestParam(value="number") String number,
@RequestParam(value="city") String city, @RequestParam(value="person") String person, @RequestParam(value="hobby") String hobby, @RequestParam(value="living") String living, @RequestParam(value="nice") String nice, HttpSession session)
{
session.setAttribute("number", number);
session.setAttribute("city", city);
session.setAttribute("living", living);
session.setAttribute("hobby", hobby);
session.setAttribute("person", person);
session.setAttribute("nice", nice);
return"redirect:/success";
}

@RequestMapping("/success")
public String success(HttpSession session, Model model) {
	model.addAttribute("number", session.getAttribute("number"));
	model.addAttribute("city", session.getAttribute("city"));
	model.addAttribute("living", session.getAttribute("living"));
	model.addAttribute("hobby", session.getAttribute("hobby"));
	model.addAttribute("person", session.getAttribute("person"));
	model.addAttribute("nice", session.getAttribute("nice"));
	return "success.jsp";
}
}
