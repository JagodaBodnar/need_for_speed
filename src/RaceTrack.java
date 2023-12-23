public class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean condition = car.getMetersDriven() >= this.getDistance();
        for (int i = car.getBattery(); i >= 0; i--) {
            if (car.batteryDrained() || car.getMetersDriven() >= getDistance()) {
                return condition;
            }
            car.drive();
        }
        return condition;
    }
}
