package com.hotelapp.service;

 

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.dao.HotelDao;
import com.hotelapp.dao.HotelDaoImpl;
import com.hotelapp.model.Hotel;

 
@Service
public class HotelServiceImpl implements HotelService {
    HotelDao hotelDao=new HotelDaoImpl();

 

    @Override
    public List<Hotel> getAllHotels() {
        // TODO Auto-generated method stub
        return hotelDao.getAllHotels();
    }

 

    @Override
    public Hotel getById(int id) {
        // TODO Auto-generated method stub
        return hotelDao.getById(id);
    }

 

    @Override
    public List<Hotel> getByCity(String city) {
        // TODO Auto-generated method stub
        return hotelDao.getAllHotels();
    }

 

    @Override
    public List<Hotel> getByCuisine(String cuisine) {
        // TODO Auto-generated method stub
        return hotelDao.getAllHotels();
    }

 

}
 