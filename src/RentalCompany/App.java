package RentalCompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        CarHire carHire = new CarHire();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a car identifier: ");
        String identifier = scanner.nextLine();
        System.out.println("Write brand of car: ");
        String brand = scanner.nextLine();
        System.out.println("Write a model of your desired car: ");
        String model = scanner.nextLine();
        System.out.println("Write a production date of your car: ");
        int carsProductionDate = scanner.nextInt();

        Car car = new Car(identifier, brand, model, carsProductionDate);
        Car amazingCar = new Car("Amazing car", "bmw", "m2", 2020);

        System.out.println(car.toString());

        carHire.addCar(car);
        carHire.addCar(amazingCar);

        carHire.displayAllCars();

    }

}
