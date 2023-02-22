package exo2;

import java.util.Arrays;
import java.util.List;

public class TestRunnable implements Runnable {
	List<String> symbols = Arrays.asList("!","\"","#","%","&","'","(",")","*");
	String str = "*";
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();

	}

	@Override
	public void run() {
		symbols.stream()
		.map(t ->  repeatString(str,symbols.indexOf(t), symbols) )
		.forEach(System.out::println  );
		
		
		//System.out.println(symbols);
	}
	public static String repeatString(String str, int x, List<String> list) {
		 String rep = "";
		 String rep2 =" ";
		 for(int i=0;i<x+1;i++) {
		    rep +=  str ;
		    rep2 = list.get(i) + rep + list.get(i);
		 }
		 return rep2;
	}

}
