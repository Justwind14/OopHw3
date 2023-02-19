package TransportProject.Autos;

public class Tracks extends Auto{
    String state;

    public Tracks(String name, int vin, int countOfPassenger, String color, int numberOfWheels, String brand, double price, String state) {
        super(name, vin, countOfPassenger, color, numberOfWheels, brand, price);
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
