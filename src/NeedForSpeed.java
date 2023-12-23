public class NeedForSpeed {
    private final int speed;
    private int battery = 100;
    private final int batteryDrain;

    private int metersDriven = 0;

    public int getMetersDriven() {
        return metersDriven;
    }

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return this.metersDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.metersDriven += speed;
            this.battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
