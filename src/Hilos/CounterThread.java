package Hilos;



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
    @Override
    public void run(){
        int count = 0;
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if(count == 100)
                count = 0;
             System.out.println(name+":"+ count++);
                
            
        }
    }
    
}
