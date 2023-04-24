public class SportsCar extends Car{
    private int numberOfDoors;
    private int maxSpeed;

    public SportsCar(int id, String model, int year, double price, String registrationNumber, int numberOfDoors, int maxSpeed) {
        super(id, model, year, price, registrationNumber);
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "numberOfDoors=" + numberOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", " + super.toString() +
                '}';
    }
}