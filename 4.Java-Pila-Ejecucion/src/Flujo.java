
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio del m�todo main");
		metodo1();
		System.out.println("Fin del m�todo main");
		
	}
	
	private static void metodo1() {
		System.out.println("Inicio del m�todo1");
		metodo2();
		System.out.println("Fin del m�todo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio del m�todo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
	
			/**
			 * Manejo de Excepciones
			 * Try: Intenta hacer...
			 * Catch: Atrapa el error..
			 * 
			 * */
			
			try {
				if (i == 3) {
					int num = 0;
					int resultado = i / num;
					System.out.println(resultado);
				}
				
				String test = null;
				System.out.println(test.toString());
				
			} catch(ArithmeticException | NullPointerException exception) {
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
			
			
		}
		System.out.println("Fin del m�todo2");
	}
}
