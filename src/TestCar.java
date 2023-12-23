public class TestCar {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        var nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.printf("Distance driven by nitro car: %d%n", nitroCar.distanceDriven());
        System.out.println("-----------------------------------------------------------");
        int distance = 250;
        var race = new RaceTrack(distance);
        car.distanceDriven();
        boolean hasFinished = race.tryFinishTrack(car);
        int distanceDriven = car.distanceDriven();
        System.out.printf("Can finish track: %s%nDistance driven: %d", hasFinished, distanceDriven);
    }
}
