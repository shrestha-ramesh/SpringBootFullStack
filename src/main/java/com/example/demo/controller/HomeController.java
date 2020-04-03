package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.client.Client;
import com.example.demo.client.ClientService;
import com.example.demo.reviews.Reviews;
import com.example.demo.reviews.ReviewsService;


@Controller
public class HomeController {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ReviewsService reviewsService;
	
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
	public String reviews(Model model) {
		List<Reviews> listReviews = reviewsService.listAll();
		model.addAttribute("listReviews", listReviews);
		return "reviews";
	}
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.saveClient(client);
		return "home";
	}
	@RequestMapping(value="/saveReviews", method=RequestMethod.POST)
	public String saveReviews(@ModelAttribute("reviews") Reviews reviews, Model model) {
		reviewsService.saveReviews(reviews);
		List<Reviews> listReviews = reviewsService.listAll();
		model.addAttribute("listReviews", listReviews);
		return "reviews";
	}
//	@RequestMapping(value="/client/update", method = RequestMethod.PUT)
//	@ResponseBody
//	public void update(Client client) {
//		clientService.updateClient(client);
//	}
}
