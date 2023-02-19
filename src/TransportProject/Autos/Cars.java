package TransportProject.Autos;

public class Cars extends Auto {
    private String complectation;


    public Cars(String name, int vin, int countOfPassenger, String color, int numberOfWheels, String brand, double price, String complectation) {
        super(name, vin, countOfPassenger, color, numberOfWheels, brand, price);
        this.complectation = complectation;
    }

    public String getComplectation() {
        return complectation;
    }
}
