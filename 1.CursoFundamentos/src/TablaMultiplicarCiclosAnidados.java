
public class TablaMultiplicarCiclosAnidados {
	public static void main(String[] args) {
		for (int iterador = 0; iterador <= 10; iterador++) {
			for (int multiplicar = 0; multiplicar <= 10; multiplicar++ ) {
				System.out.print(iterador * multiplicar);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
