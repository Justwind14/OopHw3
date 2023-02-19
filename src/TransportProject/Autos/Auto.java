package TransportProject.Autos;

import TransportProject.Aircrafts.Transport;

import java.util.ArrayList;
import java.util.List;

public class Auto extends Transport implements Comparable<Auto> {
    private int numberOfWheels;
    private String brand;
    private double price;
    public static List<Auto> autolist = new ArrayList<>();

    int index=0;

    public Auto(String name, int vin, int countOfPassenger, String color, int numberOfWheels, String brand, double price) {
        super(name, vin, countOfPassenger, color);
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
        this.price = price;

    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public static List<Auto> getAutolist() {
        return autolist;
    }

    public static void addAuto(Auto someObj){
        autolist.add(someObj);
    }

    @Override
    public boolean hasNext() {
        return index > autolist.size();
    }

    @Override
    public Transport next() {
        return  autolist.get(index++);
    }

    @Override
    public String toString() {
        return super.toString() + "количество колес:" + numberOfWheels + " Модель:" + brand + "цена:" + price + " ";
    }


    @Override
    public int compareTo(Auto o) {
        if (this.getCountOfPassenger() > o.getCountOfPassenger()) {
            return -1;
        }
        else if (this.getCountOfPassenger() < o.getCountOfPassenger())
        {return 1;}
        else return 0;
    }

    @Override
    public void transportCall(Transport trans) {
        System.out.println("по вашему адресу выехал:" + trans + "прибудет чреез 5 минут");
    }
}
