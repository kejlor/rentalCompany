package RentalCompany;

import java.util.HashMap;

public class CarHire {

    private HashMap<String, Car> cars = new HashMap<>();

    public void addCar(Car car) {
        cars.put(car.getIdentifier(), car);
    }

    public void displayAllCars(){
        System.out.println("Our cars to rent: ");
        for (Car car : cars.values()){
            System.out.println(car);
        }
    }

    public void rent(String identifier) {
        cars.get(identifier).setRented(true);
    }

    public void returnCar(String identifier) {
        cars.get(identifier).setRented(false);
    }
}
