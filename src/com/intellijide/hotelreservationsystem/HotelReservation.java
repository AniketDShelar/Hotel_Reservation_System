package com.intellijide.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    Scanner scan = new Scanner(System.in);
    ArrayList<Hotel> hotelList = new ArrayList<>();
    public void addHotel(String hotelname, int weekDayRate, int weekendRate){
        Hotel hotel = new Hotel(hotelname,weekDayRate,weekendRate);
        hotelList.add(hotel);
    }

    @Override
    public String toString() {
        return "HotelReservation{" +
                "hotelList=" + hotelList +
                '}';
    }
}
