package Home;

import java.util.Scanner;

public class Whileloop
{
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while (x <= 4){
            System.out.println("in the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");

        System.out.println("---------another code---------------");// another code

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String fName = input.nextLine();

        System.out.println("Enter your last name");
        String lName = input.nextLine();

        System.out.println("Enter your Age");
        String age = input.nextLine();

        System.out.println("Hi My name is " + fName +" " +  lName + " " + "and am " + age +" " + "years old");
    }
}
