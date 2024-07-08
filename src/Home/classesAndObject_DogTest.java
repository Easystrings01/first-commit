package Home;

public class classesAndObject_DogTest {
    public static void main(String[] args) {
    dog one = new dog();
    one.size = 70;
    one.name = "Jakky";


    dog two = new dog();
    two.size = 40;
    two.name = "Bingo";


    dog three = new dog();
    three.size = 14;
    three.name = "Jay Jay";

    one.bark();
    two.bark();
    three.bark();

    }
}



class dog
{
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Woof!");
        }else if(size > 14) {
            System.out.println("Ruff!  Roof");
        }else {
            System.out.println("Yip  Yip");
        }
    }
}

