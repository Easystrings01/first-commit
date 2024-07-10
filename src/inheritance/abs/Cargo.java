package inheritance.abs;


public class Cargo {
    String name;
    float weight;

     // first constructor
   public Cargo() {
    }

    //second constructor
    public Cargo(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name +", " + this.weight + "kg";
    }
}
