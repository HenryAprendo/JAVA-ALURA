
public class TestConexionDos {
	public static void main(String[] args) throws Exception {
		
		//Try with resources and AutoCloseable. Garantiza el cierre de la conexión
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		
		/* Conexion con = null;
		try {
			con = new Conexion();	//No genera la instancia por que el constructor lanza la excepción
			con.leerDatos();
		} catch (IllegalStateException ex) {
			ex.printStackTrace();
			
		} finally {
			System.out.println("Ejecutando finally");
			if (con != null) {
				con.cerrar();
			}
		} */
		
	}
}


/**
 * A diferencia de la clase TestConexion, con esta implementación si podemos atrapar el error en el catch y finalizar de acuerdo 
 * al valor de con. Todo esto cuando lanzamos nuestra excepción desde el constructor, lo cual hace que se explote al momento de hacer 
 * la instancia con new Conexion();. Tambien evitamos un nullpointerException por un valor nulo de con.
 * */
 