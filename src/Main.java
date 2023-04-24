import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1, "Toyota", 2015, 15000, "AB1234BB");
        SportsCar sportsCar1 = new SportsCar(2, "Porsche", 2020, 100000, "BO4069BX", 2, 300);
        ElectricCar electricCar1 = new ElectricCar(3, "Tesla", 2022, 80000, "AA3976ZA", 75, 400);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(sportsCar1);
        carList.add(electricCar1);

        for (Car car : carList) {
            System.out.println(car.toString());
        }

        car1.setPrice(18000);

        System.out.println("Нова ціна для car1: " + car1.getPrice());
    }

}