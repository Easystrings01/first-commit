public class Array {
    public static void main(String[] args) {

        String name [] ={"Bread", "Suger","Beans", "Rice"};

        String [] namesB;
        namesB = new String[4];
        namesB[0] = "Bread";
        namesB[1] = "Suger";
        namesB[2] = "Beans";
        namesB[3] = "Rice";

        //for (int i = 0; i < name.length; i++);
        //System.out.println(name[i]);

        System.out.println(name.length);
        System.out.println(name[2]);
        System.out.println(namesB.length);
        System.out.println(namesB[3]);

        System.out.println("======LOOPS=================");

        float itemPrice[] = {54,78.9f,90,34.5f,23.9f};

        for (int i = 0; i < itemPrice.length; i++)
            System.out.println(itemPrice[i]);

        for (float num:itemPrice){
            System.out.println(num);
        }


        int[] sizes = {4,18,5,20};
        for (int size: sizes){
            if (size > 16) break;
            System.out.println("size: "+size +" ,");
        }

    }
}
