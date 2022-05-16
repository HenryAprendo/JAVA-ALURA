
public class AtributosPrivados {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		
		cuenta.setAgencia(-101);	
		System.out.println(cuenta.getAgencia());
		
		cuenta.setAgencia(101);
		System.out.println(cuenta.getAgencia());
		
		//Acceso a atributos privados por medio de los métodos getters y setters
	}
}
