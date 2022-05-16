
public class Referencias {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(200);
		System.out.println("El saldo de primeraCuenta es: " + primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta;	
		System.out.println("El saldo de segundaCuenta es: " + segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(500);;
		System.out.println("El saldo de primeraCuenta es: " + primeraCuenta.getSaldo());

		//En este caso segundaCuenta es una referencia a primeraCuenta, por lo cual ambas hacen referencia al mismo y unico objeto tipo
		//Cuenta creado en memoria. De tal forma que al modificar el valor del saldo por parte de segundaCuenta tambien primeraCuenta se  
		//ve afectada.
		// En el ejemplo de arriba imprime: 200, 200, 700 este ultimo por el cambio de segundaCuenta.
		
		
		System.out.println("El número de referencia en memoria es: " + primeraCuenta);
		System.out.println("El número de referencia en memoria es: " + segundaCuenta);
		
		//En ambos casos imprime Cuenta@5acf9800 que es la posición en memoria del objeto, confirmando que referencian al mismo objeto.

		if (primeraCuenta == segundaCuenta) {
			System.out.println("Si son el mismo objeto");
		}
	}
}
