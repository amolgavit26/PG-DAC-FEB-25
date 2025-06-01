package com.cdac.service;

import java.util.List;

import com.cdac.entities.Restaurant;

public interface RestaurantService {

	List<Restaurant> findAllAvailabeRestaurants();
	
	List<Restaurant> findAllRestaurantsByKeyword(String keyword);
}
