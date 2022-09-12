package com.intellijide.hotelreservationsystem;

public class Hotel {
    private String hotelName;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                '}';
    }
}
