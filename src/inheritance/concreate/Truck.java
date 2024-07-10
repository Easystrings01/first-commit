package inheritance.concreate;

import inheritance.abs.AutoMobile;

public class Truck extends AutoMobile {


    private int doors;
    private boolean ac , roof , trunk , bucket;

    public Truck(String chasisNo, int wheels, int seats, String brand , int doors , boolean roof , boolean trunk , boolean ac, boolean bucket) {
        super(chasisNo, wheels, seats, brand);
        this.doors = doors;
        this.ac = ac;
        this.roof = roof;
        this.trunk = trunk;
        this.bucket = bucket;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public boolean isBucket() {
        return bucket;
    }

    public void setBucket(boolean bucket) {
        this.bucket = bucket;
    }

    public void reverse() {
        System.out.println(this.getBrand() + " is reversing...");

    }
}
