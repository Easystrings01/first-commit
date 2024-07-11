package inheritance.concreate;

import inheritance.abs.AutoMobile;
import inheritance.abs.Cargo;

public class Car extends AutoMobile {
    private int doors;
    private boolean ac, trunk, roof;

    public Car(String chasisNo, int wheels, int seats, int doors, boolean ac, boolean trunk, String brand) {
        super(chasisNo, wheels, seats, brand);
        this.doors = doors;
        this.ac = ac;
        this.trunk = trunk;
        //this.roof = roof;

    }

    //public boolean isRoof() {
      //  return roof;
    //}

    //public void setRoof(boolean roof) {
      //  this.roof = roof;
    //}

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

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public void reverse(){
        System.out.println(this.getBrand() + " is reversing...");
    }

    @Override
    public void carryCargo(Cargo cargo) {
        if (this.trunk)
            System.out.println(this.getBrand() + " is carrying " + cargo.toString() + " in its trunk");
    }
}
