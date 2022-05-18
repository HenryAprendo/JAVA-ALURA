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
	
	//Sobre-escritura de m�todos.
	//La palabra reservada super, me permite acceder a m�todos de la clase padre.
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + super.getBonificacion();
	}
}
