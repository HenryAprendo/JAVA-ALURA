
public class FuncionConstructor {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(999);
		
		System.out.println(cuenta.getAgencia()); 
		
		//En este caso el modelo de negocio no permite introducir números negativos para agencia, y devuelve un mensaje indicandolo.
		//Sin embargo, tambien devuelve cero y esto sucede por que cuando se genera la instancia cuenta, ésta inicializa todos sus atributos.
		//Es necesario entonces el uso de un constructor, que me exige al momemnto de instanciar que le envie los valores de mis atributos.
		//Y dentro del constructor poder hacer la validación de estos argumentos enviados.
	}
}
