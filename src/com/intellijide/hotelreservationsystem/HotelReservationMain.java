package com.intellijide.hotelreservationsystem;

import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args) {
        HotelReservation reservation = new HotelReservation();
        reservation.addHotel("Lakewood",110,90);
        reservation.addHotel("Bridgewood",160,60);
        reservation.addHotel("Ridgewood",220,150);

        System.out.println(reservation.hotelList);
    }
}
