package ru.Art3m1y.WeatherSensorRestAPI.utils;

public class SensorCreateException extends RuntimeException{
    public SensorCreateException(String message) {
        super(message);
    }
}
