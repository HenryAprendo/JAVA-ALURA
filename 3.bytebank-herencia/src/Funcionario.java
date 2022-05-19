
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	
	//Método constructor
	public Funcionario() {
		
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario += salario;
	}
	
	//Bonificación
	public double getBonificacion() {
		System.out.println("Ejecutando desde Funcionario");
		return this.salario * 0.05;
	}
	
}


















