package com.intellijide.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.stream.Stream;

public class HotelReservation {
    Scanner scan = new Scanner(System.in);
    ArrayList<Hotel> hotelList = new ArrayList<>();
    public void addHotel(String hotelname){
        Hotel hotel = new Hotel(hotelname);
        hotelList.add(hotel);
    }
    @Override
    public String toString() {
        return "HotelReservation{" +
                "hotelList=" + hotelList +
                '}';
    }
}
