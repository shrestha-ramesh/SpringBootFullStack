package com.example.demo.reviews;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {
	
	@Autowired
	private ReviewsRepository reviewsRepository;
	
	public void saveReviews(Reviews reviews) {
		reviewsRepository.save(reviews);
	}
	public List<Reviews> listAll(){
		return reviewsRepository.findAll();
	}
}
