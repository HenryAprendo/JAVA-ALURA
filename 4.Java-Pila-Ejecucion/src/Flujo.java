
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio del método main");
		metodo1();
		System.out.println("Fin del método main");

	}
	
	private static void metodo1() {
		System.out.println("Inicio del método1");
		metodo2();
		System.out.println("Fin del método1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio del método2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fin del método2");
	}
}
