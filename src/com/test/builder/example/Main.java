package com.test.builder.example;

import com.test.builder.example.builders.CarBuilder;
import com.test.builder.example.builders.CarManualBuilder;
import com.test.builder.example.cars.Car;
import com.test.builder.example.cars.CarType;
import com.test.builder.example.cars.Manual;
import com.test.builder.example.components.Engine;
import com.test.builder.example.components.GPSNavigator;
import com.test.builder.example.components.Transmission;
import com.test.builder.example.components.TripComputer;
import com.test.builder.example.director.Director;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(
                CarType.CITY_CAR,
                4,
                new Engine(1.2, 0),
                Transmission.MANUAL,
                null, null);

        System.out.println(car1);

        Car car2 = new Car(
                CarType.SUV,
                4,
                new Engine(2.5, 0),
                Transmission.SEMI_AUTOMATIC,
                new TripComputer(),
                new GPSNavigator());

        System.out.println(car2);

        CarBuilder builder1 = new CarBuilder();
        builder1.setCarType(CarType.SPORTS_CAR);
        builder1.setSeats(2);
        builder1.setEngine(new Engine(3.0, 0));
        builder1.setTransmission(Transmission.SEMI_AUTOMATIC);
//        builder.setTripComputer(new TripComputer());
//        builder.setGPSNavigator(new GPSNavigator());

        Car car3 = builder1.getResult();

        System.out.println(car3);

        Director director = new Director();

        CarBuilder builder2 = new CarBuilder();
        director.constructSportsCar(builder2);
        Car car4 = builder2.getResult();
        System.out.println(car4);


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
