
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
		}
		System.out.println("Fin del m�todo2");
	}
}
