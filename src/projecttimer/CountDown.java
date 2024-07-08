package projecttimer;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("==== Timer ===\n");

        System.out.println("Set your time(hrs): ");
        int hr = input.nextInt()-1;
        for (;hr >= 0; hr --){
            for (int min = 59; min > 0; min--){
                for (int sec = 59; sec > 0; sec--){
                    try{
                        Thread.sleep(1000);
                        if (hr ==0)

                            System.out.println(min + "min: "+ sec +"sec");
                        else
                            System.out.println(hr + "hr: "+min + "min: "+sec+ "sec");
                    }catch (InterruptedException e){
                        System.out.println("Timer interrupted...");;
                    }

                }
            }
        }
    }
}
