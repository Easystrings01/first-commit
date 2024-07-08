package ClassesAndObject;

public class LessonPlan {
    public static void main(String[] args) {
        Plan cessna172 = new Plan(4,140,55.5f,7.9,89.5f); // create object of class Aircraft

        Plan piperSaratoga = new Plan(9,259,102.9f,12.7,105);

        Plan oceanViwe = new Plan(25,159,290,23.5,389);

//        System.out.println("Cessna 172:");
//        cessna172.calculateEndurance();
//
//        System.out.println("\nPiper Saratoga:");
//        piperSaratoga.calculateEndurance();

        System.out.println("Cessna 172 Endurance is:" + cessna172.calculateEndurance());

        double enduranceSeratoga = piperSaratoga.calculateEndurance();

        System.out.println("\nPipersartoga Endurance is: " + enduranceSeratoga);

        System.out.println("Ocean view  Endurance is:" + oceanViwe.calculateEndurance());

        System.out.println("for cessna 172 to fly for 2.5 hours, it takes " + cessna172.fuelNeeded(2.5) + "gallons of fuel");



    }
}

class Plan {
    int passengers;
    int cruiseSpeed;
    float fuelCapacity;
    double fuelBurnRate;
    double length;

    public Plan(int passengers, int cruiseSpeed, float fuelCapacity, double fuelBurnRate, double length) {
        this.passengers = passengers;
        this.cruiseSpeed = cruiseSpeed;
        this.fuelCapacity = fuelCapacity;
        this.fuelBurnRate = fuelBurnRate;
        this.length = length;
    }

    double calculateEndurance() {
        double endurance;

        endurance = fuelCapacity / fuelBurnRate;

        return endurance;
    }

    double fuelNeeded(double time) {
        return fuelBurnRate * time;
    }
}
