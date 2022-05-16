package 
public class Examen_16m_primo {

	public static void main(String[] args) {
		
		
		System.out.println("Buenos dias Ceinmark, soy Ariana Hoyos. Introduce un nuemos por teclado:");
		public static boolean esPrimo(int numero) {
			 
			  if (numero == 0||numero == 1||numero == 4) {
			    return false;
			  }
			  for (int x = 2; x < numero / 2; x++) {
			    
			    if (numero % x == 0)
			      return false;
			  }
			  
			  return true;
			}
		

	}


