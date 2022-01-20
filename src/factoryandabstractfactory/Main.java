package factoryandabstractfactory;

import java.nio.file.Paths;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car awm = CarFactory.create(CarType.AWM);
        Car mhindra = CarFactory.create(CarType.MAHINDRA);
        Car tata = CarFactory.create(CarType.TATA);

        // example of factory method
        LocalDate now = LocalDate.now();
        Paths.get("D://");


    }


}
