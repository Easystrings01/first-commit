package overloadingconstructor;

public class foods {
    public static void main(String[] args) {

        pizza pizza = new pizza("thicc crust","tomato","mozzerela","pepperoni");

        System.out.println("Here are the ingredient of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        pizza = new pizza("thicc crust","tomato","mozzerela");

        System.out.println("Here are the ingredient of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        pizza = new pizza("thicc crust","tomato");

        System.out.println("Here are the ingredient of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        pizza = new pizza("thicc crust");

        System.out.println("Here are the ingredient of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


    }
}
