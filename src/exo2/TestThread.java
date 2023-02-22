package exo2;

public class TestThread extends Thread {

	public static void main(String[] args) {
		TestThread t  = new TestThread("1-");
		TestThread t2 = new TestThread("2--");
		TestThread t3 = new TestThread("3---");
		TestThread t4 = new TestThread("4----");
		TestThread t5 = new TestThread("5-----");
		
		
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	
	}
	
	public TestThread(String name) {
		super(name);
	}
	
	public  void run() {
		for(int i =0; i<5; i++) {
			if(i%5 == 0) {
				System.out.print("\n");
			}
			System.out.print(this.getName());
			
		}
	}

}