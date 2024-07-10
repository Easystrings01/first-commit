package inheritance.concreate;

import inheritance.abs.AutoMobile;

public class Okada extends AutoMobile {

    public Okada(String chasisNo, int wheels, int seats, String brand) {
        super(chasisNo, wheels, seats, brand);
    }
}
