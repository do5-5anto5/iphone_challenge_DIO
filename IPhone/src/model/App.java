package model;

public interface App<T> {
    
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
    
    public boolean isMapped (T obj);
}
