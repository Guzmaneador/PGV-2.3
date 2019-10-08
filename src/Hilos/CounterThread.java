package Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dama
 */
public class CounterThread extends Thread {
    String name;

    public CounterThread(String name) {
        super();
        this.name = name;
    }
    public void run(){
        int count = 0;
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(CounterThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(count == 100){
                count = 0;
                System.out.println(name+":"+ count++);
                
            }
        }
    }
    
}
