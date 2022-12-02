package ru.Art3m1y.WeatherSensorRestAPI.services;

import org.springframework.stereotype.Service;
import ru.Art3m1y.WeatherSensorRestAPI.models.Measurement;
import ru.Art3m1y.WeatherSensorRestAPI.repositories.MeasurementRepository;
import ru.Art3m1y.WeatherSensorRestAPI.repositories.SensorRepository;

import java.util.List;

@Service
public class MeasurementService {

    private final MeasurementRepository measurementRepository;
    private final SensorRepository sensorRepository;

    public MeasurementService(MeasurementRepository measurementRepository, SensorRepository sensorRepository) {
        this.measurementRepository = measurementRepository;
        this.sensorRepository = sensorRepository;
    }

    public void saveMeasurement(Measurement measurement) {
        measurement.getSensor().setId(sensorRepository.findByName(measurement.getSensor().getName()).get().getId());
        measurementRepository.save(measurement);
    }

    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    /*public Measurement getMeasurementById(int id) {
        return measurementRepository.findById(id);
    }*/

    public int rainyDaysCount() {
        return measurementRepository.countByRainingIsTrue();
    }
}
