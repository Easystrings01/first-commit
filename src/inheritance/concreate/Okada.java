package inheritance.concreate;

import inheritance.abs.AutoMobile;
import inheritance.abs.Cargo;

public class Okada extends AutoMobile {

    public Okada(String chasisNo, int wheels, int seats, String brand) {
        super(chasisNo, wheels, seats, brand);
    }

    @Override
    public void carryCargo(Cargo cargo) {
        System.out.println(this.getBrand() + " is carrying " + cargo.toString() + " in its trunk");
    }
}
