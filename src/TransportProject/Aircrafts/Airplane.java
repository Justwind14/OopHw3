package TransportProject.Aircrafts;

public class Airplane extends Aircraft{
    private String type;

    public Airplane(String name, int vin, int countOfPassenger, String color, String appointment, String type) {
        super(name, vin, countOfPassenger, color, appointment);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
