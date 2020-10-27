package com.hotelapp.service;

 

import java.util.List;

 

import com.hotelapp.model.Hotel;

 

public interface HotelService {
    List<Hotel> getAllHotels();
    Hotel getById(int id);
    List<Hotel> getByCity(String city);
    List<Hotel> getByCuisine(String cuisine);
    
    
    
}