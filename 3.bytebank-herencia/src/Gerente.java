//Aplicando Herencia y polimorfismo
public class Gerente extends Funcionario {
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		
		if (this.clave == clave) {
			return true;
		}
		return false;
	}
	
	//Sobre-escritura de métodos.
	//La palabra reservada super, me permite acceder a métodos de la clase padre.
	@Override
	public double getBonificacion() {
		return super.getSalario() + super.getSalario() * 0.05;
	}
}
