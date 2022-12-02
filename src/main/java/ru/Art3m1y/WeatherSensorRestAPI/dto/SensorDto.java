package ru.Art3m1y.WeatherSensorRestAPI.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SensorDto {
    @NotEmpty(message = "Имя сенсора не может быть пустым!")
    private String name;
}
