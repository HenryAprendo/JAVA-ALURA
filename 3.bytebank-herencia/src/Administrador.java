
public class Administrador extends Funcionario implements Autenticable {
	
	private String clave;

	@Override
	public double getBonificacion() {
		return 0;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if (this.clave == clave) {
			return true;
		}
		return false;
	}

}
