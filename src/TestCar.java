public class TestCar {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);
        var nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.printf("Distance driven by nitro car: %d%n", nitroCar.distanceDriven());
        
        System.out.println("-----------------------------------------------------------");
        int distance = 100;
        var race = new RaceTrack(distance);
        car.distanceDriven();
        boolean hasFinished = race.tryFinishTrack(car);
        int distanceDriven = car.distanceDriven();
        System.out.printf("Can finish track: %s%nDistance driven: %d%n", hasFinished, distanceDriven);
        
        System.out.println("-----------------------------------------------------------");
        int distance2 = 1000;
        var race2 = new RaceTrack(distance2);
        car.distanceDriven();
        boolean hasFinished2 = race2.tryFinishTrack(car);
        int distanceDriven2 = car.distanceDriven();
        System.out.printf("Can finish track: %s%nDistance driven: %d%n", hasFinished2, distanceDriven2);
        
        System.out.println("-----------------------------------------------------------");

        int distance3 = 250;
        var race3 = new RaceTrack(distance3);
        car.distanceDriven();
        boolean hasFinished3 = race3.tryFinishTrack(car);
        int distanceDriven3 = car.distanceDriven();
        System.out.printf("Can finish track: %s%nDistance driven: %d%n", hasFinished3, distanceDriven3);
    }
}
