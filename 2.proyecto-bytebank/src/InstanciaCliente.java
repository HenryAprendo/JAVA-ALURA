
public class InstanciaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("72789906"); 
		cliente.setTelefono("3511089"); 
		
		//En este caso, la instancia cliente es enviada como valor o referencia al atributo titular de la clase Cuenta.
		//De ésta forma estamos relacionando  o referenciando dos instancias de clases entre si.
		
		Cuenta cuentaDeDiego = new Cuenta(1515);
		//cuentaDeDiego.titular = ;
		//System.out.println(cuentaDeDiego.titular.nombre);
		
		//Podemos instanciar objetos Cliente y no inicializarlos. Sin embargo si tratamos de obtener el valor que tendrian,
		//Java nos devolveria null.
		//Ahora si tratamos desde un objeto, cambiar el valor de un atributo de otra referencia sin estar creado o instanciado, 
		//Java nos devolveria un error
		
		Cliente clienteDos = new Cliente();
		//System.out.println(clienteDos.documento); //Imprime null
		
		Cuenta cuentaDeHenry = new Cuenta(1516);
		//cuentaDeHenry.titular = clienteDos;
		//System.out.println(cuentaDeHenry.titular.nombre); // Imprime null
		
		Cuenta cuentaNueva = new Cuenta(1517);
		//System.out.println(cuentaNueva.titular.documento);  //Imprime un error por que no hay una instancia Cliente asociada al atributo titular
		
		
		//Otra forma de referenciar objetos es instanciarlos directamente en el atributo, de esta forma:
		Cuenta otraCuenta = new Cuenta(1518);
		//otraCuenta.titular = new Cliente();
		//otraCuenta.titular.nombre = "Richard";
		//System.out.println(otraCuenta.titular.nombre); 		
		
		
		//Instanciando un objeto Cliente directamente en el atributo titular de la clase asi Cliente titular = new Cliente;
		//De esta forma al instanciar una Cuenta internamente se genera un cliente lo que evita el error java.lang.NullPointerException
		
	}
}














