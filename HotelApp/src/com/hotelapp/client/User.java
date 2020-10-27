package com.hotelapp.client;

 

import java.util.List;

 

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

 

public class User {

 

    public static void main(String[] args) {
        HotelService HotelService=new HotelServiceImpl();
        HotelService.getAllHotels();
        List<Hotel> hotelList = HotelService.getAllHotels();
        for(Hotel hotel:hotelList)
            System.out.println(hotel);
        // TODO Auto-generated method stub

 

    }

 

}
 