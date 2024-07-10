package inheritance.abs;

import inheritance.concreate.*;

public class AutoMain {
    public static void main(String[] args) {
        Okada okada = new Okada("AV134G5", 2, 2, "Bajaj");

        Keke keke = new Keke("BVS82733", 3, 3, "BVS");

        Car car = new Car("BZ87787", 4, 5, 4, true, true,"Lexus");

        Truck truck = new Truck("BNE3434343",4,4,"Sino",4,true,true,true,true);

         // first constructor
//        Cargo l = new Cargo();
//        l.name = "Cement";
//        l.weight = 50000f;
//        Okada.carryCargo(l);

        // object of okada// second constructor
        okada.carryCargo(new Cargo("Sand", 500f));
        okada.move();
        okada.stop();
        System.out.println();
        System.out.println("====================");


        // object of keke
        keke.carryCargo(new Cargo("Passenger", 250f));
        keke.move();
        keke.reverse();
        keke.stop();
        System.out.println();

        System.out.println("====================");
        // object of a car
        car.carryCargo(new Cargo("Rice", 50f));
        car.move();
        car.reverse();
        car.stop();



        System.out.println("====================");
        // object of a Truck
        truck.carryCargo(new Cargo("Cement",30000f));
        truck.move();
        truck.reverse();
        truck.stop();



    }
}
