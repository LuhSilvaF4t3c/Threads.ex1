package ex1;

public class MinhaRunnable implements Runnable {

	public void run() { 
        String name = Thread.currentThread().getName();
        System.out.println(name);
        
    }
}
