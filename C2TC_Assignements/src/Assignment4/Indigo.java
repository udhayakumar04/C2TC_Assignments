package Assignment4;

public class Indigo implements Airfare {
    private int hours;
    private final double costPerHour = 4800; // based on sample

    public Indigo() {}

    public Indigo(int hours) {
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
        return hours * costPerHour * 8;
    }
}
