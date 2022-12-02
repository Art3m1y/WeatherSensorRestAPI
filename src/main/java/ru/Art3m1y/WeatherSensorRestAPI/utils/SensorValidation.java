package ru.Art3m1y.WeatherSensorRestAPI.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.Art3m1y.WeatherSensorRestAPI.models.Sensor;
import ru.Art3m1y.WeatherSensorRestAPI.services.SensorService;

@Component
public class SensorValidation implements Validator {

    private final SensorService sensorService;

    public SensorValidation(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Sensor.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Sensor sensor = (Sensor) target;

        if (sensorService.isNameBusy(sensor.getName())) {
            errors.rejectValue("name", "", "Это имя сенсора уже занято!");
        }
    }
}
