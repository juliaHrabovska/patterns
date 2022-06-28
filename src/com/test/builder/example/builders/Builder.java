package com.test.builder.example.builders;

import com.test.builder.example.cars.CarType;
import com.test.builder.example.components.Engine;
import com.test.builder.example.components.GPSNavigator;
import com.test.builder.example.components.Transmission;
import com.test.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
