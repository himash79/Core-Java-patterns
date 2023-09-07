package lk.himash.util;

import lk.himash.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Car> fetchCarsIniDetails() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(1, "Toyota", "Axio");
        Car car2 = new Car(2, "Honda", "Civic");
        Car car3 = new Car(3, "Audi", "A5");
        Car car4 = new Car(4, "BMW", "320SI");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        return cars;
    }

    public static List<Car> fetchCarsOtherDetails() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(30000.00, false);
        Car car2 = new Car(15000.00, true);
        Car car3 = new Car(80000.00, false);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        return cars;
    }

}
