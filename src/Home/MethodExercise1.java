package Home;

import java.util.Scanner;

/*
    in the main method, ask the user to input a season by entering a number (1 = spring, 2 = Summer, 3 = Fall, 4 = Winter)
    depending on what number the user enters,call one of the four(4) methods named and described as follows:
        PrintSpring:
            In this method, display "The season is Spring, and flowers are blooming"
        PrintSummer:
            In this method, display "The season is Summer, and is getting hot"
        PrintFall:
            In this method, display "The season is Fall, and the leaves are falling"
        PrintWinter:
            In this method, display "The season is Winter, and it is snowing "
 */
public class MethodExercise1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 1 = spring, 2 = Summer, 3 = Fall, 4 = Winter");
        int number =input.nextInt();

        if (number ==1) {
            printSpring();
        }else if(number ==2) {
            printSummer();
        }else if(number ==3) {
            printFall();
        }else if(number ==4) {
            printWinter();
        }else {
            System.out.println("Invalid input. Please Enter a number between 1 to 4");
        }

    }

    public static void printSpring()
    {
        System.out.println("The season is Spring, and flowers are blooming");

    }
    public static void printSummer() {
        System.out.println("The season is Summer, and is getting hot");

    }
    public static void printFall() {
        System.out.println("The season is Fall, and the leaves are falling");
    }

    public static void printWinter() {
        System.out.println("The season is Winter, and it is snowing ");


    }
}
