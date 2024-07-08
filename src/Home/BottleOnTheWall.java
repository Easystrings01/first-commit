package Home;

public class BottleOnTheWall {
    public static void main(String[] args) {
        int numBottles = 10;
        String wordBottle = "bottles"; // Initialize wordBottle outside the loop

        while (numBottles > 0) {
            System.out.println( numBottles + " green " + wordBottle + " standing on the wall,");
            System.out.println(numBottles + " green " + wordBottle + " bottles standing on the wall,");
            System.out.println("and if one green bottle should accidentally fall down,");
            System.out.println("-----");
            numBottles--;

            if (numBottles == 1) {
                wordBottle = "bottle"; // Update wordBottle when there's only one bottle left
            }

            if (numBottles == 0) {
                System.out.println("There are no bottles standing on the wall!");
            }
        }
        System.out.println("------new code----------------");
        System.out.println("I Rule");
        System.out.println("The World");

        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x = " + x);
    }

}

