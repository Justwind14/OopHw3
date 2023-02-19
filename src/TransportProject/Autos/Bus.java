package TransportProject.Autos;

public class Bus extends Auto{
    String type;

    public Bus(String name, int vin, int countOfPassenger, String color, int numberOfWheels, String brand, double price, String type) {
        super(name, vin, countOfPassenger, color, numberOfWheels, brand, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
