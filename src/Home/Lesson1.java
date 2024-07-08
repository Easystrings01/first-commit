package Home;

/* In the main method,ask the user to separately input two integers from 1 to 100.
    store the user input into variables. create a method that will take as parameters
    these two values and determine which one is the larger number. The method will then return
    the larger of the two numbers and display the answer to the user.
 */

public class Lesson1 {
    public static void main(String[] args) {
        int num1 = 11;
        int answer;

        //answer = multNumbers(num1);
        System.out.println("this result is" + multNumbers(num1));


    }
    public static int multNumbers(int a) {
        return (a * 7);

    }
}
