package Home.construcror;

public class body {
    public static void main(String[] args) {
        human human = new human("eze",40,75.9);
        human human1 = new human("famofo",35,67.6);

        human.eat();
        human1.drink();


        float itemPrice[] = {54, 78, 90, 34.5f, 23.9f};

        System.out.println("=== base on refrence ===");
        for (float Price : itemPrice){
            System.out.println(Price);
        }
        System.out.println("=== base on element ===");
        for (int i = 0; i < itemPrice.length; i++){
            System.out.println(itemPrice[i]);
        }

    }
}
