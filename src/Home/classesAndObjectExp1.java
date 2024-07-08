package Home;

public class classesAndObjectExp1 {
    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore(534, 0.94, 429, 0.87);  //create object of class groceryStore


        //double sales  = (houstonStore.applesSoldYearly * houstonStore.retailPricePerApple) + (houstonStore.orangesSoldYearly*houstonStore.retailPriceParOrange);
        //System.out.println("Houston store's total Apple sales: $" + sales);


        groceryStore seattleStore = new groceryStore(769,0.86, 846, 0.91);

        //double salesSeattle  = (seattleStore.applesSoldYearly * seattleStore.retailPricePerApple) + (seattleStore.orangesSoldYearly* seattleStore.retailPriceParOrange);
        //System.out.println("Seatle store's total Apple sales: $" + salesSeattle);


        groceryStore orlandoStore = new groceryStore(876, 0.56, 765, 0.29);

        //double salesOrland  = (orlandoStore.applesSoldYearly * orlandoStore.retailPricePerApple) + (orlandoStore.orangesSoldYearly* orlandoStore.retailPriceParOrange);
        //System.out.println("Seatle store's total Apple sales: $" + salesOrland);


        //int totalAppleSold = houstonStore.applesSoldYearly + seattleStore.applesSoldYearly + orlandoStore.applesSoldYearly;
        //int totalOrangeSold = houstonStore.orangesSoldYearly + seattleStore.orangesSoldYearly + orlandoStore.orangesSoldYearly;
        //double totalRetailOrangeSold = houstonStore.orangesSoldYearly * houstonStore.retailPriceParOrange +
                //seattleStore.orangesSoldYearly * seattleStore.retailPriceParOrange +
                //orlandoStore.orangesSoldYearly * orlandoStore.retailPriceParOrange;

        //System.out.println("Total Apple sales for the year: " + totalAppleSold);
        //System.out.println("Total Orange sales for the year: " + totalOrangeSold);
        //System.out.println("Total Retail Orange sales for the year: " + totalRetailOrangeSold);
//        System.out.println("houston store");
//        houstonStore.calculatesales();
//
//        System.out.println("seattle store");
//        seattleStore.calculatesales();
//
//        System.out.println("orlando store");
//        orlandoStore.calculatesales();

        double calculateSalesHouston, calculateSalesSeattle;
        calculateSalesHouston = houstonStore.calculatesales();
        calculateSalesSeattle = seattleStore.calculatesales();

        System.out.println("Revenue for Houston is $" + calculateSalesHouston);
        System.out.println("\nRevenue for Seattle is $" + calculateSalesSeattle);
        System.out.println("\nRevenue for Houston is $" + orlandoStore.calculatesales());
    }
}

class groceryStore {
    int applesSoldYearly;
    double retailPricePerApple;
    int orangesSoldYearly;
    double retailPriceParOrange;

    public groceryStore(int applesSoldYearly, double retailPricePerApple, int orangesSoldYearly, double retailPriceParOrange) {
        this.applesSoldYearly = applesSoldYearly;
        this.retailPricePerApple = retailPricePerApple;
        this.orangesSoldYearly = orangesSoldYearly;
        this.retailPriceParOrange = retailPriceParOrange;
    }

    double calculatesales(){
        double calculateSales;

        calculateSales = (applesSoldYearly * retailPricePerApple) + (orangesSoldYearly * retailPriceParOrange);
        //System.out.println("The total Sales  for the is: $" + calculateSales);

        return calculateSales;

    }

}