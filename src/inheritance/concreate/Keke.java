package inheritance.concreate;


import inheritance.abs.AutoMobile;
import inheritance.abs.Cargo;

public class Keke extends AutoMobile {
    public Keke(String chasisNo, int wheels, int seats, String brand) {
        super(chasisNo, wheels, seats, brand);
    }

    @Override
    public void carryCargo(Cargo cargo) {
        System.out.println(this.getBrand() + " is carrying " + cargo.toString() + " on its seats");
    }

    public void reverse(){
        System.out.println(this.getBrand() + " is reversing...");
    }
}
