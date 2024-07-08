package inheritance;

public class AutoMain {
    public static void main(String[] args) {
        Okada am = new Okada(
                "AV134G5", 8, 4, "Bajaj"
        );
        /*Cargo l = new Cargo();
        l.name = "Cement";
        l.weight = 500f;

        am.carryCargo(l);*/
        am.carryCargo(new Cargo("Sand", 5000f));

        am.move();
        am.stop();

        // Truck creation

        Truck truck = new Truck("AVB1055", 12, 8, "Sino");
        Cargo p = new Cargo();
        p.name = "Suger";
        p.weight = 45f;
    }

}
