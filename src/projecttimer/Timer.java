package projecttimer;

import java.util.Date;

public class Timer {
    public static void main(String[] args) {

        Date date = new Date();

        long hr = date.getHours();
        long min = date.getMinutes();
        long sec = date.getSeconds();

        for (;hr < 24; hr++){
            for (;min < 60; min++){
                for (;sec < 60; sec++){
                    try{
                        Thread.sleep(1000);
                        System.out.println(hr+"hr: "+min+"min: "+sec+"sec");
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
                sec = 1;
            }
            min = 1;
        }
    }
}
