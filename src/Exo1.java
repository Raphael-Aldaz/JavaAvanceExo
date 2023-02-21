import java.util.Date;

public class Exo1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Date date = null;
//		Date today = new Date();
//		System.out.println(date.getClass().getName());
//		System.out.println(today.getClass().getName());
//	}
	
/**
 * - 1er probleme : date est définie a null donc impossible d'acceder a la class Date et donc a ces methodes
 * - 2ieme probleme : il ne gere pas les erreurs et notaments les exceptions, du coup notre programme s'arrete au premier syso
 * 	
 * La methode getClass() vient du fait que nous avons instancié 2 objets dates elle represente  la runtimeclass de cet objet
 * 
 */
	
	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
			try {
				System.out.println(date.getClass().getName());
				System.out.println(today.getClass().getName());
			} catch (NullPointerException e) {
				System.out.println(e);
				date = new Date();
			}
			finally {
				System.out.println(date);
				System.out.println(today);
			}
	}
}
