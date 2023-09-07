package lk.himash;

import lk.himash.model.Car;
import lk.himash.util.DB;

import java.util.ArrayList;
import java.util.List;

public class Illustration_04 {
    public static void main(String[] args) {

        List<Car> initDetails = DB.fetchCarsIniDetails();
        List<Car> otherDetails = DB.fetchCarsOtherDetails();
        List<Car> totalDetails = new ArrayList<>();

        // If the both list contains same count of records
        for (int i = 0; i < initDetails.size(); i++) {
            Car c = new Car();
            c.setId(initDetails.get(i).getId());
            c.setManufacture(initDetails.get(i).getManufacture());
            c.setModel(initDetails.get(i).getModel());
            if(i != otherDetails.size()) {
                c.setCost(otherDetails.get(i).getCost());
                c.setStatus(otherDetails.get(i).isStatus());
            }
            totalDetails.add(c);
        }

        // If the both list contains different count of records
        for (int i = 0; i < initDetails.size(); i++) {
            Car c = new Car();
            c.setId(initDetails.get(i).getId());
            c.setManufacture(initDetails.get(i).getManufacture());
            c.setModel(initDetails.get(i).getModel());
            totalDetails.add(c);
        }
        for (int j = 0; j < otherDetails.size(); j++) {
            if (j == totalDetails.size()) {
                Car car = new Car(otherDetails.get(j).getCost(), otherDetails.get(j).isStatus());
                totalDetails.add(car);
            } else {
                totalDetails.get(j).setCost(otherDetails.get(j).getCost());
                totalDetails.get(j).setStatus(otherDetails.get(j).isStatus());
            }
        }
        System.out.println(totalDetails);
    }

}
