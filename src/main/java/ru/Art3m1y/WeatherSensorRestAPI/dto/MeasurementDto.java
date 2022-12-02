package ru.Art3m1y.WeatherSensorRestAPI.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeasurementDto {
    private SensorDto sensor;
    private float value;
    private boolean raining;
}
