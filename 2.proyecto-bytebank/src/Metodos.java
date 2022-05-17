
public class Metodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta(2020);
		miCuenta.depositar(1000);
		System.out.println("El saldo inicial de miCuenta es: " + miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta(2021);
		cuentaDeJimena.depositar(2000);
		System.out.println("El saldo actual de la cuentaDeJimena es: " + cuentaDeJimena.getSaldo());
		
		boolean puedeTransferir = cuentaDeJimena.transferir(500, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("¡Transferencia exitosa!");
		}
		else {
			System.out.println("No fue posible hacer la transferencia");
		}
		
		System.out.println("El saldo de la cuentaDeJimena despues de transferir es: " + cuentaDeJimena.getSaldo());
		
		System.out.println("El saldo de miCuenta despues de recibir la transferencia es: " + miCuenta.getSaldo());
		
	}
}
