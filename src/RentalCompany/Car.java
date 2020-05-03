package RentalCompany;

public class Car {

    private String identifier;
    private String brand;
    private String model;
    private int carsProductionDate;
    private boolean rented;

    public Car(String identifier, String brand, String model, int carsProductionDate) {
        this.identifier = identifier;
        this.brand = brand;
        this.model = model;
        this.carsProductionDate = carsProductionDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCarsProductionDate() {
        return carsProductionDate;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "identifier='" + identifier + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carsProductionDate=" + carsProductionDate +
                ", rented=" + rented +
                '}';
    }
}
