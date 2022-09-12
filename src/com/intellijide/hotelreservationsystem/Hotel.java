package com.intellijide.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private int weekDayRate;
    private int weekendRate;

    public Hotel(String hotelName, int weekdayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekDayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel='" + hotelName + '\'' +
                ", weekdayRate=" + weekDayRate +
                ", weekendRate=" + weekendRate +
                '}';
    }
}
