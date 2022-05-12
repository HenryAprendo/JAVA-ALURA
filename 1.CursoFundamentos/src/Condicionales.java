
public class Condicionales {
	public static void main(String[] args) {
		int edad = 9;
		int cantidadPersonas = 1;
		
		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}
		else {
			if(cantidadPersonas >= 2) {
				System.out.println("Usted es menor de edad pero tiene permitido su ingreso");				
			}
			else {
				System.out.println("Usted no tiene permitido su ingreso");				
			}
		}
		
		
		//Una forma mas reducida utilizando el operador lógico OR y esprexiones booleanas
		
		boolean esPareja = cantidadPersonas > 1;
		System.out.println("El valor de la condición es: " + esPareja);
		
		boolean puedeEntrar = edad >= 18 || esPareja ;
		
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		} 
		else {
			System.out.println("Usted no tiene permitido su ingreso");
		}
		

		
	}
}
