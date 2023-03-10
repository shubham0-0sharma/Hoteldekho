package com.hoteldekho.hotelservice.service;

import com.hoteldekho.hotelservice.entities.Hotel;


import java.util.List;


public interface HotelService {
    Hotel createHotel(Hotel hotel);
    Hotel getHotel(String hotelId);
    List<Hotel> getHotels();
}
