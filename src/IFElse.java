import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

//        if(age >= 18 or age < 73){
//            System.out.println("You are welcome!");
//        }else if(age >= 73) {
//            System.out.println("You are too old for this!");
//        }else{
//            System.out.println("Go back home!");
//        }
        age = (int) (Math.ceil(age / 18.0));
        switch (age){
            case 1:
                System.out.println("Go back home..");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("You are welcome!");
                break;
            default:
                System.out.println("You are too old for this!");
        }
    }
}
