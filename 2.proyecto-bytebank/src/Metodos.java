
public class Metodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
		System.out.println(miCuenta.saldo);
		miCuenta.depositar(5000);
		
		System.out.println(miCuenta.saldo);

	}
}
