package ru.Art3m1y.WeatherSensorRestAPI.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Sensor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Имя сенсора не может быть пустым!")
    @Column
    private String name;
    @OneToMany(mappedBy = "sensor")
    private List<Measurement> measurementList;
}
