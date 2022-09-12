package com.intellijide.hotelreservationsystem;

import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args) {
        HotelReservation reservation = new HotelReservation();
        reservation.addHotel("Lakewood");
        reservation.addHotel("Bridgewood");
        reservation.addHotel("Ridgewood");

        System.out.println(reservation.hotelList);
    }
}
