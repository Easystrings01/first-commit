package Home;

public class Array {
    public static void main(String[] args) {
        int nums1 [] = {3,7,4,7,9};
        nums1[1] = 6;

        System.out.println(nums1[1]);


        int  num1 [] = new int [5];
        num1[0] = 4;
        num1[1] = 2;
        num1[2] = 8;
        num1[3] = 5;
        num1[4] = 3;

        for (int i = 0; i<=4; i++)
         System.out.println(num1[i]);
        System.out.println("-------end code----------------");
        System.out.println("-------multi-dimensional -Array --------------");

        int nums[][] = new int[3][4];

        for (int b = 0; b < nums.length; b++) {
            for (int j = 0; j < 4; j++) {
                nums[b][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }
        for (int n[] : nums){
            for(int m:n){
                System.out.println(m + " ");
            }
            System.out.println();
        }
    }
}
