package overloadingconstructor;

    public class pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    public pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    public pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;


    }

    public pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;


    }

    public pizza(String bread) {
        this.bread = bread;



    }

    public class car{
        String make = "Ford";
        String model = "Mutang";
        String color = "Red";
        int year = 2021;




    }

}