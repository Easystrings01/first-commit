package Home;

import java.util.ArrayList;

public class Array_ListClass {
    public static void main(String[] args) {

//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("pie");
//
//        //food.set(0,"sushi");
//        //food.remove(2);
//        //food.clear();
//
//        for (int i = 0; i<food.size(); i++){
//            System.out.println(food.get(i));

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();

         ArrayList<String> bakeryList = new ArrayList<>();
         bakeryList.add("pasta");
         bakeryList.add("garlic bread");
         bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("Zuchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");


        grocerylist.add(bakeryList);
        grocerylist.add(produceList);
        grocerylist.add(drinkList);

        System.out.println(grocerylist.get(0).get(2));
        System.out.println(grocerylist.get(1).get(1));
        System.out.println(grocerylist.get(2).get(0));


        }

    }
