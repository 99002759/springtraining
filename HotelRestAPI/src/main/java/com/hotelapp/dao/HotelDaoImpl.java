package com.hotelapp.dao;

 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;

 
@Service
public class HotelDaoImpl implements HotelDao {

 

    @Override
    public List<Hotel> getAllHotels() {
        // TODO Auto-generated method stub
        return showHotelList();
    }

 

    @Override
    public Hotel getById(int id) {
        // TODO Auto-generated method stub
        Hotel newHotel=new Hotel();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getHotelId().equals(id)) {
                newHotel=hotel;
            }
        }
        
        return newHotel;
    }

 

    @Override
    public List<Hotel> getByCity(String city) {
        List<Hotel> newHotelList=new ArrayList<>();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getCity().equals(city)) {
                newHotelList.add(hotel);
            }
        }
        // TODO Auto-generated method stub
        return newHotelList;
    }

 

    @Override
    public List<Hotel> getByCuisine(String cuisine) {
        List<Hotel> newHotelList=new ArrayList<>();
        for(Hotel hotel:showHotelList()) {
            if(hotel.getCuisine().equals(cuisine)) {
                newHotelList.add(hotel);
            }
        }
        // TODO Auto-generated method stub
        return newHotelList;
    }
    private List<Hotel> showHotelList(){
        return Arrays.asList(
                new Hotel("Paradise",1,"Anantapur","veg")
                );

 

}
}