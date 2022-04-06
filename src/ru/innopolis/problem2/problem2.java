package ru.innopolis.problem2;
// your solution here
//fix all the errors including package errors

public class problem2 {
    public static void main(String[] args) {
        Station station = new Station();

        station.chargeByLightning(new Iphone());
        station.chargeByLightning(new UsbAdapter());
    }
}
