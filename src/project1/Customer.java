package project1;

import java.util.Scanner;

public class Customer {
    String phoneNo;
    String name;
    String address;
    boolean billingInfo;
    int orderNo;
    Cart cart;

    static Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Customer(String phoneNo, String name,
                    String address) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.address = address;
    }

    public double requestDiscount(){

        return 0.05;
    }

    public void setAddress(String address){
        this.address = address;
        System.out.println("Address changed!");
    }

    public void displayCustomer(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone No: " + this.phoneNo);
    }

    public void shop(){
        this.cart = new Cart("2024-06-05");
        int trials = 0;

        while(trials < 3) {
            System.out.print("\n[1]: Add to Cart\n[2]: Checkout\n" +
                    "[3]: Cancel\nEnter option: ");

            int option = input.nextInt();
            switch (option){
                case 1:
                    this.cart.addItem();
                    break;
                case 2:
                    if(this.cart.items != null) {
                            if (this.cart.items.length > 0){
                            if (this.cart.total >= 20_000)
                                this.cart.checkOut(this.requestDiscount());
                            else
                                this.cart.checkOut(0);
                            break;
                        }else{
                                System.out.println("Cart is empty!");
                            }
                    }else{
                        System.out.println("Cart is empty!");
                    }
                    break;
                case 3:
                    this.cart.cancel();
                    break;
                default:
                    System.out.println("Invalid option selected!");
                    trials += 1;
            }
        }
    }
}
