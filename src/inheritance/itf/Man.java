package inheritance.itf;

public class Man implements IFish{
    String name;
    @Override
    public void swim() {
        System.out.println(this.name + " is swimming atlantic ocean..");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping..");
    }
}
