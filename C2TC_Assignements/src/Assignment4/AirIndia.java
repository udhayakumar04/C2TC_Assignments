package Assignment4;

public class AirIndia implements Airfare {
    private int hours;
    private final double costPerHour = 5400; // as per example

    public AirIndia() {}

    public AirIndia(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }
}
