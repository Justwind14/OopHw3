package TransportProject;

import TransportProject.Aircrafts.Aircraft;
import TransportProject.Aircrafts.Airplane;
import TransportProject.Aircrafts.Helicopter;
import TransportProject.Aircrafts.Transport;
import TransportProject.Autos.Auto;
import TransportProject.Autos.Bus;
import TransportProject.Autos.Cars;
import TransportProject.Autos.Tracks;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Создать иерархию родительский и дочернии классы для Транспорта
//        Например Транспорт - > Автомобиль - > Автобус
//        Транспорт - > Автомобиль - > Легковой
//        Используем наследование, инкапсуляцию
        Auto lada = new Cars("lada Granta",13123, 5, "blue", 4, "Lada", 100, "lux");
        Auto icarus = new Bus("Icarus cigar", 13121223, 15, "black", 6, "Icarus", 100, "school");
        Auto kamaz = new Tracks("KAMAZ FINAL",13123, 11, "blue", 4, "KAMAZ", 111, "б\\у");
        Aircraft boeing = new Airplane("Boeing 747",313413,120,"white","civil", "пассажирский");
        Aircraft Mi8 = new Helicopter("Mi-8",313413,12,"white","military", 3);
        Aircraft.addAircraft(boeing);
        Aircraft.addAircraft(Mi8);
        Auto.addAuto(lada);
        Auto.addAuto(icarus);
        Auto.addAuto(kamaz);
        Transport.gallery.add(Auto.getAutolist());

        System.out.println(Transport.gallery.toString());

        Collections.sort(Auto.getAutolist());
        for (Transport iter: Auto.getAutolist()
             ) {
            System.out.println(iter.toString());
        }

        kamaz.transportCall(kamaz);
        Mi8.transportCall(Mi8);

        }
    }
