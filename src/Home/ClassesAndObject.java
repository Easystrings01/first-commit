package Home;

public class ClassesAndObject {
    public static void main(String[] args) {
        Aircraft cessna172 = new Aircraft(); // create object of class Aircraft

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 7.9;
        cessna172.length = 89.5f;

        Aircraft piperSaratoga = new Aircraft();

        piperSaratoga.passengers = 9;
        piperSaratoga.cruiseSpeed = 259;
        piperSaratoga.fuelCapacity = 102.9;
        piperSaratoga.fuelBurnRate = 12.7;
        piperSaratoga.length = 105;

        System.out.println("Cessna 172:");
        cessna172.calculateEndurance();

        System.out.println("\nPiper Saratoga:");
        piperSaratoga.calculateEndurance();
    }
}

class Aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    double length;

    void calculateEndurance() {
        double endurance;

        endurance = fuelCapacity / fuelBurnRate;
        System.out.println("The endurance is " + endurance + " hours.");
    }
}
