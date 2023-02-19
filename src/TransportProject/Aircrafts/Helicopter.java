package TransportProject.Aircrafts;

public class Helicopter extends Aircraft{
    private int nubmOfBlade;

    public Helicopter(String name, int vin, int countOfPassenger, String color, String appointment, int nubmOfBlade) {
        super(name, vin, countOfPassenger, color, appointment);
        this.nubmOfBlade = nubmOfBlade;
    }

    public int getNubmOfBlade() {
        return nubmOfBlade;
    }
}
