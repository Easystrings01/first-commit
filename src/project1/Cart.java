package project1;

import java.util.Scanner;

public class Cart {
    Item items[];
    String date;
    double total;
    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    static int noOfItems = 0;

    public Cart(String date) {
        System.out.print("How many items do you wish to buy? ");
        noOfItems = input.nextInt();
        this.items = new Item[noOfItems];
        this.date = date;
    }

    public void addItem(){
        for (int i = 0; i < this.items.length; i++){
            this.items[i] = new Item();
            System.out.print("Enter item "+ (i+1) + ": ");     // to keep track of no of items
            this.items[i].name = input.next();

            System.out.print("Enter price: ");
            this.items[i].unitPrice = input.nextDouble();
            this.total += this.items[i].unitPrice;
        }
    }

    public void checkOut(double discount){
        System.out.println("checkout process...");
        System.out.println("======================================");

        for (Item item: items){
            if (item != null)
                System.out.println(item.name + ": "+ item.unitPrice);
        }
        System.out.println("======================================");
        System.out.println("Total: "+ this.total);
        System.out.println("Discount: " + discount);
        System.out.println("Grand Total: " + (this.total - (this.total * discount)));
        System.out.println("======================================");
        this.items = new Item[noOfItems];
    }

    public void cancel(){
        System.out.println("Cancelling order...");
        this.items = new Item[noOfItems];
        System.out.println("Cart now empty!");
    }
}
