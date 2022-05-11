
public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Variables tipo Int o Enteros");
		
		int edad = 9;
		System.out.println("Mi edad es " + edad + " años");
		
		edad = 21;
		System.out.println("Ya tengo " + edad + " años");
		
		edad = 21 + 50;
		System.out.println(edad);
		
		int division = edad / 3;     
		System.out.println(division);   //En este caso imprime 23 solo la parte entera de la operación por ser una variable int
		
		
		System.out.println("Variables tipo Double o punto flotante");
		
		double salario = 1200.50;
		System.out.println(salario);
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad);
		
		double costo = 5000;
		System.out.println(costo);  //Imprime 5000.0 agregando esa parte decimal, que no lo haria con Int
		
		
		double precio = 5.5;
		int tickets = 4;
		System.out.println (precio * tickets);
		
		
		double dividirNumero = 1000 / 3;   // El resultado es 333.0 y no incluye los decimales, aun cuando es una variable tipo double.
		System.out.println (dividirNumero);
		
		double dividirNumeroDos = 1000.0 / 3;   // El resultado es 333.33333333, por haber puesto 1000.0 que es flotante lo cual es lo esperado.
		System.out.println (dividirNumeroDos);
		
		
		
	}
	
}
