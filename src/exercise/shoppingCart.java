package exercise;

public class shoppingCart {
    public static void main(String[] args)
    {
//        Scanner input  = new Scanner(System.in);
//
//        System.out.println("Enter your First Name");
//        String firstName = input.nextLine();
//
//        System.out.println("Enter your Last Name");
//        String lastName = input.nextLine();
//
//        System.out.println("Enter your Age");
//        String age = input.nextLine();
//
//        System.out.println("My name is " + firstName + " "+ lastName + " "+ " am "+ age + " "+"years old and i go to school");

        ItemCart item1 = new ItemCart();
        ItemCart item2 = new ItemCart();

        item1.name = "Bead";
        item2.unitPrice = 1_700;

        item2.name = "Egg";
        item2.unitPrice = 200;

        System.out.println(item2.toString());

    }
}
