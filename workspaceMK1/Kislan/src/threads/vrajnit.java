package threads;

import main.*;

public class vrajnit extends Thread implements Runnable {



    /**
     * Printing status of the submarine and status of sensors
     *
     *
     * @throws InterruptedException
     */
    public void run(){

        try {
            Alarm.spusti();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
