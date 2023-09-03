package model;

public interface App {
    
    public void start();
    public void close();
    
    public default void simulateTimeCharge() {
    	try {
    		Thread.sleep(1200);
    	}
    	catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
