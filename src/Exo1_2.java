import java.util.Arrays;

public class Exo1_2 {
	public static void main (String[] args) throws Exception{
		/**
		 * Programme retrouve les 2 nombres maximum d'un tableau d'entiers positif ou négatif puis les additionne
		 * 
		 * @author El babili - 2023
		 * 
		 * 
		 * 
		 */
			
				int [] table = { 78, 6, -250, 2, 12, 6 };
				int max1, max2;
				max1 = max2 = Integer.MIN_VALUE;
				
				try {
					for(int i=0 ; i<table.length ; i++) {
						if(table[i] > max1)
							max1 = table[i];
					}
					for(int i=0 ; i<table.length ; i++) {
						if(table[i] > max2 && table[i] != max1)
							max2 = table[i];
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					System.out.println("max1 = " + max1 +" max2 = " + max2);
					System.out.println("max1 + max2 = " + (max1 + max2));
				}

			
				
				try {
					maxTwo(table);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
			public static void maxTwo(int [] nombres) throws Exception {
				
				try {
					Arrays.sort(nombres);
					System.out.println(nombres[nombres.length-2] + nombres[nombres.length-1]);	
				} catch (Exception e) {
				 e.printStackTrace();
				}
					
			}
		
		
	}

