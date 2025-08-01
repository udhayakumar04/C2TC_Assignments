package Assignment4;

public class KingFisher implements Airfare {
    private int hours;
    private final double costPerHour = 2500; // based on sample

    public KingFisher() {}

    public KingFisher(int hours) {
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
        return hours * costPerHour * 4;
    }
}
