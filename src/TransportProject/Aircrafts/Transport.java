package TransportProject.Aircrafts;

import TransportProject.Autos.Auto;
import TransportProject.Callabble;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Transport implements Iterator<Transport>, Callabble {
    String name;
    private int vin;
    private int countOfPassenger;
    private String color;



    public static List<List<Auto>> gallery = new ArrayList<>();

    public Transport(String name, int vin, int countOfPassenger, String color) {
        this.name = name;
        this.vin = vin;
        this.countOfPassenger = countOfPassenger;
        this.color = color;

    }



    public int getVin() {
        return vin;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public String getColor() {
        return color;
    }
//    public static List<List<Transport>> getGallery() {
//        return gallery;
//    }



    @Override
    public String toString() {
        return "Название транспорта: " + name + " Регистрационный номер:" + vin + " Количество пассажиров:" + countOfPassenger + " цвет:" + color + " " ;
    }

}
