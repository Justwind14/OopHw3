package TransportProject.Aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Aircraft extends Transport {
    private String appointment;
    int index;
    public static List<Transport> aircraftlist = new ArrayList<>();

    public Aircraft(String name, int vin, int countOfPassenger, String color, String appointment) {
        super(name, vin, countOfPassenger, color);
        this.appointment = appointment;
    }

    public static void addAircraft(Aircraft someObj){
        aircraftlist.add(someObj);
    }
    public String getAppointment() {
        return appointment;
    }

    @Override
    public boolean hasNext() {
        return index > aircraftlist.size();
    }

    @Override
    public Transport next() {
        return  aircraftlist.get(index++);
    }

    @Override
    public String toString() {
        return super.toString() + "предназанчение:" + appointment;
    }
    @Override
    public void transportCall(Transport trans) {
        System.out.println("Вы забронировали воздушный судоходный транспорт: " + trans + " . Прибудет 12.12.2024 по улице такойто");
    }
}
