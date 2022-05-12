
public class Scope {
	public static void main(String[] args) {
		int iterador = 0;
		int total = 0;
		
		while (iterador <= 10) {
			total += iterador;			
			iterador++;
		}
		
		System.out.println("El total de la suma de los numeros del 1 al 10 es: " + total);
		
		iterador = 0;
		
		while (iterador <= 10) {
			int total2 = 0;
			iterador++;	
			System.out.println(total2);		//Imprime cero siempre. 
		}
		
		
		
		
	}
}
