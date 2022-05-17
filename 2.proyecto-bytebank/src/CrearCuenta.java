
public class CrearCuenta {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta(1510);
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(1511);
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
		
		//NOTA, EL NUMERO QUE SE ESTA ENVIANDO AL GENERAR LA INSTANCIA ES LA AGENCIA
	}
}
