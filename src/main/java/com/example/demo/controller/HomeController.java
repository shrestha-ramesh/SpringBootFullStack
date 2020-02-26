package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.client.Client;
import com.example.demo.client.ClientService;

@Controller
public class HomeController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value= {"/","/home.html"})
	public String home() {
		return "home";
	}
	@RequestMapping(value="/location.html")
	public String location() {
		return "location";
	}
	@RequestMapping(value= "/images.html")
	public String images() {
		return "images";
	}
	@RequestMapping(value="/aboutus.html")
	public String aboutus() {
		return "aboutus";
	}
	@RequestMapping(value= "/contactus.html")
	public String contactus() {
		return "contactus";
	}
	@RequestMapping(value="/reviews.html")
	public String reviews() {
		return "reviews";
	}
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.saveClient(client);
		
		return "images";
	}
//	@RequestMapping(value="/client/update", method = RequestMethod.PUT)
//	@ResponseBody
//	public void update(Client client) {
//		clientService.updateClient(client);
//	}
}
