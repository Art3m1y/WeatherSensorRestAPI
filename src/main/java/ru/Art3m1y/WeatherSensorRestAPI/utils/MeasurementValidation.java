package ru.Art3m1y.WeatherSensorRestAPI.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.Art3m1y.WeatherSensorRestAPI.models.Measurement;
import ru.Art3m1y.WeatherSensorRestAPI.services.SensorService;

@Component
public class MeasurementValidation implements Validator {

    private final SensorService sensorService;

    public MeasurementValidation(SensorService sensorService) {
        this.sensorService = sensorService;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return Measurement.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Measurement measurement = (Measurement) target;

        if (!sensorService.isNameBusy(measurement.getSensor().getName())) {
            errors.rejectValue("sensor.name", "", "Сенсора с таким именем нет!");
        }

    }
}
