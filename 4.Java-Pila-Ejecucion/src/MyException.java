
public class MyException extends RuntimeException{
	
	public MyException(){
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
}


/**
 * 
 * Jerarquias entre clases:
 * ArithmeticException extend RuntimeException 
 * RuntimeException extend exception
 * exception extend Throwable
 * 
 * Sin embargo no podemos extender directamente de Throwable, porque este objeto está definido por Java solo para manejar dos cosas:
 * Los errores internos de la JVM como StackOverFlow y las excepciones en nuestro programa.
 */

/**
 * Si extendemos de Exception directamente, entonces debemos decirle al método explicitamente que lanze la excepción de lo contrario 
 * no compilaria nuestro codigo, por tanto es del tipo checked. Debe ser verificada o tratada para que pueda compilar.
 *  
 * public class MyException extends Exception{
	
	public MyException(){
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
	}
 *
 * */

/**
 * Si extendemos de RuntimeException, entonces las excepciones son del tipo unchecked o no verificadas. En este caso el compilador no esta 
 * obligado a verificar si la excepción esta siendo lanzada o no y compila.
 * */











