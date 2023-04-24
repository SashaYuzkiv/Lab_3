public class ElectricCar extends Car {
    private double batteryCapacity;
    private double range;

    public ElectricCar(int id, String model, int year, double price, String regNumber,
                       double batteryCapacity, double range) {
        super(id, model, year, price, regNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + getId() +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", regNumber='" + getRegistrationNumber() + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", range=" + range +
                '}';
    }
}