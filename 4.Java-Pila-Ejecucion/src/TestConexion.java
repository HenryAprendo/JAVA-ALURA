
public class TestConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();

		try {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Recibiendo excepci�n");
			ex.printStackTrace();
			
		} finally {
			System.out.println("Ejecutando finally");
			con.cerrar();
		}
		
		System.out.println("Continuando con mi programa");
	}
}

/**
 * En esta implementaci�n si se lanza una excepci�n en el constructor, la conexi�n inicia pero nunca termina porque nunca se alcanza a
 * instanciar con, por tanto, para este caso la mejor implementaci�n es la TestConexionDos, que la hace dentro de un try / catch.
 * */


/**
 * Toda conexi�n que abrimos para enviar o traer datos de otros sistemas siempre debemos cerrarlas.
 * Incluso cuando existe una excepci�n. Para esto usamos el try, catch y finally, si o si fanally siempre se va a ejecutar
 * */