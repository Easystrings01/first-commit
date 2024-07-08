package project1;

import java.util.Scanner;

public class SuperMarket {
    static Customer customer = null;
    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    private static void createCustomer(){
        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.print("Enter Phone No: ");
        String phoneNo = input.next();

        System.out.print("Enter Address: ");
        String address = input.next();

        customer = new Customer(phoneNo, name, address);
    }
    public static void main(String[] args) {
        int trials = 0;

        while(trials < 3){
            System.out.print("\n[1]: New Customer\n[2]: Shop\n" +
                    "[3]: Customer Details\n[4]: Change Address\n" +
                    "[#]: Quit\nEnter option: ");

            char option = input.next().charAt(0);
            if (option == '1'){
                createCustomer();
            }else if (option == '2'){
                if(customer != null){
                    customer.shop();
                }
                else{
                    createCustomer();
                    customer.shop();
                }
            } else if (option == '3') {
                if (customer != null) {
                    customer.displayCustomer();
                } else {
                    System.out.println("To view customer details, complete option 1..");
                    trials ++;
                }
            } else if (option == '4') {
                if (customer != null) {
                    System.out.print("Enter New Address: ");
                    String newAddress = input.next();
                    customer.setAddress(newAddress);
                } else {
                    System.out.println("To change address, complete option 1..");
                    trials ++;
                }
            }else if(option == '#'){
                System.out.println("Shop process terminated!...");
                break;
            }
            else {
                System.out.println("Invalid option...");
                trials ++;
            }
        }
    }
}
