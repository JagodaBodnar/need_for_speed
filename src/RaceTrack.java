public class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        do{
            car.drive();
        }while(car.getMetersDriven() < this.getDistance() && !car.batteryDrained());
        return  car.getMetersDriven() >= this.getDistance();
    }
}
