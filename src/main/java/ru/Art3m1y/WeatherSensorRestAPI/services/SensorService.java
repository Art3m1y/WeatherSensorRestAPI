package ru.Art3m1y.WeatherSensorRestAPI.services;

import org.springframework.stereotype.Service;
import ru.Art3m1y.WeatherSensorRestAPI.models.Sensor;
import ru.Art3m1y.WeatherSensorRestAPI.repositories.SensorRepository;

import java.util.Optional;

@Service
public class SensorService {
    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public boolean isNameBusy(String name) {
        Optional<Sensor> sensor = sensorRepository.findByName(name);
        if (sensor.isPresent()) {
            return true;
        }
        return false;
    }

    public void saveSensor(Sensor sensor) {
        sensorRepository.save(sensor);
    }
}
