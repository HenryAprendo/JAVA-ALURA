public class LanzandoExcepciones {
	public static void main(String[] args) {
		System.out.println("Init method Main");
		firstMethod();
		System.out.println("Throw Exception");	
	}
	
	public static void firstMethod() {
		System.out.println("Init firstMethod");
		
		try {
			secondMethod();
		}
		catch(MyException me) {
			me.printStackTrace();
		}		
	}
	
	/**
	 * Lanzando excepciones con throw
	 * */
	public static void secondMethod() {
		System.out.println("Init secondMethod");
		//throw new ArithmeticException("Surgio un nuevo error");
		throw new MyException("Mi excepción fue lanzada");
	}
}
/** 
 * Si MyException Extiende de Exception debemos trabajar de la siguiente manera nuestras exxepciones, caso contrario se trabajaria de la 
 * forma de arriba si MyException extiende de RuntimeException. * 
 * 
 * 
 public class LanzandoExcepciones {
	public static void main(String[] args) {
		System.out.println("Init method Main");
		
		try {
			firstMethod();
		}
		catch(MyException me) {
			me.printStackTrace();
		}	
		
	}
	
	public static void firstMethod() throw MyException {
		System.out.println("Init firstMethod");
		try {
			secondMethod();
		}
		catch(MyException me) {
			me.printStackTrace();
		}
		
	}
		
	public static void secondMethod() throw MyException {
		System.out.println("Init secondMethod");
		//throw new ArithmeticException("Surgio un nuevo error");
		throw new MyException("Mi excepción fue lanzada");
	}
 * 
 * 
 * 
 * **/
