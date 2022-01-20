package factoryandabstractfactory;

public class CarFactory {

    public static Car create(CarType carType) {
        switch (carType) {
            case TATA:
                return new TataCars();
            case AWM:
                return new AWMCars();
            case MAHINDRA:
                return new MahindraCar();
            default:
                break;

        }
        return null;
    }
}
