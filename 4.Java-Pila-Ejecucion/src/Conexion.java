
public class Conexion implements AutoCloseable{
	public Conexion() {
		System.out.println("Abriendo conexi�n");
		throw new IllegalStateException();
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo datos");
		//throw new IllegalStateException();
	}
	
	public void cerrar() {
		System.out.println("Cerrando conexi�n");
	}

	@Override
	public void close() throws Exception {
		cerrar();
		
	}
}



 