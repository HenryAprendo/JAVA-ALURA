
public class Encapsulamiento {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Orlando");
		
		Cuenta cuenta = new Cuenta(1120);
		cuenta.setTitular(cliente);
		
		String nombre = cuenta.getTitular().getNombre();
		System.out.println("El nombre del titular de la cuenta es: " + nombre);
		
	}
}
