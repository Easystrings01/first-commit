package inheritance.concreate;


import inheritance.abs.AutoMobile;

public class Keke extends AutoMobile {
    public Keke(String chasisNo, int wheels, int seats, String brand) {
        super(chasisNo, wheels, seats, brand);
    }

    public void reverse(){
        System.out.println(this.getBrand() + " is reversing...");
    }
}
