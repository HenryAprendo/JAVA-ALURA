
public class EjemploCaracteres {

	public static void main(String[] args) {
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);   	//Imprime A porque el 65  es el código ASCII de la letra A mayuscula
		
		caracter = '1';
		System.out.println(caracter);
		
		caracter = 65 + 10;
		System.out.println(caracter);  		//Imprime K
		
		char segundoCaracter = (char) (caracter + 1);  		//1 es un entero, hacemos Cast para que sea char el conjunto.
		System.out.println(segundoCaracter); 
		
		
		String palabra = "alura cursos online";
		System.out.println(palabra); 
		
		palabra = palabra + " 2022";
		System.out.println(palabra); 
	}
}
