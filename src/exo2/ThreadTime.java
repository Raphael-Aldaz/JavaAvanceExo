package exo2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

  public static void main(String[] args) {
    
    Thread thread = new Thread(new MonRunnable(1000));

    
   
    
    thread.start();
  }

  private static class MonRunnable implements Runnable {
	  DateFormat df = new SimpleDateFormat("HH:mm:ss");
    private long delai;
    public MonRunnable(long delai) {
      this.delai = delai;
    }

    @Override
    public void run() {
    	while(true) {
    		String date1 = df.format(new Date());
	      try {
	        Thread.sleep(delai);
	        System.out.print("\r" + date1);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}
