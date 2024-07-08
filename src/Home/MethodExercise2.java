package Home;

import java.util.Scanner;

/*
    In the main method, ask the user to separately input two(2) integers from 1 to 100. Store the user input into variables.
    create a method that will take as parameters these two values and determine which one is the larger number.
    The method will then return the large of the numbers and display the answer to the user
 */
public class MethodExercise2
{
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int number1 = 1;
        int number2 = 1;
        int largerNum = 1;
        System.out.println("Enter number between 1 and 100");
         number1 = input.nextInt();

        System.out.println("Enter another number between 1 and 100 ");
        number2 = input.nextInt();

        largerNum = numberCompare(number1, number2);
        System.out.println("You enter the numbers: " + number1 + " and " + number2);
        System.out.println("The larger number is: " + largerNum);

    }

    public static int numberCompare(int num1, int num2) {
        if(num1 >= num2) return num1;
        else return num2;
    }
}

 */

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int number1, number2, number3;

    System.out.println("Enter a number between 1 and 100:");
    number1 = input.nextInt();
    if (number1 < 1 || number1 > 100) {
        System.out.println("Invalid input. Please enter a number between 1 and 100.");
        return; // Exit the program if the input is invalid
    }

    System.out.println("Enter another number between 1 and 100:");
    number2 = input.nextInt();
    if (number2 < 1 || number2 > 100) {
        System.out.println("Invalid input. Please enter a number between 1 and 100.");
        return; // Exit the program if the input is invalid
    }

    System.out.println("Enter another number between 1 and 100:");
    number3 = input.nextInt();
    if (number3 < 1 || number3 > 100) {
        System.out.println("Invalid input. Please enter a number between 1 and 100.");
        return; // Exit the program if the input is invalid
    }

    int AverageNum = numberAverage(number1,number2,number3);
    System.out.println("You entered the numbers: " + number1 + " and " + number2 + " and " + number3);
    System.out.println("The Average number is: " + AverageNum);
}

public static int numberAverage(int num1 ,int num2,int num3) {
    return ( num1 + num2 + num3)/3;
}
}